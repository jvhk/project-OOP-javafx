/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Cliente;
import model.Database;

/**
 * FXML Controller class
 *
 * @author Joao
 */
public class FXMLControllerAdicionaCliente implements Initializable {

    @FXML
    private AnchorPane anchorPaneAddCliente;
    @FXML
    private TextField fieldAddClienteNome;
    @FXML
    private TextField fieldAddClienteTelefone;
    @FXML
    private TextField fieldAddClienteCPF;
    @FXML
    private Button btnSalvarCadastroCliente;

    /**
     * Initializes the controller class.
     */

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adicionaCliente(ActionEvent event) {
        
        String nome = fieldAddClienteNome.getText();
        int cpf =  Integer.parseInt(fieldAddClienteCPF.getText());
        String telefone = fieldAddClienteTelefone.getText();
        
        Cliente cliente = new Cliente(nome, cpf, telefone);
        ClienteDAO dao = new ClienteDAO();
        
        dao.inserir(cliente);        
        
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Aviso de cadastro");
        alert.setContentText("Cliente cadastrado com sucesso");
        alert.show();
        
        Database.dados.Save();
        
       
        
    }
    
}
