/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodo;



/**
 *
 * @author USER
 */
public class InstanciasReturn {
    
    public String testLessThan(int val) {
  if (val >100 ) {  
    return "Por encima de 100";
  }

  if (val >10) {  // Cambia esta línea
    return "Por encima de 10";
  }

  return "10 o menos";
}
    
    
   public String testGreaterOrEqual(int val) {
  if (val >=20) {  // Cambia esta línea
    return "20 or más";
  }

  if (val>=10) {  // Cambia esta línea
    return "10 o más";
  }

  return "menos de 10";
}
   
   public String testLessOrEqual(int val) {
  if (val <= 12) {  // Cambia esta línea
    return "Menor o igual a 12";
  }

  if (val <=24) {  // Cambia esta línea
    return "Menor o igual a 24";
  }

  return "More Than 24";
}
   
   
   public String testLogicalOr(int val) {
  if (val>=10 || val<=20) { // Cambia esta línea
    return "Inside";
  }else {
    return "Outside";
  }
}
   
   public String testEqual(int val) {
  if (val==12) { // Cambia esta línea
    return "Equal";
  }
  return "Not Equal";
}
   
   public String testElse(int val) {
  String result = "";

  if (val > 5) {
    result = "Mayor que 5";
  }else {
    result = "5 más pequeño";
  }

  return result;
}
   /*
   public String testElse2(int val) {
  String result = "";

  if (val > 5) {
    result = "Bigger than 5";
  } else if (val < 5) {
    result = "Smaller than 5";
  } else (val == 5) {
    result = "Equal to 5";
  }

  return result;
}*/
   
 
    public boolean nand(boolean a, boolean b) {
        
        return !(a&&b);
        /*
        if (a && b) {
        return false;
        } else {
        return true;
        }*/
    }
    
    public static void main(String[] args) {
        
        InstanciasReturn val1 = new InstanciasReturn();
        InstanciasReturn val2 = new InstanciasReturn();
        InstanciasReturn val3 = new InstanciasReturn();
        InstanciasReturn val4 = new InstanciasReturn();
        InstanciasReturn val5 = new InstanciasReturn();
        InstanciasReturn val9 = new InstanciasReturn();
        InstanciasReturn val19a = new InstanciasReturn();
 
        
        
        String numero = val1.testLessThan(15);
        String numero2 = val2.testGreaterOrEqual(25);
        String numero3 = val3.testLessOrEqual(8);
        String numero4 = val4.testLogicalOr(5);
        String numero5 = val4.testEqual(12);
        String numero9 = val9.testElse(6);
        val19a.nand(true, true);
        
        
        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println(numero9);
       
       
        
       
        
    }
 
   
}
