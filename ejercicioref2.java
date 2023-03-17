/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg;

/**
 *
 * @author crist
 */
public class ejercicioref2 {
    public static void main(String[] args) {
     int a=1,b=2,c=3,d=4,aux;
        System.out.println("a" + a + " b"+ b + " c" + c + " d"+ d);
    /*aux=c;
    b=aux;//c
    aux=a;
    c=aux;//a
    aux=d;
    a=aux;//d
    aux=
    d=aux;//b
    aux=c; */
    
    aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
    System.out.println("a" + a + " b"+ b + " c" + c + " d"+ d);
    }
}
