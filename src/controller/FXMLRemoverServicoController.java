/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ServicoDAO;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Joao
 */
public class FXMLRemoverServicoController implements Initializable {

    @FXML
    private AnchorPane anchorRemoverAnimal;
    @FXML
    private Label titleRemoveServico;
    @FXML
    private TextField fieldCodigoServico;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void removeServico(ActionEvent event) {
        int codigo = Integer.valueOf(fieldCodigoServico.getText());          
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Aviso de Remoção");
        alert.setHeaderText("Caixa de confirmação");
        alert.setContentText("Tem certeza que deseja remover?");
        
        Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK){
                // ... user chose OK
                ServicoDAO dao = new ServicoDAO();
                boolean status = dao.deletar(codigo);
                
                if(status){
                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Remoção confirmada");
                    alert.setContentText("Serviço removido com sucesso!");
                    alert.show();
                }else{
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Erro!");
                    alert.setContentText("Serviço não cadastrado!");
                    alert.show();
                }
            }
    }
    
}
