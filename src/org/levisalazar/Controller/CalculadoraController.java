package org.levisalazar.Controller;

import javafx.scene.control.Label;
 
public class CalculadoraController {
    private String opcion1 = "";
    private String operador = "";
    private String opcion2 = "";
    private boolean calculoTerminado = false;
    
    public CalculadoraController(){
    }
 

    public void procesoDeEntrada(String entrada, Label pantalla) {
        if (entrada.equals("C")) {
            opcion1 = ""; 
            operador = ""; 
            opcion2 = ""; 
            pantalla.setText("0");
            return;
        }

        // Si ya se completó un cálculo y se presiona un número o un punto, se reinicia la pantalla
        if (calculoTerminado && (entrada.matches("[0-9]") || entrada.equals("."))) {
            opcion1 = "";
            operador = ""; 
            opcion2 = ""; 
        }
        calculoTerminado = false; 
        
        // 1. Procesar números
        if (entrada.matches("[0-9]")) {
            if (operador.isEmpty()) {
                opcion1 += entrada;                
            } else { 
                opcion2 += entrada; 
            } 
            actualizarPantalla(pantalla);
        } 
        // 2. Procesar punto decimal
        else if (entrada.equals(".")) {
            if (operador.isEmpty()) {
                if (opcion1.isEmpty()) {
                    opcion1 = "0.";
                } else if (!opcion1.contains(".")) {
                    opcion1 += ".";
                }
            } else {
                if (opcion2.isEmpty()) {
                    opcion2 = "0.";
                } else if (!opcion2.contains(".")) {
                    opcion2 += ".";
                }
            }
            actualizarPantalla(pantalla);
        }
        // 3. Procesar operadores (+, -, *, /)
        else if (entrada.equals("+") || entrada.equals("-") || entrada.equals("*") || entrada.equals("/")|| entrada.equals("^") || entrada.equals("%")){
            operador = entrada; 
            actualizarPantalla(pantalla);
        }
        
        else if (entrada.equals("√")){
            if (!opcion1.isEmpty()){
                opcion1 = resultadoRaiz(opcion1); 
                operador = ""; 
                opcion2 = ""; 
                calculoTerminado = true; 
                actualizarPantalla(pantalla);
            }
        }
        // 4. Procesar el igual (=)
        else if (entrada.equals("=")) { 
            if (!opcion1.isEmpty() && !opcion2.isEmpty()) {            
                if (operador.equals("+")) { 
                    opcion1 = resultadoSuma(opcion1, opcion2);
                } else if (operador.equals("-")) { 
                    opcion1 = resultadoResta(opcion1, opcion2); 
                } else if (operador.equals("*")) {
                    opcion1 = resultadoMultiplicacion(opcion1, opcion2); 
                } else if (operador.equals("/")) {
                    if (Double.parseDouble(opcion2) == 0) {
                        opcion1 = "ERROR"; 
                    } else {
                        opcion1 = resultadoDivision(opcion1, opcion2); 
                    }                        
                }else if (operador.equals("^")){
                    opcion1 = resultadoPotencia(opcion1,opcion2);
                }
                
                operador = ""; 
                opcion2 = ""; 
                calculoTerminado = true; 
            } 
            actualizarPantalla(pantalla);
        }
    }
    

    private void actualizarPantalla(Label pantalla) {
        if (operador.isEmpty()) pantalla.setText(opcion1.isEmpty() ? "0" : opcion1);
        else pantalla.setText(opcion1 + " " + operador + " " + opcion2);
    }
    
    private String formatearResultado(double resultado) {
        if (resultado == (long) resultado) {
            return String.format("%d", (long) resultado);
        } else {
            return String.valueOf(resultado);
        }
    }
    
    
private String resultadoSuma(String numeroUno, String numeroDos) {
        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);
        return formatearResultado(datoUno + datoDos);
    }

    private String resultadoResta(String numeroUno, String numeroDos) {
        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);
        return formatearResultado(datoUno - datoDos);
    }
      
    private String resultadoMultiplicacion(String numeroUno, String numeroDos) {
        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);
        return formatearResultado(datoUno * datoDos);
    }

    private String resultadoDivision(String numeroUno, String numeroDos) {
        double datoUno = Double.parseDouble(numeroUno);
        double datoDos = Double.parseDouble(numeroDos);
        return formatearResultado(datoUno / datoDos);
    }
    
    private String resultadoPotencia(String numeroUno, String numeroDos){
        double base = Double.parseDouble(numeroUno); 
        double exponente = Double.parseDouble(numeroDos); 
        return formatearResultado(Math.pow(base, exponente)); 
    }
    
    private String resultadoRaiz(String numeroUno){
        double valor = Double.parseDouble(numeroUno);
        if (valor < 0 ) { 
            return "ERROR";
        }
        return formatearResultado(Math.sqrt(valor));
    }
}
   
    
//agregar un video explicando la calculadora


