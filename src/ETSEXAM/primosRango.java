package ETSEXAM;

import java.util.Scanner;

/**
 * Números primos entre dos valores
 * 
 * @author Christian
 */

public class primosRango {

    /**
     * Devuelve los valores primos de entre un determinado rango pedido al
     * usuario
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vecRangos = leerValores(sc);
        int rango1 = vecRangos[0];
        int rango2 = vecRangos[1];

        int rangoFin, rangoIni;
        rangoFin = determinarRangos(rango1, rango2)[0];
        rangoIni = determinarRangos(rango1, rango2)[1];
        imprimirPrimos(rangoIni, rangoFin);
        sc.close();
    }

    /**
     * Lee por teclado dos valores
     * 
     * @param sc Teclado para leer del usuario
     * @return int[] Vector con los dos valores leídos
     */
    public static int[] leerValores(Scanner sc) {
        int num1, num2;
        System.out.print("Introduzca primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        num2 = sc.nextInt();
        int[] vectorNum = { num1, num2 };
        return vectorNum;

    }

    /**
     * Compara dos rangos para determinar el mayor y el menor
     * 
     * @param rangoA Primer valor a comparar
     * @param rangoB Segundo valor a comparar
     * @return int[] Vector con los dos rangos comparados, siendo el de la primera
     *         posición el mayor
     */
    public static int[] determinarRangos(int rangoA, int rangoB) {
        int rangoMayor, rangoMenor;
        if (rangoA > rangoB) {
            rangoMayor = rangoA;
            rangoMenor = rangoB;
        } else {
            rangoMayor = rangoB;
            rangoMenor = rangoA;
        }
        int[] vectRangos = { rangoMayor, rangoMenor };
        return vectRangos;

    }

    /**
     * Imprime, en función de dos números, los primos entre estos
     * 
     * @param rangoIni Número de partida
     * @param rangoFin Número donde finaliza el programa
     */
    public static void imprimirPrimos(int rangoIni, int rangoFin) {
        boolean esPrimo;

        for (int i = rangoIni; i <= rangoFin; i++) {
            esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.println(i + " ");
            }
        }
    }

}