/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
package egg;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //inicio
        System.out.println("Ingrese la cantidad de filas y columnas");
        //declaracion de variables
        int tamano; //tamano de la matriz
        int[][] matriz = new int[tamano = leer.nextInt()][tamano];
        int[][] trans = new int[tamano][tamano];
        int[][] negativa = new int[tamano][tamano];
        //funciones
        rellenarMatriz(matriz);
        System.out.println("la matriz es: ");
        imprimirMatriz(matriz);
        transpuesta(matriz, trans);
        System.out.println("la matriz transpuesta es: ");
        imprimirMatriz(trans);
        negativa(matriz, negativa);
        System.out.println("la matriz negativa es: ");
        imprimirMatriz(negativa);
        comparacion(negativa, trans);
    }

    private static void rellenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();//pide al usuario los numeros para rellenar
            }
        }
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    private static void transpuesta(int[][] matriz, int[][] trans) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                trans[i][j] = matriz[j][i]; //transpuesta
            }
        }
    }

    private static void negativa(int[][] matriz, int[][] negativa) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                negativa[i][j] = -matriz[i][j];//numero opuesto al de la matriz original
            }
        }
    }

    private static void comparacion(int[][] negativa, int[][] trans) {
        if (Arrays.deepEquals(negativa, trans)) {//compara dos arrays
            System.out.println("es antisimetrica");
        } else {
            System.out.println("no es antisimetrica");
        }
    }
}
