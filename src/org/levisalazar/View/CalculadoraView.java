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
        view = new VBox(15); 
        view.setPadding(new Insets(15));
        view.setAlignment(Pos.TOP_CENTER);
        view.setStyle("-fx-background-color: #FCE4EC");
        
        pantalla = new Label("0");
        pantalla.setFont(Font.font("Consolas", FontWeight.BOLD, 40));
        pantalla.setAlignment(Pos.CENTER_RIGHT); 
        //cargar escena y mostrar escenario principal
        pantalla.setPrefSize(235, 50); 
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
       
          
          
          Button btnMas = new Button("+"); 
        btnMas.setPrefSize(50, 50);
          btnMas.setStyle("-fx-background-color: #8E24AA; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btnMas.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
                   btnMas.setOnMousePressed(e -> {
        btnMas.setStyle("-fx-background-color: #AD1457;");
        btnMas.setTranslateY(2);
    });
        
       btnMas.setOnMouseReleased(e -> {
        btnMas.setStyle("-fx-background-color: #8E24AA; ");
        btnMas.setTranslateY(0);
         });
       
           Button btnMenos = new Button("-"); 
        btnMenos.setPrefSize(50, 50);
          btnMenos.setStyle("-fx-background-color: #8E24AA; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btnMenos.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
                   btnMenos.setOnMousePressed(e -> {
        btnMenos.setStyle("-fx-background-color: #AD1457;");
        btnMenos.setTranslateY(2);
    });
        
       btnMenos.setOnMouseReleased(e -> {
        btnMenos.setStyle("-fx-background-color: #8E24AA; ");
        btnMenos.setTranslateY(0);
         });
       
          Button btnDivision = new Button("/"); 
        btnDivision.setPrefSize(50, 50);
          btnDivision.setStyle("-fx-background-color: #8E24AA; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btnDivision.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
                   btnDivision.setOnMousePressed(e -> {
        btnDivision.setStyle("-fx-background-color: #AD1457;");
        btnDivision.setTranslateY(2);
    });
        
       btnDivision.setOnMouseReleased(e -> {
        btnDivision.setStyle("-fx-background-color: #8E24AA; ");
        btnDivision.setTranslateY(0);
         });
       
          Button btnPor = new Button("*"); 
        btnPor.setPrefSize(50, 50);
          btnPor.setStyle("-fx-background-color: #8E24AA; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btnPor.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
                   btnPor.setOnMousePressed(e -> {
        btnPor.setStyle("-fx-background-color: #AD1457;");
        btnPor.setTranslateY(2);
    });
     
       btnPor.setOnMouseReleased(e -> {
        btnPor.setStyle("-fx-background-color: #8E24AA; ");
        btnPor.setTranslateY(0);
         });
       
         Button btnIgual = new Button("="); 
        btnIgual.setPrefSize(110, 50);
          btnIgual.setStyle("-fx-background-color: #8E24AA; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btnIgual.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
                   btnIgual.setOnMousePressed(e -> {
        btnIgual.setStyle("-fx-background-color: #AD1457;");
        btnIgual.setTranslateY(2);
    });
        
       btnIgual.setOnMouseReleased(e -> {
        btnIgual.setStyle("-fx-background-color: #8E24AA; ");
        btnIgual.setTranslateY(0);
         });
       
          Button btnElevar = new Button("^"); 
        btnElevar.setPrefSize(50, 50);
          btnElevar.setStyle("-fx-background-color: #8E24AA; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btnElevar.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
                   btnElevar.setOnMousePressed(e -> {
        btnElevar.setStyle("-fx-background-color: #AD1457;");
        btnElevar.setTranslateY(2);
    });
        
       btnElevar.setOnMouseReleased(e -> {
        btnElevar.setStyle("-fx-background-color: #8E24AA; ");
        btnElevar.setTranslateY(0);
         });
       
        Button btnPorcentaje = new Button("%"); 
        btnPorcentaje.setPrefSize(50, 50);
          btnPorcentaje.setStyle("-fx-background-color: #8E24AA; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btnPorcentaje.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
                   btnPorcentaje.setOnMousePressed(e -> {
        btnPorcentaje.setStyle("-fx-background-color: #AD1457;");
        btnPorcentaje.setTranslateY(2);
    });
        
       btnPorcentaje.setOnMouseReleased(e -> {
        btnPorcentaje.setStyle("-fx-background-color: #8E24AA; ");
        btnPorcentaje.setTranslateY(0);
         });
       
       Button btnRaiz = new Button("√"); 
        btnRaiz.setPrefSize(50, 50);
          btnRaiz.setStyle("-fx-background-color: #8E24AA; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btnRaiz.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
                   btnRaiz.setOnMousePressed(e -> {
        btnRaiz.setStyle("-fx-background-color: #AD1457;");
        btnRaiz.setTranslateY(2);
    });
        
       btnRaiz.setOnMouseReleased(e -> {
        btnRaiz.setStyle("-fx-background-color: #8E24AA; ");
        btnRaiz.setTranslateY(0);
         });
          
          
          
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
         cuadroBotones.add(btnIgual, 2,  5);
         GridPane.setColumnSpan(btnIgual, 2 );
         cuadroBotones.add(btnCero, 1,  5);
        cuadroBotones.add(btnC,  0 ,   5);
  
        
        view.getChildren().addAll(pantalla, cuadroBotones);     
        
    }
    public VBox getView(){
        return view;
    }
    private Button nuevoBoton (String texto){
        Button btn = new Button(texto);
        btn.setPrefSize(50,50);
        btn.setStyle("-fx-background-color: #8E24AA; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btn.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
           btn.setOnMousePressed(e -> {
           //cambia el fondo 
        btn.setStyle("-fx-background-color: #AD1457;");
        //moviendose en el eje y 2px
        btn.setTranslateY(2);
    });
        //al soltar el clic
       btn.setOnMouseReleased(e -> {
           //retorna el color original
        btn.setStyle("-fx-background-color: #8E24AA; ");
        //mover el botton en el eje y a la posicion 
        btn.setTranslateY(0);
         });
        
        //configuracion de boton 
        //tamaño, el estilo, sus funciones 
        return btn; 
    }
     private Button nuevoBotonOperador (String texto){
        Button btn = new Button(texto);
        btn.setPrefSize(50,50);
        btn.setStyle("-fx-background-color: #F72323; -fx-text-fill:white; -fx-background-radius:5px;" + " -fx-cursor:hand;");
         btn.setFont(Font.font("Consolas " , FontWeight.NORMAL, 20));
           btn.setOnMousePressed(e -> {
           //cambia el fondo 
        btn.setStyle("-fx-background-color: #ED4AD5;");
        //moviendose en el eje y 2px
        btn.setTranslateY(2);
    });
        //al soltar el clic
       btn.setOnMouseReleased(e -> {
           //retorna el color original
        btn.setStyle("-fx-background-color: #F72323; ");
        //mover el botton en el eje y a la posicion 
        btn.setTranslateY(0);
         });
        
        //configuracion de boton 
        //tamaño, el estilo, sus funciones 
        return btn; 
    }
    
}
