/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AnimalDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Animal;
import model.Database;

/**
 * FXML Controller class
 *
 * @author Joao
 */
public class FXMLControllerAdicionaAnimal implements Initializable {

    @FXML
    private AnchorPane anchorPaneAddAnimal;
    @FXML
    private TextField fieldAddAnimalNome;
    @FXML
    private TextField fieldAddAnimalEspecie;
    @FXML
    private Button btnSalvarCadastroAnimal;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    

    @FXML
    private void cadastrarAnimal(ActionEvent event) {
        String nome = fieldAddAnimalNome.getText();
        String especie = fieldAddAnimalEspecie.getText();
        
        Animal animal = new Animal(especie,nome);
        
        AnimalDAO dao = new AnimalDAO();
        dao.inserir(animal);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Aviso de cadastro");
        alert.setContentText("Animal cadastrado com sucesso");
        alert.show();
    }


   
    
}
