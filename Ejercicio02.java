/*
 * Programa que lee 10 números por teclado, calcula la media de los valores posi-
 * tivos y los negativos
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio02 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] enteros = new int[10];
        
        enteros = pedirNumeros();
        verArray(enteros);
        calculaMedia(enteros);
        entrada.close();
    }

    private static int[] pedirNumeros() {
        int[] numeros = new int[10];
        int cont = 0;
        
        do{
            
            System.out.print("Número ["+(cont+1)+"]: "); 
            if (entrada.hasNextInt()){
                numeros[cont] = entrada.nextInt();
                cont++;
            }else{
                System.out.println("Error en el número");
                entrada.next();
            }
            
        }while(cont<10);
        
        return numeros;
    }

    private static void verArray(int[] enteros) {
        double media;
        int suma = 0;
        
        for (int n:enteros){
            System.out.print(n+" ");
            suma += n;
        }
        
        System.out.println();
    }
    
    private static void calculaMedia(int[] enteros){
        int contPos = 0, contNega = 0, sumaPos = 0, sumaNega = 0;
        
        for (int n:enteros){
            if (n>0){
               sumaPos += n;
               contPos++;
            }else {
                if (n<0){
                    sumaNega += n;
                    contNega++;
                }
            }
            
        }
        
        System.out.println("Positivos: "+ contPos+" Suma positivos: "+sumaPos+" Media: "+(sumaPos/contPos));
        System.out.println("Negativos: "+contNega+" Suma negativos: "+sumaNega+" Media: "+ (sumaNega/contNega));
    }
}
