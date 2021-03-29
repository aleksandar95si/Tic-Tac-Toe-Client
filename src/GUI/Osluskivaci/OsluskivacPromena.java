/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Osluskivaci;

import GUI.KontrolerGUI;
import Server_client.TransferObjekat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextArea;

/**
 *
 * @author aleks
 */
public class OsluskivacPromena extends Thread {

    private final KontrolerGUI kongui;

    public OsluskivacPromena(KontrolerGUI kongui) {
        this.kongui = kongui;
    }

    @Override
    public void run() {
        TextArea textArea;
        TransferObjekat gto;
        String poruka = "";
        boolean krajIgre;
        int brojac = 0;
        while (true) {
            try {

                gto = kongui.proveriPromene();
                poruka = gto.getPoruka();
                krajIgre = gto.isSignal();

                if (krajIgre == true) {
                    //System.out.println("KRAJ IGRE");
                    brojac++;
                };

                if (brojac == 1) {
                    kongui.porukaZaKrajIgre();
                }

                if (poruka != null) {
                    Thread.sleep(200);

                    if (poruka.endsWith("p00")) {
                        textArea = kongui.fxdc.p00;
                        textArea.setText(poruka.substring(0, 1));
                    }

                    if (poruka.endsWith("p01")) {
                        textArea = kongui.fxdc.p01;
                        //textArea.setText(kongui.gto.getIgracNaPotezu());
                        textArea.setText(poruka.substring(0, 1));
                    }

                    if (poruka.endsWith("p02")) {
                        textArea = kongui.fxdc.p02;
                        // textArea.setText(kongui.gto.getIgracNaPotezu());
                        textArea.setText(poruka.substring(0, 1));
                    }

                    if (poruka.endsWith("p10")) {
                        textArea = kongui.fxdc.p10;
                        //textArea.setText(kongui.gto.getIgracNaPotezu());
                        textArea.setText(poruka.substring(0, 1));
                    }

                    if (poruka.endsWith("p11")) {
                        textArea = kongui.fxdc.p11;
                        //textArea.setText(kongui.gto.getIgracNaPotezu());
                        textArea.setText(poruka.substring(0, 1));
                    }

                    if (poruka.endsWith("p12")) {
                        textArea = kongui.fxdc.p12;
                        //textArea.setText(kongui.gto.getIgracNaPotezu());
                        textArea.setText(poruka.substring(0, 1));
                    }

                    if (poruka.endsWith("p20")) {
                        textArea = kongui.fxdc.p20;
                        //  textArea.setText(kongui.gto.getIgracNaPotezu());
                        textArea.setText(poruka.substring(0, 1));
                    }

                    if (poruka.endsWith("p21")) {
                        textArea = kongui.fxdc.p21;
                        // textArea.setText(kongui.gto.getIgracNaPotezu());
                        textArea.setText(poruka.substring(0, 1));
                    }
                    //kongui.gto.getPoruka()
                    if (poruka.endsWith("p22")) {
                        textArea = kongui.fxdc.p22;
                        // textArea.setText(kongui.gto.getIgracNaPotezu());
                        textArea.setText(poruka.substring(0, 1));
                    }
                }
                        //git
            } catch (InterruptedException ex) {
                Logger.getLogger(OsluskivacPromena.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
