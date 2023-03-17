/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
package egg;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ejercicio_equals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una frase");
       String frase = leer.nextLine();
       String eureka = "eureka";
       
       System.out.println("la frase " + frase + "es :" + eureka.equals(frase));
    }
    
}
