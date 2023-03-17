/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

import java.util.Scanner;


public class substing {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        int errores = 0;
        int aciertos = 0;
        do{
        if (frase.substring(0,1).equalsIgnoreCase("x") && frase.length()==5){
            System.out.println("pito");
            aciertos ++;
        }else{
            errores ++;
        }
        } while ("&&&&&".equals(frase));
    }
}