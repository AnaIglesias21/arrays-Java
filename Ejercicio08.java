/*
 * Programa que pida al usuario por teclado una frase y pasar sus caracteres a 
 * un array de caracteres.
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio08 {
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        String frase = "";
        
        do{
            System.out.print("Frase: "); 
            frase = entrada.nextLine();
            
        }while (frase.isEmpty());
        
        //char[] caracteres = frase.toCharArray();
        char[] caracteres = new char[frase.length()];
        
        for (int i=0;i<frase.length();i++){
            caracteres[i] = frase.charAt(i);
        }
        
        for (int c:caracteres){
            System.out.print((char)c+" ");
        }
        
    }
    
}
