/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIIksOks;

import GUIIksOks.Osluskivaci.OsluskivacIzlaz;
import GUIIksOks.Osluskivaci.OsluskivacNovaIgra;
import GUIIksOks.Osluskivaci.OsluskivacPromena;
import GUIIksOks.Osluskivaci.OsluskivacStatistikaIgraca;
import GUIIksOks.Osluskivaci.OsluskivacXO;
import Server_client.KontrolerServer;
import Server_client.KontrolerServer_Service;
import Server_client.Igrac;
import Server_client.InterruptedException_Exception;
import Server_client.TransferObjekat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author aleks
 */
public class KontrolerGUIIksOks {

    public FXMLDocumentController fxdc;
    public OsluskivacXO xo;
    public OsluskivacPromena op;

    public TransferObjekat to;
    public Igrac igrac;

    public int brojac = 0;
    public String redniBrojIgraca;
    public KontrolerServer_Service service;
    public KontrolerServer kal;

    public KontrolerGUIIksOks(FXMLDocumentController fxdc) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, IOException, FileNotFoundException, ClassNotFoundException {
        this.fxdc = fxdc;
        service = new KontrolerServer_Service();
        kal = service.getKontrolerServerPort();
        to = new TransferObjekat();
        to = kal.kreirajMatricu(to);
        this.fxdc.izlaz.setOnAction(new OsluskivacIzlaz(this));
        this.fxdc.informacijeOIgracu.setOnAction(new OsluskivacStatistikaIgraca(this));

        this.xo = new OsluskivacXO(this);
        this.fxdc.p00.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p01.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p02.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p10.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p11.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p12.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p20.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p21.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p22.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);

        this.fxdc.novaIgra.setOnAction((new OsluskivacNovaIgra(this)));

        op = new OsluskivacPromena(this);
        op.start();
    }

    public void postaviXO(TextArea polje) throws InterruptedException_Exception {
        if (polje.getText().equals("")) {

            to = kal.igracNaPotezu(to);

            if (to.getIgracNaPotezu().equals("") && brojac == 0) {
                redniBrojIgraca = "igrac1";
                brojac++;
                polje.setText("X");
                to.setIgracNaPotezu("X");
                azurirajMatricu("X" + polje.getId());
            } else {

                if (brojac == 0) {
                    redniBrojIgraca = "igrac2";
                    brojac++;
                }

                if (to.getIgracNaPotezu().equals("X") && redniBrojIgraca.equals("igrac2")
                        || to.getIgracNaPotezu().equals("O") && redniBrojIgraca.equals("igrac1")) {
                    poruka("Protivnik je na potezu!");
                } else {
                    polje.setText(to.getIgracNaPotezu());
                    azurirajMatricu(to.getIgracNaPotezu() + polje.getId());
                }
            }
        } else {
            poruka("Polje je već popunjeno, izaberite drugo!");
        }
    }

    public void azurirajMatricu(String polje) {
        to.setPolje(polje);
        kal.azurirajMatricu(to);
    }

    public TransferObjekat proveriDaLiJeKrajIgre() throws InterruptedException_Exception {
        to = kal.proveriDaLiJeKrajIgre(to);
        return to;
    }

    public void porukaZaKrajIgre(char c) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

                if (c == 'X' && redniBrojIgraca.equals("igrac1")) {
                    poruka("Kraj igre!" + "\n" + "POBEDNIK JE: " + igrac.getKorisnickoIme());
                }

                if (c == 'O' && redniBrojIgraca.equals("igrac2")) {
                    poruka("Kraj igre!" + "\n" + "POBEDNIK JE: " + igrac.getKorisnickoIme());
                }
            }
        });
    }

    public void postaviStatistikuIgraca() {
        to.setGdo(igrac);

        igrac = kal.postaviStatistikuIgraca(to).getGdo();

        poruka("Igrac: " + igrac.getKorisnickoIme() + "\n" + "Broj pobeda: " + igrac.getBrojPobeda() + "\n" + "Broj poraza: " + igrac.getBrojPoraza());
    }

    public void apdejtujStatistikuIgraca(char c) {

        if (redniBrojIgraca.equals("igrac1")) {
            if (c == 'X') {
                postaviBrojPobeda();
                kal.apdejtujStatistikuIgraca(to);
            } else if (c == 'O') {
                postaviBrojPoraza();
                kal.apdejtujStatistikuIgraca(to);
            }
        }
        if (redniBrojIgraca.equals("igrac2")) {
            if (c == 'O') {
                postaviBrojPobeda();
                kal.apdejtujStatistikuIgraca(to);
            } else if (c == 'X') {
                postaviBrojPoraza();
                kal.apdejtujStatistikuIgraca(to);
            }
        }
    }

    public void pokreniNovuIgru() throws InterruptedException {
        brojac = 0;

        for (Field f : fxdc.getClass().getDeclaredFields()) {
            if (f.getType().getName().equals("javafx.scene.control.TextArea")) {
                try {
                    ((javafx.scene.control.TextArea) f.get(fxdc)).setText("");
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(KontrolerGUIIksOks.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(KontrolerGUIIksOks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        to = new TransferObjekat();
        to = kal.kreirajMatricu(to);
        op.resume();
        poruka("Nova igra kreirana!");
    }

    public void postaviBrojPobeda() {
        int brojPobeda = igrac.getBrojPobeda() + 1;
        igrac.setBrojPobeda(brojPobeda);
        to.setGdo(igrac);
    }

    public void postaviBrojPoraza() {
        int brojPoraza = igrac.getBrojPoraza() + 1;
        igrac.setBrojPoraza(brojPoraza);
        to.setGdo(igrac);
    }

    public void postaviIgraca(Igrac igrac) {
        this.igrac = igrac;
    }

    public void poruka(String poruka) {
        Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setTitle("Poruka:");
        infoAlert.setHeaderText(null);
        infoAlert.setContentText(poruka);
        infoAlert.showAndWait();
    }

    public void zatvoriProgram() {
        Platform.exit();
        System.exit(0);
    }
}
