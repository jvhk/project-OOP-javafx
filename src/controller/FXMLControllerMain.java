/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Joao
 */
public class FXMLControllerMain implements Initializable {

    @FXML
    private AnchorPane anchorPaneMenuPrincipal;
    @FXML
    private VBox vBoxMenuPrincipal;
    @FXML
    private Button btnCadastrarCliente;
    @FXML
    private Button btnCadastrarServico;
    @FXML
    private Button btnCadastrarAnimal;
    @FXML
    private Button btnRemoverCliente;
    @FXML
    private Button btnRemoverServico;
    @FXML
    private Button btnRemoverAnimal;
    @FXML
    private AnchorPane pnlBack;


    /**
     * Initializes the controller class.
     */

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
        

    @FXML
    private void loadCadastroCliente(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/adicionarCliente.fxml"));
        AnchorPane.setBottomAnchor(a, 0D);
        AnchorPane.setTopAnchor(a, 0D);
        AnchorPane.setLeftAnchor(a, 0D);
        AnchorPane.setRightAnchor(a, 0D);
        pnlBack.getChildren().setAll(a);
    }

    @FXML
    private void loadCadastroServico(ActionEvent event) throws IOException {
        AnchorPane b = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/adicionarServico.fxml"));
        
        pnlBack.getChildren().setAll(b);
    }

    @FXML
    private void loadCadastroAnimal(ActionEvent event) throws IOException { //funciona
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/adicionarAnimal.fxml"));
        AnchorPane.setBottomAnchor(a, 0D);
        AnchorPane.setTopAnchor(a, 0D);
        AnchorPane.setLeftAnchor(a, 0D);
        AnchorPane.setRightAnchor(a, 0D);
        pnlBack.getChildren().setAll(a);
    }

    @FXML
    private void loadRemoverCliente(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/removerCliente.fxml"));
        AnchorPane.setBottomAnchor(a, 0D);
        AnchorPane.setTopAnchor(a, 0D);
        AnchorPane.setLeftAnchor(a, 0D);
        AnchorPane.setRightAnchor(a, 0D);
        pnlBack.getChildren().setAll(a);
    }

    @FXML
    private void loadRemoverServico(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/removerServico.fxml"));
        AnchorPane.setBottomAnchor(a, 0D);
        AnchorPane.setTopAnchor(a, 0D);
        AnchorPane.setLeftAnchor(a, 0D);
        AnchorPane.setRightAnchor(a, 0D);
        pnlBack.getChildren().setAll(a);
    }

    @FXML
    private void loadRemoverAnimal(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/removerAnimal.fxml"));
        AnchorPane.setBottomAnchor(a, 0D);
        AnchorPane.setTopAnchor(a, 0D);
        AnchorPane.setLeftAnchor(a, 0D);
        AnchorPane.setRightAnchor(a, 0D);
        pnlBack.getChildren().setAll(a);
    }

    
    
        
    
}
