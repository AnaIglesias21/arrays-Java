/*
 * Programa que crea dos array de tamaño indicado por teclado. Los arrays serán 
 * rellenados con números aleatorios(límites introducidos por el usuario). Se 
 * programa un método para obtener un array con el producto de los 2 anteriores.
 * Debe mostrarse el contenido de cada array.
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Ejercicio09 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] factor1, factor2, producto;
        int dimension, limiteInferior, limiteSuperior;
        
        dimension = pedirDato("Dimensión", false);
        
        do{
            limiteInferior = pedirDato("Límite inferior para generar aleatorio",true);
            limiteSuperior = pedirDato("Límite superior para generar aleatorio",true);
            if (limiteInferior >= limiteSuperior){
                System.out.println("El límite inferior no puede ser mayor o igual al superior para generar los aleatorios");
            }
        }while(limiteInferior>=limiteSuperior);  
        
        //llenamos los arrays con números aleatorios entre limiteInferior y Superior
        factor1 = llenarArray(dimension, limiteInferior, limiteSuperior);
        factor2 = llenarArray(dimension, limiteInferior, limiteSuperior);
        
        //visualizamos los arrays creados
        System.out.print("Array1: ");
        verArray(factor1);
        System.out.print("Array2: ");
        verArray(factor2);
        
        //creamos el array producto
        producto = productoArrays(dimension,factor1,factor2);
        System.out.print("Array producto: ");
        verArray(producto);
        
        entrada.close();
    }
    //Método que pide datos numéricos por teclado, valida el dato y si es correcto
    //devuelve el mismo 
    private static int pedirDato(String dato, boolean aceptaCero) {
        int n = -1;
        
        do{
            System.out.print(dato+": ");
            if (entrada.hasNextInt()){
                n = entrada.nextInt();
                if (!aceptaCero){
                    if (n<=0){
                        System.out.println("Error."+dato+" debe ser mayor a cero.");
                        n = -1;
                    }
                }else{
                    if (n<0){
                        System.out.println("Error."+dato+" debe ser mayor a cero");
                    }
                }    
            }else{
                System.out.println("Error. Dato no numérico");
                entrada.next();
            }
        }while (n<0);
        return n;
    }

    private static int[] llenarArray(int dimension, int limiteInferior, int limiteSuperior) {
        int[]array = new int[dimension];
        
        for (int i=0;i<array.length;i++){
            array[i]= (int)Math.floor(Math.random()*(limiteSuperior-limiteInferior+1)+limiteInferior);
        }
        
        return array;
    }

    private static void verArray(int[] factor1) {
        for (int n:factor1){
            System.out.print(n+" ");
        }
        
        System.out.println();
    }

    private static int[] productoArrays(int dimension,int[] factor1, int[] factor2) {
        int[] producto = new int[dimension];
        
        for (int i=0;i<dimension;i++){
            producto[i] = factor1[i]*factor2[i];
        }
        
        return producto;
    }

    
    
}
