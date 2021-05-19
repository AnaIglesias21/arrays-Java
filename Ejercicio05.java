/*
 * Programa que crea un array de números de un tamaño pasado por teclado. El array
 * contendrá números aleatorios primos entre los deseados. Motrar cual es el mayor
 * de todos.
 */
package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio05 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int dimension;
        int[] primos;
        
        dimension = pedirDato("Dimensión: ");
        primos = llenarArray(dimension);
        verArray(primos);
        
        entrada.close();
        
    }

    private static int pedirDato(String cadena) {
        int dato = 0;
        boolean esCorrecto = false;
        
        do{
            System.out.print(cadena); 
            if(entrada.hasNextInt()){
                dato = entrada.nextInt();
                if(dato == 0){
                    if(cadena.equalsIgnoreCase("Dimensión: ")){
                        System.out.println("La dimensión tiene que ser mayor a cero");
                        dato = 0;
                    }else{
                        esCorrecto = true;
                    }
                }else{
                    if (dato<0){
                        System.out.println("EL número no puede ser inferior a cero");
                        dato = 0;
                    }else{
                        esCorrecto = true;
                    }
                } 
            }
        }while (!esCorrecto);
        
        return dato;
    }

    private static int[] llenarArray(int dimension) {
        int[] primos = new int[dimension];
        int inicio = 0, fin = 0;
        
        do{
            inicio = pedirDato("Valor inicial: ");
            fin = pedirDato("Valor final: ");
            if (inicio>fin){
                System.out.println("El valor final no puede ser inferior al inicial");
            }
            
        }while (inicio>=fin);
        
        for (int i=0;i<dimension;i++){
            primos[i] = numeroPrimo(inicio, fin);
            
        }
        return primos;
    }

    private static int numeroPrimo(int inicio, int fin) {
        boolean estaRepetido = false;
       int n = (int) Math.floor(Math.random()*(fin-inicio+1)+inicio);
       
       if (!esPrimo(n)){
           return numeroPrimo(inicio, fin);
       }
       
       return n;
    }

    private static boolean esPrimo(int n) {
        int cont = 2;
        
        if (n == 1 || n == 0){
            return false;
        }
        if (n == 2 || n == 3 || n == 5){
            return true;
        }else{
            
            if (n%2 == 0){
                cont ++;
                
            }
            if (n%3 == 0){
                cont++;
            }
            if (n%5 == 0){
                cont ++;
            }
        
        }
        
        if (cont > 2)
            return false;
        
        return true;
    }

    private static void verArray(int[] primos) {
        int mayor = 0;
        
        for (int n:primos){
            System.out.print(n+" ");
            if (n > mayor){
                mayor = n;
            }
        }
        System.out.println("\nEl número primo mayor es el: "+mayor);
    }

    
    
}
