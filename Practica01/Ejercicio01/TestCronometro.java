import java.util.Random;

public class TestCronometro {
    public static void main(String[] args) {
        int n = 100000;
        int[] numeros = new int[n];
        Random rand = new Random();

        // Generar 
        for (int i = 0; i < n; i++) {
            numeros[i] = rand.nextInt(1000000);
        }

        Cronometro c = new Cronometro();
        c.inicia();

        for (int i = 0; i < numeros.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numeros[minIndex];
            numeros[minIndex] = numeros[i];
            numeros[i] = temp;
        }


        c.detener();

        System.out.println("Tiempo de ejecución: " + c.lapsoDeTiempo() + " ms");
    }
}
