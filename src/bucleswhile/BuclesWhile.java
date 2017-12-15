/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucleswhile;

import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class BuclesWhile {

    /**
     * @param args the command line arguments
     * Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
negativo.
     */
    public static void main(String[] args) {
     
        Scanner entrada =  new Scanner(System.in);
        int num, cuadrado;
        
    
     // num guardará el número que leamos
    // y cuadrado guardará el cuadrado de num  
        System.out.println("Introduzca un numero");
        
        num = entrada.nextInt();
        
        
        while (num>=0) {
        cuadrado = num*num;
            System.out.println(num+" es igual a " + cuadrado);
            System.out.println("Introduzca otro numero:: ");
            num = entrada.nextInt();
            
        }
    
    
    }
    
}
