/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPrijavljivanje;

import GUIPrijavljivanje.Osluskivaci.OsluskivacPrijavljivanje;
import GUIPrijavljivanje.Osluskivaci.OsluskivacRegistrovanje;
import Server_client.KontrolerServer;
import Server_client.KontrolerServer_Service;
import Server_client.Igrac;
import Server_client.TransferObjekat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author aleks
 */
public class KontrolerGUIPrijavljivanje {

    FXMLDocumentController fxcon;

    KontrolerServer_Service service;
    KontrolerServer kal;

    public TransferObjekat gto;

    public KontrolerGUIPrijavljivanje(FXMLDocumentController fxcon) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        this.fxcon = fxcon;
        service = new KontrolerServer_Service();
        kal = service.getKontrolerServerPort();
        gto = new TransferObjekat();

        this.fxcon.prijavljivanje.setOnAction(new OsluskivacPrijavljivanje(this));
        this.fxcon.registrovanje.setOnAction(new OsluskivacRegistrovanje(this));

    }

    public void prijavljivanje() {
   
        Igrac igrac=new Igrac();
        KonverterGUIDK.konvertujGUIUDK(fxcon, igrac, "Prijavljivanje");
        gto.setGdo(igrac);
        igrac = kal.proveraPrijavljivanja(gto).getGdo();
        if (igrac != null) {
            GUIIksOks.IksOksKlijent iksOksKlijent;
            Stage s;
            iksOksKlijent = new GUIIksOks.IksOksKlijent();
            s = new Stage();
            try {
                iksOksKlijent.start(s);
                iksOksKlijent.vratiFXMLkon().kngui.postaviIgraca(igrac);
                fxcon.zatvoriFormu();
                poruka("Igrač je uspešno ulogovan na sistem!");
            } catch (Exception ex) {
                Logger.getLogger(KontrolerGUIPrijavljivanje.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            poruka("Pogresno korisničko ime i/ili sifra!");
        }

    }

    public void registrovanje() {
        
        Igrac igrac=new Igrac();
        KonverterGUIDK.konvertujGUIUDK(fxcon, igrac, "Registrovanje");
        gto.setGdo(igrac);
        if (igrac.getKorisnickoIme().equals("") || igrac.getSifra().equals("")) {
            poruka("Neispravno uneti podaci! Polja za unos podataka ne smeju biti prazna.");
        } else {
            gto = kal.registrovanjeIgraca(gto);

            if (gto.getGdo() == null) {
                poruka("Korisnik sa unetim korisničkim imenom već postoji! Izaberite drugo.");
            } else {
                poruka("Registracija uspešna!");
            }
        }

    }

    public void poruka(String poruka) {
        Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setTitle("Poruka:");
        infoAlert.setHeaderText(null);
        infoAlert.setContentText(poruka);
        infoAlert.showAndWait();
    }

}
