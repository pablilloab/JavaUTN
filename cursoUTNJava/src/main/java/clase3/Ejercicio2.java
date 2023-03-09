package clase3;

public class Ejercicio2 {
    public static void main(String[] args) {
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        String cadena= "hola que tal";
        int offset = 1;
        String nuevaCadena = "";
        int nuevoOffset = 0;

        for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == ' '){
                nuevaCadena += "a";
            }else{
                for (int j = 0; j < abc.length(); j++){
                    if (cadena.charAt(i) == abc.charAt(j)){
                        nuevoOffset = j + offset;
                        if (nuevoOffset > abc.length()){
                            nuevoOffset = 0;
                        }
                        nuevaCadena +=   Character.toString(abc.charAt(nuevoOffset));
                    }
                }
            }

        }
        System.out.println("la cadena luego del desplazamiento es:");
        System.out.println(nuevaCadena);
    }
}
