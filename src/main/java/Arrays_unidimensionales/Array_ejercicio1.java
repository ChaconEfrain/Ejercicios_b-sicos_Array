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
public class Array_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // estructura para inicializar un arreglo:
        // tipo de dato + nombre del arreglo [] = new + tipo del arreglo[tamaño del arreglo]
        
        inicializarArreglo();
    }
    public static void inicializarArreglo(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        int length = lector.nextInt();
        String nombres[] = new String[length];
        llenadoDeArreglo(nombres, lector);
        //leerArreglo(nombres);
        String nombre2 = nombres[1];
        System.out.println(nombre2);
    }
    public static void llenadoDeArreglo(String lista[], Scanner lector){
        for(int i = 0; i < lista.length; i++){
            System.out.println("Ingrese su nombre:");
            String nombre = lector.next();
            lista[i] = nombre;
        }
//La primera vuelta i vale cero
//lista[0] = Juan
//i = 1
//lista[1] = Joel
//i = 2
//lista[2] = Efrain
    }
    public static void leerArreglo(String lista[]){
        for(int i = 0; i < lista.length; i++){
            //i = 0
            //lista índice cero = imprime "Juan"
            //i = 1
            //lista índice 1 = imprime "Joel"
            //i = 2
            //lista índice 2 = imprime Efrain
            System.out.println("En el índice " +i+ " está el valor: " +lista[i]);
        }
    }
    
}
