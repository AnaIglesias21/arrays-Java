/*
 * Programa que genere un array con las letras de la a a la z en minúsculas. Se
 * irán pidiendo posiciones por teclado y si la posición es correcta se añadirá 
 * el caracter anuna cadena que se mostrará cuando se introduca la posición -1.
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio07 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        char[] letras = new char[27];
        int posicion = 0;
        String cadena = "";
       
        letras = llenarArray();
        do{
            posicion = pedirPosicion(letras.length);
            System.out.println("LLega aquí" + posicion);
            if (posicion != -1){
                cadena += letras[posicion];
            }
            
        }while(posicion!=-1);
        
        System.out.println("Cadena: "+cadena);
        
        entrada.close();
    }
    
    private static char[] llenarArray(){
        char[] Char = new char[27];
        int l = 97;
        for (int i=0;i<27;i++){
            if (i==14){
                Char[i] = (char)241;
            }else{
                Char[i] = (char)l;
                l++;
            }    
            System.out.print(Char[i]+" ");
        }
        
        System.out.println();
        return Char;
    }

    private static int pedirPosicion(int length) {
        int p = 0;
        
        do{
            System.out.print("Posición: ");
            if (entrada.hasNextInt()){
                p = entrada.nextInt();
                if (p<-1 || p>26){
                    System.out.println("Debes introducir un número entre -1 y 27 ambos inclusive");
                }
            }else{
                System.out.println("Error. Posición errónea");
                entrada.next();
                p = 0;
            }
            
        }while(p<-1 || p>26);
        
        return p;
    }
}
