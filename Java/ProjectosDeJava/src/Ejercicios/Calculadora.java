/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author USER
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculadora {
    
  
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese el primer número: ");
        int num1 = Integer.parseInt(reader.readLine());
            
        System.out.print("Ingrese el segundo número: ");
        int num2 = Integer.parseInt(reader.readLine());
            
        System.out.print("Ingrese el tipo de operación (+, -, *, /): ");
        String operacion = reader.readLine();
            
       if (operacion.equals("+")) {
            int resultado = sumar(num1, num2);
            System.out.println("Suma: " + resultado);
        } else if (operacion.equals("-")) {
            int resultado = restar(num1, num2);
            System.out.println("Resta: " + resultado);
        } else if (operacion.equals("*")) {
            int resultado = multiplicar(num1, num2);
            System.out.println("Multiplicación: " + resultado);
        } else if (operacion.equals("/")) {
            double resultado = dividir(num1, num2);
            System.out.println("División: " + resultado);
        } else {
            System.out.println("Operación no válida");
        }
    }        
      
    /* Operaciones */
    
      public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
       /* if ( a < b){
            return  b- a;
        }else{
            return a - b;
        }*/
       
       return a < b? b-a: a-b;
           
     
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
    }
   
}
