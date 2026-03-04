import java.util.Scanner;

public class EstadisticasPOO {

    static class Estadistica {
        private double[] datos;

        public Estadistica(double[] datos) {
            this.datos = datos;
        }

        public double promedio() {
            double suma = 0;
            for (double d : datos) {
                suma += d;
            }
            return suma / datos.length;
        }

        public double desviacion() {
            double prom = promedio();
            double suma = 0;
            for (double d : datos) {
                suma += Math.pow(d - prom, 2);
            }
            return Math.sqrt(suma / (datos.length - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        Estadistica est = new Estadistica(numeros);

        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviación estándar es " + est.desviacion());

        sc.close();
    }
}
