/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import java.net.URL;
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

/**
 * FXML Controller class
 *
 * @author Joao
 */
public class FXMLRemoverClienteController implements Initializable {

    @FXML
    private Button btnRemoveCliente;
    @FXML
    private Label titleRemoveCliente;
    @FXML
    private TextField fieldCpfCliente;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void removeCliente(ActionEvent event) {
        int cpf = Integer.valueOf(fieldCpfCliente.getText());       
           
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Aviso de Remoção");
        alert.setHeaderText("Caixa de confirmação");
        alert.setContentText("Tem certeza que deseja remover?");
        
        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                // ... user chose OK
                ClienteDAO dao = new ClienteDAO();
                boolean status = dao.deletar(cpf);
                
                if(status){
                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Remoção confirmada");
                    alert.setContentText("Cliente removido com sucesso!");
                    alert.show();
                }else{
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Erro!");
                    alert.setContentText("Cliente não cadastrado!");
                    alert.show();
                }
            }
    }
    
}
