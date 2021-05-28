/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIIksOks.Osluskivaci;

import GUIIksOks.KontrolerGUIIksOks;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author aleks
 */
public class OsluskivacNovaIgra implements EventHandler {

    KontrolerGUIIksOks kongui;
    
    public OsluskivacNovaIgra (KontrolerGUIIksOks kongui){
        this.kongui=kongui;
    }
    
    @Override
    public void handle(Event event) {
        try {
            kongui.pokreniNovuIgru();
        } catch (InterruptedException ex) {
            Logger.getLogger(OsluskivacNovaIgra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
