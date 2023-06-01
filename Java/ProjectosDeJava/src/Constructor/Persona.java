/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

/**
 *
 * @author USER
 */
public class Persona {
    private static int numPersonas = 0;
    private int edad;

    public Persona(int edad) {
        numPersonas++;
        this.edad = edad;
    }

    public static int NumPersonas() {
        return numPersonas;
    }

    public int Edad() {
        return edad;
    }
}
