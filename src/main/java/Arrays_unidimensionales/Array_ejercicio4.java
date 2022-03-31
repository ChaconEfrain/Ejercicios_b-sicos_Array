/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_unidimensionales;

/**
 *
 * @author Dell
 */
public class Array_ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea un array de números de 100 posiciones, que contendrá los números
        //del 1 al 100. Obtén la suma de todos ellos y la media.
        inicializarArreglo();
    }
    public static void inicializarArreglo(){
        int numeros[] = new int [100];
        llenadoArreglo(numeros);
    }
    public static void llenadoArreglo(int numeros[]){
        for(int i = 1; i <= numeros.length; i++){
            System.out.println(i); 
        }
        suma(numeros);
        media(numeros);
    }
    public static void suma(int numeros[]){
        int suma = 0;
        for(int i = 1; i <= numeros.length; i++){
            suma = suma + i;
        }
        System.out.println("La suma es: " + suma);
    }
    public static void media(int numeros[]){
         double suma = 0;
         double media = 0;
        for(int i = 1; i <= numeros.length; i++){
            suma = suma + i;
        }
        media = suma / numeros.length;
        System.out.println("La media es: " + media);
    }
}
    

