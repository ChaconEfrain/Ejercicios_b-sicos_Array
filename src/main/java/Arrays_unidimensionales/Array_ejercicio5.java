/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_unidimensionales;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author Dell
 */
public class Array_ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea un array de números donde le indicamos por teclado el tamaño 
        //del array, rellenaremos el array con números aleatorios entre 0 y 9, 
        //al final muestra por pantalla el valor de cada posición y la suma de 
        //todos los valores. Haz un método para rellenar el array
        //(que tenga como parámetros los números entre los que tenga que generar),
        //para mostrar el contenido y la suma del array y un método privado para 
        //generar número aleatorio (lo puedes usar para otros ejercicios).
        inicializarArreglo();
    }
    public static void inicializarArreglo(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int length = lector.nextInt();
        int numeros[] = new int[length];
        llenadoArreglo(numeros);
        suma(numeros);
    }
    public static void llenadoArreglo(int numeros[]){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * 9);         
            System.out.println("El valor de la posición " + i + " es: " + numeros[i]);
        }
    }
    public static void suma(int numeros[]){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
        }
        System.out.println("La suma de todos los números es: " + suma);
    }
    
}
