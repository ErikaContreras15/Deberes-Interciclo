/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticion;

/**
 *
 * @author Erika
 */
public class Repeticion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        int cont = 1;
        int numero = 8;
        // Bucle While
        while(cont <= 12){
            int resultado = numero * cont;
            System.out.println(numero +" * "+ cont + " = " + resultado);
            cont ++;
        }
        
        // Bucle Do-While
        System.out.println("Do-While");
        
        int cont1 = 1;
        do{
            int resultado = numero * cont1;
            System.out.println(numero +" * "+ cont1 + " = " + resultado);
            cont1 += 1;
        } while(cont1< 1);
        
        // Bucle For
        System.out.println("Bucle For");
        for (int cont2 = 1; cont2 <= 12; cont2 ++) {
            int resultado = numero * cont1;
            System.out.println(numero +" * "+ cont2 + " = " + resultado);
            
        }
    }
  
    }