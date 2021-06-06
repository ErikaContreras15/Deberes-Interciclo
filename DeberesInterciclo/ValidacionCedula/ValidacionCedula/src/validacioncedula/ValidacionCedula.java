/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacioncedula;

import java.util.Scanner;

/**
 *
 * @author Erika
 */
public class ValidacionCedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int[] cedula = new int[10];
        int par = 0;
        int impar = 0;

        System.out.println(" *** Ingrese el numero de la cedula ***");
        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese el digito #" + (i + 1) + ": ");
            cedula[i] = s.nextInt();
        }

        for (int i = 1; i < 8; i += 2) {
            impar = impar + cedula[i];

        }

        for (int i = 0; i <= 8; i += 2) {
            int dato = 2 * cedula[i];

            if (dato > 9) {
                dato = dato - 9;
            }
            par = par + dato;
        }
        int suma = par + impar;

        System.out.println("");

        if (suma % 10 != 0) {
            int acumulador = ((suma / 10) + 1) * 10;

            int total = acumulador - suma;

            if (total == cedula[9]) {
                System.out.println("Su validación  es ----> CORRECTA");
            } else {
                System.out.println("Su validación es ----> INCORRECTA");
            }
        }
    }
        
    }