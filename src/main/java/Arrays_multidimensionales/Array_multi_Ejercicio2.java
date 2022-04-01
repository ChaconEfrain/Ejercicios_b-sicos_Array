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
public class Array_multi_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicializarArreglo();
    }
    public static void inicializarArreglo(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el total de filas y columnas de la matriz: ");
        int fila = lector.nextInt();
        int columna = lector.nextInt();
        int matriz[][] = new int[fila][columna];
        llenarArreglo(matriz, lector);
        leerArreglo(matriz);
    }
    public static void llenarArreglo(int matriz[][], Scanner lector){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Ingrese el valor de la fila " + i + " y de la columna " + j);
                int valor = lector.nextInt();
                matriz[i][j] = valor;
            }
        }
    }
    public static void leerArreglo(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
    }
   } 
}
