/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodo;

/**
 *
 * @author USER
 */
public class GretaReturn {
    
    public String greta(){
        
        return "Greta";
        
    }
    
    public String greta2(){
        
        return "Echo";
    }
    
    public static void main(String[] args) {
        
        GretaReturn nombre = new GretaReturn();
        
        String x = nombre.greta();
        String y = nombre.greta2();
        
        System.out.println(x);
        System.out.println(y);
        
        
        
        
        
        
    }
    
}
