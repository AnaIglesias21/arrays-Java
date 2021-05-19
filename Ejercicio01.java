/*
 * Progama que lee 10 números enteros por teclado y calcula cuántos son positivos
 * cuántos negativos y cuántos ceros
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio01 {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int[] enteros = new int[10];
        
        enteros = pedirNumeros();
        verArray(enteros);
        contarNumeros(enteros);
        
        entrada.close();
    }
    
    //Método para obtner en número por teclado
    private static int[] pedirNumeros() {
        int[] num = new int[10];
        int cont = 0;
        
        do{
            System.out.print("Número["+(cont+1)+"]: "); 
           
            if (entrada.hasNextInt()){
                num[cont] = entrada.nextInt();
                cont++;
            }else{
                System.out.println("Error en el número");
                entrada.next();
            }
     
        }while(cont<10);
            
        return num;
    }
    
    //Método que permite visualizar el contenido de un array
    private static void verArray(int[] enteros) {
        for (int n:enteros){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    
    //Método que cuenta los números positivos y negativos que hay en un array
    private static void contarNumeros(int[] enteros) {
       int positivo = 0, negativo = 0, ceros = 0;
       
       for (int n:enteros){
           if (n<0)
               negativo++;
               
            if (n==0)
               ceros++;
           
            if (n>0)
                positivo++;
       }
       
        System.out.println("Positivos: "+positivo);
        System.out.println("Negativos: "+negativo);
        System.out.println("Ceros: "+ceros);
        
    }
}

