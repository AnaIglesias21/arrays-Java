/*
 * Programa que crea un array de números cuyo tamaño se indica por teclado.
 * El array contendrá números aleatorios entre 1 y 300 y mostrará aquellos que 
 * acaben en un dígito que se indique por teclado; éstos deben guardarse en un array.
 */
package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio10 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] numeros;
        ArrayList consulta = new ArrayList();
        int dimension, digito;
        
        //pedimos el tamaño del array
        dimension = pedirDato("Dimensión");
        //generamos el array con aleatorios entre 1 y 300
        numeros = llenarArray(dimension);
        //visualizamos elcontenido del array
        verArray(numeros);
        
        //pedimos el dígito
        digito = pedirDato("Dígito");
        //recorremos el array buscando los números que acaben en digito y los almacenamos
        //en un array
        consulta = obtenerResultado(numeros,digito);
        //visualizamos el array consulta
        System.out.println("Consulta: ");
        for (Object c:consulta){
            System.out.print(c+" ");
        }
        
        entrada.close();
    }
    //Método que pide datos numéricos por teclado, valida el dato y si es correcto
    //devuelve el mismo 
    private static int pedirDato(String dato) {
        int n = 0;
        
        do{
            System.out.print(dato+": ");
            if (entrada.hasNextInt()){
                n = entrada.nextInt();
                
                if (n<=0){
                    System.out.println("Error."+dato+" debe ser mayor a cero.");   
                    n = 0;
                }
                  
            }else{
                System.out.println("Error. Dato no numérico");
                entrada.next();
            }
            
        }while (n==0);
        
        return n;
    }
    //Método que rellena un array de tamaño indicado con números aleatorios entre
    // 1 y 300 ambos inclisive
    private static int[] llenarArray(int dimension) {
        int[] numeros = new int[dimension];
        
        for (int i=0;i<dimension;i++){
            numeros[i]=(int)Math.floor(Math.random()*(300-1+1)+300);
        }
        return numeros;
    }
    //Método que visualiza el contenido de una array indicado como parámetro
    private static void verArray(int[] numeros) {
        for (int n:numeros){
            System.out.print(n+" ");
        }
        
        System.out.println();
    }
    //Médtodo para almacenar en un arrayList los números que cumplen la condición
    private static ArrayList obtenerResultado(int[] numeros, int digito) {
        ArrayList consulta = new ArrayList();
        
        for (int n:numeros){
            if (ultimoDigito(n,digito)){
                consulta.add(n);
            }
        }
        return consulta;
    }
    //Método que comprueba si el último digito de un número coincide con el buscado
    private static boolean ultimoDigito(int n, int digito) {
        String num = String.valueOf(n);//pasamos el número a string
        String d = String.valueOf(digito);
        
        if (num.endsWith(d)){
            return true;
        }
        
        return false;
    }
}
