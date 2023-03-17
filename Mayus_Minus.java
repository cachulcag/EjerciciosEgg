/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Mayus_Minus {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lire= new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase=lire.nextLine();
        System.out.println(frase.toUpperCase());
        frase=frase.toLowerCase();
        System.out.println(frase);
    }
    
}
