package clase3;

public class Ejercicio1c {
    public static void main(String[] args) {
        int[] numeros = new int [] {15,25,33,2,12,27,50,123,9,13};
        int mayoresQue = 50;
        int suma = 0;

        for (int numero : numeros){
            if (numero > mayoresQue) {
                suma += numero;
            }
        }

        System.out.println("la suma de los mayores a " + mayoresQue + " es " + suma);
    }
}
