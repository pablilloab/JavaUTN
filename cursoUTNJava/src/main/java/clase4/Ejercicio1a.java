package clase4;

import ejercicios.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1a {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Integer [] numeros = new Integer [3];
        String orden;

        System.out.println("Ingres el primer numero ");
        numeros[0] = read.nextInt();
        System.out.println("Ingrese el segundo numero");
        numeros[1] = read.nextInt();
        System.out.println("Ingres el tercer numero");
        numeros[2] = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese el orde (a-> ascendente / d-> descendente");
        orden = read.nextLine();

        ordena(numeros, orden);
        for (int numero : numeros){
            System.out.println(numero);
        }

        int sumatoria = suma(numeros);

        System.out.println("La sumatoria es " + sumatoria );



    }

    private static Integer[] ordena (Integer[] numeros, String orden) {
        int [] arrayOrdenado = new int[3];
        if (orden.equals("a")) {
            Arrays.sort(numeros);
        }else{
            Arrays.sort(numeros, Collections.reverseOrder());
        }

        return numeros;
    }

    private static int suma (Integer[] numeros){
        int sumatoria = 0;
        for (int num : numeros){
            sumatoria += num;
        }
        return sumatoria;
    }
}


