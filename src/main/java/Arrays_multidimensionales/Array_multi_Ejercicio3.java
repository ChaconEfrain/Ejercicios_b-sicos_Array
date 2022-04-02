/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_multidimensionales;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Array_multi_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear una matriz de 5 filas y n columnas (se pide al usuario). 
        //Rellenarlo con números aleatorios entre 0 y 10.
        inicializarArreglo();
    }
    public static void inicializarArreglo(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el número de columnas de la matriz: ");
        int columnas = lector.nextInt();
        int matriz[][] = new int [5][columnas];
        System.out.println("La matriz queda de la siguiente manera:");
        llenarArreglo(matriz);
    }
    public static void llenarArreglo(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = (int) (Math.random() * 10);                
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
