/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package egg;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de familias");
        int cantidadFamilias = leer.nextInt();
        int cantidadHijos;
        double promediosAcumulados=0;
        int cont=0;
        for (int i = 0; i < cantidadFamilias; i++) {
            
            System.out.println("Familia número " + (i+1) + " ingrese la cantidad de hijos");
             cantidadHijos=leer.nextInt();
            if (cantidadHijos==0){
                cont=1+cont;
                continue;
            }
            
            promediosAcumulados=promediosAcumulados+edadHijos(cantidadHijos);
        }
        System.out.println("el promedio de la edad de los niños es: " + promediosAcumulados/(cantidadFamilias-cont));
    }
    //suprograma
    private static double edadHijos(int cantidadHijos){
        int edad;
        int sumaEdad=0;
        for (int i = 0; i<cantidadHijos;i++){
            Scanner leer = new Scanner(System.in);
                System.out.println("ingrese la edad del hijo número "+(i+1));
                edad=leer.nextInt();
                sumaEdad=edad+sumaEdad;
        }
        return sumaEdad/cantidadHijos;
    }
}
