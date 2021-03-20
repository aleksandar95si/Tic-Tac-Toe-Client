/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.Osluskivaci.OsluskivacPromena;
import GUI.Osluskivaci.OsluskivacXO;
import Server_client.GenerickiKontrolerServer;
import Server_client.GenerickiKontrolerServer_Service;
import Server_client.TransferObjekat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author aleks
 */
public class KontrolerGUI {

    public FXMLDocumentController fxdc;
    //public String value="";
    public OsluskivacXO xo;
    public OsluskivacPromena op;

    Socket soketK;
    ObjectOutputStream out;
    ObjectInputStream in;

    public TransferObjekat gto;

    GenerickiKontrolerServer_Service service;
    GenerickiKontrolerServer kal;

    public KontrolerGUI(FXMLDocumentController fxdc) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, IOException, FileNotFoundException, ClassNotFoundException {
        this.fxdc = fxdc;
        service = new GenerickiKontrolerServer_Service();
        kal = service.getGenerickiKontrolerServerPort();
        gto = new TransferObjekat();

        this.xo = new OsluskivacXO(fxdc);
        this.fxdc.p00.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p01.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p02.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p10.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p11.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p12.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p20.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p21.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);
        this.fxdc.p22.addEventFilter(MouseEvent.MOUSE_PRESSED, xo);

        new OsluskivacPromena(this).start();
    }

    public void naKlik(TextArea p) {

        gto = kal.pocetnaVrednost(gto);
        System.out.println("1:" + gto.getIgracNaPotezu());
        if (!gto.getIgracNaPotezu().equals("")) {
            System.out.println("4:" + gto.getIgracNaPotezu());
            p.setText(gto.getIgracNaPotezu());
            azurirajPromene(gto.getIgracNaPotezu() + p.getId());

        } else {
            System.out.println("2: " + gto.getIgracNaPotezu());
            p.setText("X");
            //gto.setPoruka("X");
            gto.setIgracNaPotezu("X");
            azurirajPromene("X" + p.getId());
            System.out.println("3:" + proveriPromene());

        }

        kal.prvaMetoda(gto);
        //kal.apdejtujProtivnikovEkran();
    }

    public void azurirajPromene(String poruka) {
        gto.setPoruka(poruka);
        kal.azurirajPromene(gto);
    }

    public TransferObjekat proveriPromene() {
        gto = kal.proveriPromene(gto);
        return gto;
    }

    public void porukaZaKrajIgre() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
                infoAlert.setTitle("Poruka:");
                infoAlert.setHeaderText(null);
                infoAlert.setContentText("Kraj igre! POBEDILI STE!");
                infoAlert.showAndWait();
            }
        });
    }

    public FXMLDocumentController getFXDC() {
        return fxdc;
    }

}
