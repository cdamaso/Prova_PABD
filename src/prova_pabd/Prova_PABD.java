/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prova_pabd;

import dao.OrientadorJpaController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Camilo
 */
public class Prova_PABD extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
/*        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();*/
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Prova_PABDPU");
        OrientadorJpaController daoOrientador = new OrientadorJpaController(emf);
        Orientador ori = new Orientador();
        
        ori.setNome("Jorge");
        ori.setApelido("Jorge");
        ori.setSobrenome("Antunes");
        ori.setTelefone("12-3652-7845");
        ori.setEmail("jorge.antunes@fatec.sp.gov.br");
        //ori.setMenbrodesde("2023-09-06");
        
        daoOrientador.create(ori);
        
    }
    
}
