/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIIksOks.Osluskivaci;

import GUIIksOks.KontrolerGUIIksOks;
import Server_client.InterruptedException_Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;

/**
 *
 * @author aleks
 */
public class OsluskivacXO implements EventHandler {

    KontrolerGUIIksOks kongui;

    public OsluskivacXO(KontrolerGUIIksOks kongui) {
        this.kongui = kongui;
    }

    @Override
    public void handle(Event event) {
        TextArea textArea = (TextArea) event.getSource();
        try {
            kongui.postaviXO(textArea);
        } catch (InterruptedException_Exception ex) {
            Logger.getLogger(OsluskivacXO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
