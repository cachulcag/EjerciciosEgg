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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2, opcion;
        String r = "n";

        do {
            System.out.println("Ingresa el primer valor: ");
            num1 = leer.nextInt();
            System.out.println("Ingresa el segundo valor: ");
            num2 = leer.nextInt();
            System.out.println("Ingresa la Operacion que deseas realizar: ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de su Suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de su Resta es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("El resultado de su Multiplicacion es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("El resultado de su Division es: " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    r = leer.nextLine();
                    break;

                default:
                    System.out.println("Opcion Incorrecta Ingrese una opcion valida..");
            }

            if (opcion == 5) {
                r = leer.nextLine();
            }
        } while ("n".equalsIgnoreCase(r));
        {
            if ("s".equalsIgnoreCase(r)) {
                System.out.println("Ha Finalizado el programa Correctamente");
            }

        }

    }
}
