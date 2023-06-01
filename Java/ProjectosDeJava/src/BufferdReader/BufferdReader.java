/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferdReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BufferdReader {
    
    public static void main(String[] args) throws IOException {
    
        

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca un texto, por favor: ");
        String txt = br.readLine();
        System.out.println(txt);
         */
        // Conversor de Dolares
        
        /*
        float conversor = 0.93f;
        
        float result = 0;
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca los Euros ");
        String Dollar = br.readLine();
        
        result = conversor * Integer.parseInt(Dollar);
        
        System.out.println(result);
        */
        
        // Iva
        /*
        float iva = 0.21f;
    
        float result = 0;
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca los Valor ");
        String Dollar = br.readLine();
        
        result = iva * Integer.parseInt(Dollar)+Integer.parseInt(Dollar);
        
        System.out.println(result);
        */
        
        
        // Cuadrado Triple
        
        /*
        int doble, triple = 0;
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca los Valor ");
        String valor = br.readLine();
        
        doble =  Integer.parseInt(valor) * Integer.parseInt(valor);
        
        triple =  Integer.parseInt(valor) + Integer.parseInt(valor) + Integer.parseInt(valor);
        
        System.out.println(doble);
        
        System.out.println(triple);
        */
        
        
        // Area
        /*
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese el ancho del rectángulo: ");
            String anchoString = reader.readLine();
            double ancho = Double.parseDouble(anchoString);

            System.out.print("Ingrese el alto del rectángulo: ");
            String altoString = reader.readLine();
            double alto = Double.parseDouble(altoString);

            double perimetro = 2 * (ancho + alto);
            double area = ancho * alto;

            System.out.println("El perímetro del rectángulo es: " + perimetro);
            System.out.println("El área del rectángulo es: " + area);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
        
        // Grados
        /*
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese la temperatura en grados centígrados: ");
            String celsiusString = reader.readLine();
            double celsius = Double.parseDouble(celsiusString);

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
   */
        // Caja regalo 
        
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese su nombre: ");
            String nombre = reader.readLine();

            System.out.print("Ingrese el material de la caja que desea recibir: ");
            String material = reader.readLine();

            System.out.print("Ingrese las dimensiones de la caja: ");
            String dimensiones = reader.readLine();

            System.out.print("Ingrese algún comentario adicional: ");
            String comentario = reader.readLine();

            String mensaje = nombre + " ha pedido una caja de " + material + " con unas dimensiones " + dimensiones + ". " + comentario + ".";
            System.out.println(mensaje);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
          
   
    }
    
}
