/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPrijavljivanje.Osluskivaci;

import GUIPrijavljivanje.KontrolerGUIPrijavljivanje;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author aleks
 */
public class OsluskivacRegistrovanje implements EventHandler {
    KontrolerGUIPrijavljivanje  konguip;
        
        public OsluskivacRegistrovanje(KontrolerGUIPrijavljivanje  konguip) {
            this.konguip = konguip;
        }
        
        @Override
        public void handle(Event event) {
            konguip.registrovanje();
        }
}
