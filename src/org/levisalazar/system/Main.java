package org.levisalazar.system;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;
import org.levisalazar.View.CalculadoraView;

/**
 *
 * @author Levi Salazar Muñoz 
 */
public class Main extends Application {

 
    public static void main(String[] args) {  
        launch(args);
    }

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        //Visita de la calculadora 
        CalculadoraView calculadora = new CalculadoraView(); 
           //nodos 
        Pane raiz = new Pane(calculadora.getView());
        
        //escena 
        Scene escena = new Scene(raiz, 266, 390);
        
      //mostrar escenario principal
      escenarioPrincipal.setTitle("CALCULADORA");
      escenarioPrincipal.setScene(escena);
      escenarioPrincipal.show();
        
    }
    
}
