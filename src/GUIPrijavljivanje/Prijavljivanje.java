package GUIPrijavljivanje;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author aleks
 */
public class Prijavljivanje extends Application {

    FXMLDocumentController FXMLkon;

    @Override
    public void start(Stage stage) throws Exception {

        String resourcePath = "FXMLDocument.fxml";
        URL location = getClass().getResource(resourcePath);
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        Parent root = fxmlLoader.load();
        FXMLkon = (FXMLDocumentController) fxmlLoader.getController();

        FXMLkon.postaviStage(stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Prijavljivanje/Registrovanje");
        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public FXMLDocumentController vratiFXMLController() {
        return FXMLkon;
    }

}
