/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_multidimensionales;

/**
 *
 * @author Dell
 */
public class Array_multi_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generar una matriz de 3×3 con números aleatorios sin repetirse.
        iniciarArreglo();
    }
    public static void iniciarArreglo(){
        int matriz[][] = new int[3][3];
        llenarArreglo(matriz);
    }
    public static void llenarArreglo(int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = (int) (Math.random() * 10);
                }
            }
        }
    public static boolean numeroRepetido(int matriz[][], int valores){
        boolean repetido = false;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                valores = matriz[i][j];
  
            }
        }
    }   

