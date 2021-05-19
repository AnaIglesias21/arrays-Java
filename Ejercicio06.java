/*
 * Programa que genera un array de 100 psosiciones con los números del 1 al 100.
 * Obtener la suma de los elemnstos y la media.
 */
package ejercicio06;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        int suma = 0;
        
        
        numeros = llenarArray();
        suma = obtenerSuma(numeros);
        System.out.println("\nLa suma es: "+suma+"\nLa media es: "+(suma/100));
    }

    private static int[] llenarArray() {
        int[] num = new int[100];
        
        for (int i=0;i<100;i++){
            num[i] = i+1;
            
        }
        
        return num;
    }

    private static int obtenerSuma(int[] numeros) {
        int suma = 0;
        
        for (int n:numeros){
            System.out.print(n+" ");
            suma += n;
            if (n%10 == 0){
                System.out.println();
            }
        }
        
        return suma;
    }
    
}
