/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodo;

/**
 *
 * @author USER
 */
public class nor {
    public static boolean nor(boolean a, boolean b) {
        if (!a && !b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(nor(false, false));   // Output: true
    }
}