/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prova_pabd;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.xml.ws.Action;

/**
 *
 * @author Camilo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField nOrientador;
    @FXML
    private TextField aOrientador;
    @FXML
    private TextField sOrientador;
    @FXML
    private TextField tOrientador;
    @FXML
    private TextField eOrientador;
    @FXML
    private TextField mOrientador;
    @FXML
    private TextField nAssunto;
    @FXML
    private TextField nDescricao;
    @FXML
    private TextField idoAssunto;
    
    /*
    @FXML
    private void insertOrientador(ActionEvent event){
        *Connection con = Conexao.abrirConexao();
        OrientadorBean orientador = new OrientadorBean();
        OrientadorDAO od = new OrientadorDAO(con);
        orientador.setNome(nOrientador.getText());
        orientador.setApelido(aOrientador.getText());
        orientador.setSobrenome(sOrientador.getText());
        orientador.setTelefone(tOrientador.getText());
        orientador.setEmail(eOrientador.getText());
        orientador.setMenbroDesde(mOrientador.getText());
        System.out.println(od.inserir(orientador));
       
    }
    
    @FXML
    private void insertAssunto(ActionEvent event){
        Connection con = Conexao.abrirConexao();
        AssuntoBean assunto = new AssuntoBean();
        AssuntoDAO ad = new AssuntoDAO(con);
        assunto.setNome(nAssunto.getText());
        assunto.setDescricao(nDescricao.getText());
        assunto.setFk_idOrientador(idoAssunto.getText());
        System.out.println(ad.inserir(assunto));
        
    }*/

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
