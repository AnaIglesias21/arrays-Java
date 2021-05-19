/*
 * Programa que crea un array de 10 números enteros pedidos por teclado y muestre 
 * por pantallas el valor que corresponde a una posición dada. hacer 2 métodos,
 * uno para llenar el arrya y otro para mostrar el valor
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio03 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] enteros = new int[10];
        int posicion;
        
        enteros = pedirEnteros();
        verArray(enteros);
        posicion = pedirPosicion();
        System.out.println("Numero ["+posicion+"]: "+verNumero(posicion,enteros));
    }

    private static int[] pedirEnteros() {
        int[] enteros = new int[10];
        int i = 0;
        
        do{
            System.out.print("Número ["+(i+1)+"]: ");
            if (entrada.hasNextInt()){
                enteros[i] = entrada.nextInt();
                i++;
            }else{
                System.out.println("Número erróneo.");
                entrada.next();
            }
            
        }while(i<10);
        
        return enteros;
    }

    private static int pedirPosicion() {
        int posicion = 0;
        
        do{
            System.out.print("\nPosición a consultar: ");
            if (entrada.hasNextInt()){
                posicion = entrada.nextInt();
                if (posicion <0 || posicion >9){
                    System.out.println("Eroorn en el rango. Debes introducir un número entre 0 y 9 ambos inclisuve");
                    posicion = -1;
                    entrada.next();
                }
            }else{
                System.out.println("Error de dato");
                entrada.next();
                posicion = -1;
            }
            
        }while(posicion == -1);
        
        return posicion;
        
    }

    private static int verNumero(int posicion, int[] enteros) {
        int n = enteros[posicion];
        return n;
    }

    private static void verArray(int[] enteros) {
        
        for (int n:enteros){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    
}
