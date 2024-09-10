package co.edu.uniquindio.pr3.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class DadosBacktracking {

    public static void main(String[] args) {
        int N = 2;
        int Caras = 6;


        lanzarDados(N, Caras);
    }

    public static void lanzarDados(int n, int caras) {
        List<Integer> combinacionActual = new ArrayList<>();
        lanzarDados(n, caras, combinacionActual);
    }

    private static void lanzarDados(int n, int Caras, List<Integer> combinacionActual) {

        if (n == 0) {
            System.out.println(combinacionActual);
            return;
        }

        for (int i = 1; i <= Caras; i++) {

            combinacionActual.add(i);

            lanzarDados(n - 1, Caras, combinacionActual);

            combinacionActual.remove(combinacionActual.size() - 1);
        }
    }


}
