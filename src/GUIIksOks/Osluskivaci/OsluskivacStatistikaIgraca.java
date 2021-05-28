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
public class OsluskivacStatistikaIgraca implements EventHandler {
    
    KontrolerGUIIksOks kngui;
    
    public OsluskivacStatistikaIgraca(KontrolerGUIIksOks kngui) {
        this.kngui=kngui;
    }
    
    @Override
    public void handle(Event event) {
        kngui.postaviStatistikuIgraca();
    }
    
}
