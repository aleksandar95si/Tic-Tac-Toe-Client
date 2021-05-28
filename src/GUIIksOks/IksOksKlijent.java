/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIIksOks;

import java.net.URL;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author aleks
 */
public class IksOksKlijent extends Application {

    FXMLDocumentController FXMLkon;

    @Override
    public void start(Stage stage) throws Exception {

        String resourcePath = "FXMLDocument.fxml";
        URL location = getClass().getResource(resourcePath);
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        Parent root = fxmlLoader.load();
        FXMLkon = (FXMLDocumentController) fxmlLoader.getController();

        Scene scene = new Scene(root);

        stage.setTitle("IKS - OKS");
        stage.setScene(scene);
        stage.show();
        
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
           public void handle(WindowEvent we) {
               FXMLkon.kngui.zatvoriProgram();
         }
  }); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public FXMLDocumentController vratiFXMLkon() {
        return this.FXMLkon;
    }
}
