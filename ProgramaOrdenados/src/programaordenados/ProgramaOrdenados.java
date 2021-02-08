/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaordenados;
import java.util.*;
/**
 *
 * @author cardd
 */
public class ProgramaOrdenados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuantos;
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántos números va a leer?");
        cuantos = sc.nextInt();
        
        int numeros[] = new int[cuantos];
        
        for(int i=0;i<cuantos;i++){
            System.out.println("Anota número" +i+ ":");
            num = sc.nextInt();
            if (repetido(numeros, num) == false) {
                numeros[i] = num;
            }
            else
                i--;
        }
        
        burbuja(numeros, cuantos);
        
        for(int i=0;i<cuantos;i++){
            System.out.println(numeros[i]);
        }
        
    }
    
    public static void burbuja(int v[], int TAM) {
        int j,k,aux;
        for(j=1;j<TAM;j++) {
            
            for (k=0; k<TAM-j;k++) {

                if (v[k]>v[k+1]) {
                    aux=v[k];
                    v[k]=v[k+1];
                    v[k+1]=aux;
                }
            }    
        }
    }
    
    public static boolean repetido(int[] array, int valor) {
    boolean repetido = false;
    for (int i = 0; i < array.length && !repetido; i++) {
        if (array[i] == valor) {
            repetido = true;
        }
    }
    return repetido;
    }
}
