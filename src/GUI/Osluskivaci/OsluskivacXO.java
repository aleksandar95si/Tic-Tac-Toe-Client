/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Osluskivaci;

import GUI.FXMLDocumentController;
import GUI.KontrolerGUI;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;

/**
 *
 * @author aleks
 */
public class OsluskivacXO implements EventHandler {

    FXMLDocumentController fxdc;
    
    public OsluskivacXO(FXMLDocumentController fxdc) {
        this.fxdc = fxdc;
    }
    
    @Override
    public void handle(Event event) {
        
        TextArea textArea=(TextArea) event.getSource();
        System.out.println(textArea);
        fxdc.kngui.naKlik(textArea);
    }
}
