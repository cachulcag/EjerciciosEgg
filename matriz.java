/*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo*/
package egg;

import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[5];
        
        for(int i=0;i<equipo.length;i++){
            equipo[i] = leer.nextLine(); 
        }
        for (String tamano : equipo) {
            System.out.print(tamano + " ");
        }
    }
}
