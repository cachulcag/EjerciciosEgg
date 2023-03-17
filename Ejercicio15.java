package egg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Ejercicio15 {
    public static void main(String[] args) {
       int [] valor = new int [100];
       cuentaRegresiva(valor);
    }
    private static void cuentaRegresiva(int[] valor){
        
        for(int i = 100; i<0;i--){
            valor[i]=i;
            System.out.println(valor[i]);
        }
    }
}
