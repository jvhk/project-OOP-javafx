/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ServicoDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Database;
import model.Servico;

/**
 * FXML Controller class
 *
 * @author Joao
 */
public class FXMLControllerAdicionaServico implements Initializable {

    @FXML
    private AnchorPane anchorPaneAddServico;
    @FXML
    private TextField fieldAddServicoTipo;
    @FXML
    private TextField fieldAddServicoPreco;
    @FXML
    private TextField fieldAddServicoDescricao;
    @FXML
    private TextField fieldAddServicoProfissionalResponsavel;
    @FXML
    private TextField fieldAddServicoCodigo;
    @FXML
    private Button btnSalvarCadastroServico;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adicionaServico(ActionEvent event) {
        
        String tipoServico = fieldAddServicoTipo.getText();
        String descricaoServico = fieldAddServicoDescricao.getText();
        double precoServico = Double.parseDouble(fieldAddServicoPreco.getText());
        String profissionalReponsavel = fieldAddServicoProfissionalResponsavel.getText();
        int codigo = Integer.parseInt(fieldAddServicoCodigo.getText());
        
        Servico servico = new Servico(tipoServico, descricaoServico, precoServico, profissionalReponsavel, codigo);
        ServicoDAO dao = new ServicoDAO();
        
        dao.inserir(servico);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Aviso de cadastro");
        alert.setContentText("Serviço cadastrado com sucesso!");
        alert.show();
        
        Database.dados.Save();
        
        fieldAddServicoCodigo.clear();
        fieldAddServicoDescricao.clear();
        fieldAddServicoPreco.clear();
        fieldAddServicoProfissionalResponsavel.clear();
        fieldAddServicoTipo.clear();
        
    }
    
}
