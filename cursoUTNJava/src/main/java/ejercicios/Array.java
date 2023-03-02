package ejercicios;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Declaracion y manejos de array");

        //definicion de arrays
        //int numeros[] = new int[3];

        //para acceder a una posicion de memoria numeros[0]

        //inicializacion con valores
        int[] numeros = new int[] {1, 37, 0};
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);

        numeros[2] = 22;
        System.out.println("Posicion 2 = " + numeros[2]);

        //para ver la cantidad de elementos del array
        System.out.println("Cantidad de elementos del array " + numeros.length);

        //para recorrer el array
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posicoin " + i + " tiene el numero " + numeros[i]);
        }

        //recorrer con foreach (para cada elemento del array hace algo)
        for (int numero : numeros){
            System.out.println("El numero desde el for evolucionado " + numero);
        }

        //declaro array con el tamaño q ingresa el usuario
        int tamano = 0;
        System.out.println("Ingresa el tamaño del array ");
        tamano = read.nextInt();

        int[] numeros2 = new int[tamano];

        for (int i = 0; i < numeros2.length; i++){
            System.out.println("Ingresa el numero");
            numeros2[i] = read.nextInt();
        }

        for (int num : numeros2) {
            System.out.println("mostrando del array declarado por el uusario " + num);
        }


    }
}
