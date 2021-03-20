/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.Osluskivaci.OsluskivacPromena;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 *
 * @author aleks
 */
public class FXMLDocumentController {
    
    @FXML
    public TextArea p00;
    
    @FXML
    public TextArea p01;
    
    @FXML
    public TextArea p02;
    
    @FXML
    public TextArea p10;

    @FXML
    public TextArea p11;
    
    @FXML
    public TextArea p12;    

    @FXML
    public TextArea p20;
    
    @FXML
    public TextArea p21;
    
    @FXML
    public TextArea p22;
    
    public KontrolerGUI kngui;
    
    //Dodati Exception-e ako treba
    @FXML
    public void initialize() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, IOException, FileNotFoundException, ClassNotFoundException {
        kngui=new KontrolerGUI(this);
        //new OsluskivacPromena(kngui).start();
    }    
    
}
