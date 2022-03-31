/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_unidimensionales;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Array_ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pedirle al usuario 10 numeros e imprime cual es el menor de los numeros ingresados
    inicializarArreglo();
    }
    public static void inicializarArreglo(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese 10 números enteros:");
        int numeros[] = new int[10];
        llenadoArreglo(numeros, lector);
    }
    public static void llenadoArreglo(int numeros[], Scanner lector){
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el número de la posición " + i + ":");
            int numero = lector.nextInt();
            numeros[i] = numero;  
        }
        numeroMenor(numeros);
    }
    public static void numeroMenor(int numeros[]){
        int menor = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }     
        }
        System.out.println("El número menor es: " + menor);
        } 
}
