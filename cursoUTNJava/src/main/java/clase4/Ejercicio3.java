package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la operacion (cod - dcod)");
        String operacion = read.nextLine();
        read.nextLine();

        System.out.println("Ingrese el desplazamiento");
        int desp = read.nextInt();

        String entrada = "C:\\Users\\Pablo\\Documents\\UTN Java\\Clase4\\Practica\\entrada.txt";
        String salida = "C:\\Users\\Pablo\\Documents\\UTN Java\\Clase4\\Practica\\salida.txt";

        decodificador(operacion, desp, entrada, salida);
        System.out.println("Operacion concretada satisfactoriamente");
    }

    public static void decodificador (String operacion, int desp, String entrada, String salida){
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        String cadena;
        int offset = desp;
        int nuevoOffset = 0;
        String nuevaCadena = "";
        try {
            cadena= Files.readAllLines(Paths.get(entrada)).toString();
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == ' ') {
                    nuevaCadena += "a";
                } else {
                    for (int j = 0; j < abc.length(); j++) {
                        if (cadena.charAt(i) == abc.charAt(j)) {
                            nuevoOffset = j + offset;
                            if (nuevoOffset > abc.length()) {
                                nuevoOffset = 0;
                            }
                            nuevaCadena += Character.toString(abc.charAt(nuevoOffset));
                        }
                    }
                }
            }
            Files.writeString(Paths.get(salida), nuevaCadena);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
