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
public class Array_multi_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estructura de una matriz:
        //Tipo de dato + nombre[][] = new Tipo de dato [Fila][Columna];
        int matriz[][] = new int [3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
