/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author Erika
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     String dato = " "+" **** Hola mundo ****";
        for (int i = dato.length()-1; i >= 0; i--) {
            System.out.print(dato.charAt(i));
        }
    }  
    }
    