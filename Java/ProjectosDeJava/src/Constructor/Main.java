/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/**
 *
 * @author USER
 */
public class Main {
   
    public static void main(String[] args) {
        Persona persona1 = new Persona(25);
        Persona persona2 = new Persona(30);
        Persona persona3 = new Persona(35);
        Persona persona4 = new Persona(40);
        Persona persona5 = new Persona(53);

        System.out.println("Número de personas: " + Persona.NumPersonas());
        System.out.println("Edad de persona1: " + persona1.Edad());
        System.out.println("Edad de persona2: " + persona2.Edad());
        System.out.println("Edad de persona3: " + persona3.Edad());
        System.out.println("Edad de persona4: " + persona4.Edad());
        System.out.println("Edad de persona4: " + persona5.Edad());
    }
}
