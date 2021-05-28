/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIIksOks;

import Server_client.GeneralDObject;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleks
 */
public class KonverterGUIDK {

    public static boolean konvertujGUIUDK(FXMLDocumentController fxcon, GeneralDObject gdo) {
        for (Field f : fxcon.getClass().getDeclaredFields()) {
            for (Field dk : gdo.getClass().getDeclaredFields()) {
                dk.setAccessible(true);
                if (dk.getName().equals(f.getName())) {
                    if (f.getType().getName().equals("javafx.scene.control.TextArea") && dk.getType().getName().equals("java.lang.String")) {
                        try {
                            dk.set(gdo, ((javafx.scene.control.TextArea) f.get(fxcon)).getText());
                        } catch (IllegalArgumentException | IllegalAccessException ex) {
                            Logger.getLogger(KonverterGUIDK.class.getName()).log(Level.SEVERE, null, ex);
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean konvertujDKUGUI(GeneralDObject gdo, FXMLDocumentController fxcon) {
        for (Field f : fxcon.getClass().getDeclaredFields()) {
            for (Field dk : gdo.getClass().getDeclaredFields()) {
                dk.setAccessible(true);
                if (dk.getName().equals(f.getName())) {
                    if (f.getType().getName().equals("javafx.scene.control.TextArea") && dk.getType().getName().equals("String")) {
                        try {
                            ((javafx.scene.control.TextArea) f.get(fxcon)).setText((String) dk.get(gdo));
                        } catch (IllegalArgumentException | IllegalAccessException ex) {
                            Logger.getLogger(KonverterGUIDK.class.getName()).log(Level.SEVERE, null, ex);
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
