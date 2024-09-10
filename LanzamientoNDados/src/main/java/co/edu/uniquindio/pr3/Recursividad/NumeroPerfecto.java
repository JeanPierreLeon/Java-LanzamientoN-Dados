package co.edu.uniquindio.pr3.Recursividad;

public class NumeroPerfecto {


    public static void main(String[] args) {
    int numero = 6;
    if (esPerfecto(numero)) {
        System.out.println(numero + " es un número perfecto.");
    } else {
        System.out.println(numero + " no es un número perfecto.");
    }
}

    public static int sumaDivisores(int n, int divisor) {

        if (divisor == 1) {
            return 1;
        }

        if (n % divisor == 0) {
            return divisor + sumaDivisores(n, divisor - 1);
        } else {

            return sumaDivisores(n, divisor - 1);
        }
    }


    public static boolean esPerfecto(int n) {

        return n == sumaDivisores(n, n / 2);
    }


}
