/*
 * Programa que cree un array cuya dimensión se introduce por teclado.
 * Rellena el array con números aleatorios entre 0 y 9 y muestra por pantalla
 * el valor de cada posición y la suma de todos los valores. 
 * Hacer un método para rellenar el array que tenga como parámetros los núemros entre
 * los que tenga que generar, que muestre el contenido y la suma de los valores.
 * Otro método que genere los números aleatorios.
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio04 {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int dimension;
        int[] enteros;
        
        dimension = pedirDato("dimension");
        enteros = crearArray(dimension);
        entrada.close();
    }

    private static int pedirDato(String string) {
        int d = 0;
        
        do{
            System.out.print(string+": ");
            if (entrada.hasNextInt()){
                d = entrada.nextInt();
                if (d == 0 || d < 0){
                    System.out.println(string+" errónea");
                    entrada.next();
                    d = 0;
                }
            }else{
                System.out.println(string+" no numérica.");
                entrada.next();
                d = 0;
            }
            
        }while(d==0);
        
        return d;
    }

    private static int[] crearArray(int dimension) {
       int[] enteros = new int[dimension];
       int numInicio, numFin, suma = 0;
       
       do{
            numInicio = pedirDato("inicio");
            numFin = pedirDato("fin");
            if (numInicio>numFin){
                System.out.println("El inicio no puede ser mayor que el fin.");
            }
       }while(numInicio>numFin);
       
       for (int i=0;i<dimension;i++){
           enteros[i] = generaAleatorio(numInicio, numFin);
           System.out.println("enteros["+i+"]: "+enteros[i]);
           suma += enteros[i];
       }
       
        System.out.println("La suma de los valores del array es: "+suma);
        
       return enteros;
    }

    private static int generaAleatorio(int numInicio, int numFin) {
       int n =(int) Math.floor(Math.random()*(numFin-numInicio+1)+numInicio);
        
       return n;
    }

    
}
