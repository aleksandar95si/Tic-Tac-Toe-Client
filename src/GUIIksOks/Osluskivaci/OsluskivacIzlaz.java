/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIIksOks.Osluskivaci;

import GUIIksOks.KontrolerGUIIksOks;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author aleks
 */
public class OsluskivacIzlaz implements EventHandler {

    KontrolerGUIIksOks kongui;
        
    public OsluskivacIzlaz(KontrolerGUIIksOks kongui) {
        this.kongui = kongui;
    }
    
    @Override
    public void handle(Event event) {
        kongui.zatvoriProgram();
    }
    
}
