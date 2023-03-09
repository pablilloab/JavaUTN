package clase3;

public class Ejercicio1a {
    public static void main(String[] args) {

        char letra = 'a';
        String cadena = "avenida siempre viva";
        int recuento = 0;

        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == letra ){
                recuento++ ;
            }
        }
        System.out.println("La letra " + letra + " aparece " + recuento + " veces");
    }
}
