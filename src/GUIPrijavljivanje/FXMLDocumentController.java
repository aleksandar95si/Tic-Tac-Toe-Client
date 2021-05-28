package GUIPrijavljivanje;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLDocumentController {

    @FXML
    public Button prijavljivanje;

    @FXML
    public Button registrovanje;

    @FXML
    public PasswordField sifraPrijavljivanje;

    @FXML
    public TextField korisnickoImePrijavljivanje;

    @FXML
    public PasswordField sifraRegistrovanje;

    @FXML
    public TextField korisnickoImeRegistrovanje;

    @FXML
    public void initialize() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        KontrolerGUIPrijavljivanje konguip = new KontrolerGUIPrijavljivanje(this);
    }

    public Stage stage;

    void postaviStage(Stage stage) {
        this.stage = stage;
    }

    void zatvoriFormu() {
        stage.close();
    }

}
