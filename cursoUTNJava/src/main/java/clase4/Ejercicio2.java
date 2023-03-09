package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Pablo\\Documents\\UTN Java\\Clase4\\Practica\\ej2.txt";
        String operacion = "";

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la operacion (sum o mul)");
        operacion = read.nextLine();

        int resultado = miFuncion(ruta, operacion);
        System.out.println(resultado);
    }

    private static int miFuncion (String ruta, String operacion){
        int resultado = 0;
        if (operacion.equals("mul")){
            resultado = 1;
        }
        try {
            for (String linea : Files.readAllLines(Paths.get(ruta))){
                if (operacion.equals("sum")){
                    resultado += Integer.parseInt(linea);
                }else{
                    resultado = resultado * Integer.parseInt(linea);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }
}
