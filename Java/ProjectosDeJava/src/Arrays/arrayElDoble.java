/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class arrayElDoble {
    
     public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(9);
        myList.add(3);
        myList.add(8);
        myList.add(5);
        myList.add(7);

        for (int i = 0; i < myList.size(); i++) {
            int numero = myList.get(i);
            int doble = numero * 2;
            System.out.println("El doble de " + numero + " es " + doble);
        }
    }
    
}
