package clase3;

public class Ejercicio1b {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 1;
        int num3 = 3;
        // 5 1 3
        int[] ordenados = new int[3];

        if (num1 > num2) {
            if (num1 > num3) {
                ordenados[2] = num1;
                if (num2 > num3){
                    ordenados[0] = num3;
                }else{
                    ordenados[0] = num2;
                    ordenados[1] = num3;
                }
            }else{
                ordenados[0] = num2;
                ordenados[1] = num1;
                ordenados[2] = num3;
            }
        }else{
            if(num2 > num3){
                ordenados[2] = num2;
                if (num1 > num3){
                    ordenados[1] = num1;
                    ordenados[0] = num3;
                }
            }else{
                ordenados[0] = num1;
                ordenados[1] = num2;
                ordenados[2] = num3;
            }
        }

        for (int numero : ordenados) {
            System.out.println(numero);
        }


    }
}
