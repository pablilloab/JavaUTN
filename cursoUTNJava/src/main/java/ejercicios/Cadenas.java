package ejercicios;

import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String txt1 = "Hola";
        String txt2 = "CHAU";

        //para traer una posicion especifica de la cadena
        System.out.println(txt1.charAt(2));

        //para comparar cadenas
        System.out.println(txt1.equals(txt2));

        //para ver el largo de la cadena
        System.out.println(txt1.length());

        //para pasar a mayusculas
        System.out.println(txt1.toUpperCase());

        //para pasar a minusculas
        System.out.println(txt2.toLowerCase());

        //para ver si una cadena contiene a otra
        System.out.println(txt1.contains("la"));

        //ver si inicia o termina con
        System.out.println(txt1.startsWith("H"));
        System.out.println(txt1.endsWith("a"));

        //para reemplazar
        String cadena = txt1.replace("a","x");
        System.out.println(cadena);

        String saludo = "hola que tal?" ;
        String[] saludoPartido1 = saludo.split(" ");

        for (String letra : saludoPartido1) {
            System.out.println(letra);
        }

        //salto de linea \n
        //tabulacoin \t
        //para poner " o \ dentro de un string con "" se ua la \ --> \" o \\
    }
}
