package org.levisalazar.View;
import javafx.geometry.Insets;
import java.util.HashSet;
import java.util.Set;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label; 
import javafx.scene.layout.GridPane; 
import javafx.scene.layout.VBox; 
import javafx.scene.text.Font;       
import javafx.scene.text.FontWeight;  
import org.levisalazar.Controller.CalculadoraController;
public class CalculadoraView {
     private VBox view; 
     private Label pantalla; 
     private GridPane cuadroBotones;     
    //controller
     private CalculadoraController controlador; 
     
    public CalculadoraView() {
        controlador = new CalculadoraController(); 
        
        
        view = new VBox(15); 
        view.setPadding(new Insets(15));
        view.setAlignment(Pos.TOP_CENTER);
        view.setStyle("-fx-background-color: #2C3E50");
        
        pantalla = new Label("0");
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT); 
        //cargar escena y mostrar escenario principal
        pantalla.setPrefSize(235, 50); 
        pantalla.setStyle("-fx-background-color: #D4E9E2");
        
        cuadroBotones = new GridPane();
        cuadroBotones.setHgap(10); // interlineado entre elementos de la cuadricula
        cuadroBotones.setVgap(10);
        cuadroBotones.setAlignment(Pos.CENTER);// alineado al centro 
        
        //primer boton 
        Button btnC = nuevoBoton("C");   
        Button btnUno = nuevoBoton("1");    
        Button btnDos = nuevoBoton("2");         
        Button btnTres = nuevoBoton("3");               
        Button btnCuatro = nuevoBoton("4");              
        Button btnCinco = nuevoBoton("5");               
        Button btnSeis = nuevoBoton("6");            
        Button btnSiete = nuevoBoton("7");      
        Button btnOcho = nuevoBoton("8");        
        Button btnNueve = nuevoBoton("9");        
        Button btnCero = nuevoBoton("0");         
          
        Button btnMas = nuevoBotonOperador("+"); 
        Button btnMenos = nuevoBotonOperador("-"); 
        Button btnDivision = nuevoBotonOperador("/");
        Button btnPor = nuevoBotonOperador("*"); 
        Button btnIgual = nuevoBotonOperador("="); 
        Button btnElevar = nuevoBotonOperador("^"); 
        Button btnPorcentaje = nuevoBotonOperador("%");      
        Button btnRaiz = nuevoBotonOperador("√"); 
        Button btnPunto = nuevoBoton(".");
       
          
          
          
        //agregarlo al cuadroBotones (nodo, columna y fila )
        cuadroBotones.add(btnUno, 0, 4);
        cuadroBotones.add(btnDos, 1, 4);
        cuadroBotones.add(btnTres, 2, 4);
        cuadroBotones.add(btnCuatro,0, 3);
        cuadroBotones.add(btnCinco,1, 3);
        cuadroBotones.add(btnSeis,2, 3);
        cuadroBotones.add(btnSiete,0, 2);
        cuadroBotones.add(btnOcho,1, 2);
        cuadroBotones.add(btnNueve,2, 2);
         cuadroBotones.add(btnMas, 3,  3);
         cuadroBotones.add(btnMenos,3,  4);
         cuadroBotones.add(btnDivision,3,  1);
         cuadroBotones.add(btnPor,3,  2);
         cuadroBotones.add(btnElevar,0,  1);
         cuadroBotones.add(btnPorcentaje,1,  1);
         cuadroBotones.add(btnRaiz,2,  1);
         cuadroBotones.add(btnIgual, 3,  5);
         //GridPane.setColumnSpan(btnIgual, 2 );
         cuadroBotones.add(btnCero, 1,  5);
         cuadroBotones.add(btnPunto, 2,  5);
        cuadroBotones.add(btnC,  0 ,   5);
  
        
        view.getChildren().addAll(pantalla, cuadroBotones);     
        
    }
    public VBox getView(){
        return view;
    }
    private Button nuevoBoton (String texto){
        Button btn = new Button(texto);
        btn.setPrefSize(50,50);
        btn.setStyle("-fx-background-color: #A8D1C7; -fx-text-fill:black; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btn.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
           btn.setOnMousePressed(e -> {
           //cambia el fondo 
        btn.setStyle("-fx-background-color: #E6B333;");
        //moviendose en el eje y 2px
        btn.setTranslateY(2);
    });
        //al soltar el clic
       btn.setOnMouseReleased(e -> {
           //retorna el color original
        btn.setStyle("-fx-background-color: #A8D1C7; -fx-text-fill: black; -fx-background-radius: 5px; -fx-cursor: hand;");
        //mover el botton en el eje y a la posicion 
        btn.setTranslateY(0);
         });
        
        //configuracion de boton 
        //tamaño, el estilo, sus funciones 
        btn.setOnAction(e-> controlador.procesoDeEntrada(texto, pantalla));
        return btn; 
    }
     private Button nuevoBotonOperador (String texto){
        Button btn = new Button(texto);
        btn.setPrefSize(50,50);
        btn.setStyle("-fx-background-color: #F4F4F4; -fx-text-fill:black; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btn.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
           btn.setOnMousePressed(e -> {
           //cambia el fondo 
        btn.setStyle("-fx-background-color: #4D8C7F;");
        //moviendose en el eje y 2px
        btn.setTranslateY(2);
    });
        //al soltar el clic
       btn.setOnMouseReleased(e -> {
           //retorna el color original
        btn.setStyle("-fx-background-color: #F4F4F4; -fx-text-fill:black; -fx-background-radius: 5px; -fx-cursor: hand;");
        //mover el botton en el eje y a la posicion 
        btn.setTranslateY(0);
         });
        
        //configuracion de boton 
        //tamaño, el estilo, sus funciones 
       // btn.setOnAction(e-> controlador.procesoDeEntrada(texto, pantalla));
       btn.setOnAction(e-> controlador.procesoDeEntrada(texto, pantalla));
        return btn; 
    }
     
     
    
}

    
