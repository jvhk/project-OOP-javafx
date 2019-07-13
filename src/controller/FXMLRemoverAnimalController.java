/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AnimalDAO;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Animal;
import model.Database;

/**
 * FXML Controller class
 *
 * @author Joao
 */
public class FXMLRemoverAnimalController implements Initializable {

    @FXML
    private AnchorPane anchorRemoverAnimal;
    @FXML
    private TextField fieldNomeAnimal;
    @FXML
    private Button btnRemoveAnimal;
    @FXML
    private Label titleRemoveAnimais;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void removeAnimal(ActionEvent event) {  //terminar
        String nome = fieldNomeAnimal.getText();
        
           
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Aviso de Remoção");
        alert.setHeaderText("Caixa de confirmação");
        alert.setContentText("Tem certeza que deseja remover?");
        
        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                // ... user chose OK
                AnimalDAO dao = new AnimalDAO();
                boolean status = dao.deletar(nome);
                
                if(status){
                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Remoção confirmada");
                    alert.setContentText("Animal removido com sucesso!");
                    alert.show();
                }else{
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Erro!");
                    alert.setContentText("Animal não cadastrado!");
                    alert.show();
                }
            }
            
        
        
                
    }
    
}
