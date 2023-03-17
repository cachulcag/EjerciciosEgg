/*
 * Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package egg;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class Ejercicioref13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño de la escalera");
        int tamaño = leer.nextInt();
        generarEscalera(tamaño);
        
        
    }
    private static void generarEscalera(int tamaño){
        int num = 1;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (j<i+1){
                System.out.print(num);
                num++;
                }else{
                    break;
                }
            }
            num=1;
            System.out.println(" ");
        }
    }
    
}
