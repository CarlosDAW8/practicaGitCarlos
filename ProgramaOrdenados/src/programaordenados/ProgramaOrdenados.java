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
        int numeros[] = new int[10];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("Anota número" +i+ ":");
            numeros[i] = sc.nextInt();
        }
        
        burbuja(numeros, 10);
        
        for(int i=0;i<numeros.length;i++){
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
}
