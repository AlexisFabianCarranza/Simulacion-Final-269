/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim.pkgfinal.pkg269;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author acarranza
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btnPolitica1;
    @FXML
    private Button btnPolitica2;
    @FXML
    private TextArea txtPolitica1;
    @FXML
    private TextArea txtPolitica2;
    @FXML
    private Button btnCerrar;
    
    private GestorSimulacion controlador;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void llamarPolitica1(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("FXMLPolitica1.fxml"));
        Parent root1= (Parent)fxmlLoader.load();
        Stage stage= new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
}
