/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIIksOks.Osluskivaci;

import GUIIksOks.KontrolerGUIIksOks;
import Server_client.InterruptedException_Exception;
import Server_client.TransferObjekat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextArea;

/**
 *
 * @author aleks
 */
public class OsluskivacPromena extends Thread {

    KontrolerGUIIksOks kongui; 
    
    public OsluskivacPromena(KontrolerGUIIksOks kongui) {
        this.kongui = kongui;
    }

    @Override
    public void run() {
        TextArea textArea;
        TransferObjekat gto;
        int brojac=0;
        String polje="";
        boolean krajIgre;
        while (true) {
            try {
                Thread.sleep(200);
                
                gto = kongui.proveriDaLiJeKrajIgre();
                krajIgre = gto.isKrajIgre();
                polje = gto.getPolje();
                
                if (krajIgre == true) {
                    brojac++;
                };

                if (brojac == 1) {
                    brojac=0;
                    kongui.porukaZaKrajIgre(polje.charAt(0));
                    kongui.apdejtujStatistikuIgraca(polje.charAt(0));
                    this.suspend();
                    polje="";
               }

                if (polje != null) {
                    
                    if (polje.endsWith("p00")) {
                        textArea = kongui.fxdc.p00;
                        textArea.setText(polje.substring(0, 1));
                    }

                    if (polje.endsWith("p01")) {
                        textArea = kongui.fxdc.p01;
                        textArea.setText(polje.substring(0, 1));
                    }

                    if (polje.endsWith("p02")) {
                        textArea = kongui.fxdc.p02;
                        textArea.setText(polje.substring(0, 1));
                    }

                    if (polje.endsWith("p10")) {
                        textArea = kongui.fxdc.p10;
                        textArea.setText(polje.substring(0, 1));
                    }

                    if (polje.endsWith("p11")) {
                        textArea = kongui.fxdc.p11;
                        textArea.setText(polje.substring(0, 1));
                    }

                    if (polje.endsWith("p12")) {
                        textArea = kongui.fxdc.p12;
                        textArea.setText(polje.substring(0, 1));
                    }

                    if (polje.endsWith("p20")) {
                        textArea = kongui.fxdc.p20;
                        textArea.setText(polje.substring(0, 1));
                    }

                    if (polje.endsWith("p21")) {
                        textArea = kongui.fxdc.p21;
                        textArea.setText(polje.substring(0, 1));
                    }
                    
                    if (polje.endsWith("p22")) {
                        textArea = kongui.fxdc.p22;
                        textArea.setText(polje.substring(0, 1));
                    }
                }       
            } catch (InterruptedException ex) {
                Logger.getLogger(OsluskivacPromena.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException_Exception ex) {
                Logger.getLogger(OsluskivacPromena.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
