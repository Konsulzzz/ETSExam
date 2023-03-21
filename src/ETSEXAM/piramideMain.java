package ETSEXAM;

import java.util.Scanner;

public class piramideMain {

    /**
     * Programa que crea dos objetos piramideModular con parámetros, imprime el
     * volumen de uno y compara el mayor volumen entre ambos.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pirámide 1
        double ladoBase, altura;
        double[] vectPiramide = valoresPiramide(sc);
        ladoBase = vectPiramide[0];
        altura = vectPiramide[1];
        piramideModular piramid1 = new piramideModular(ladoBase, altura);

        // Imprimir volumen
        System.out.println(piramid1.calcularVolumen());

        // Pirámide 2
        double ladoBaseOther, alturaOther;
        double[] vectPiramideOther = valoresPiramide(sc);
        ladoBaseOther = vectPiramideOther[0];
        alturaOther = vectPiramideOther[1];
        piramideModular piramid2 = new piramideModular(ladoBaseOther, alturaOther);

        // Comparar volúmenes pirámide
        if (piramid1.calcularVolumen() == piramid2.calcularVolumen()) {
            System.out.println("Son iguales");

        } else if (piramid1.calcularVolumen() > piramid2.calcularVolumen()) {
            System.out.println("La segunda pirámide cabe en la primera");
        } else {
            System.out.println("La primera pirámide cabe en la segunda");
        }

        sc.close();
    }

    /**
     * Método que pide al usuario por teclado dos valores, base y altura
     * 
     * @param sc Teclado ya inicializado
     * @return double[] Vector con dos valores, lado de la base y altura
     */
    private static double[] valoresPiramide(Scanner sc) {
        System.out.println("Inserta valor del lado de la base");
        double lado = sc.nextDouble();
        System.out.println("Inserta valor de la altura");
        double altura = sc.nextDouble();
        double[] vectorPiramide = { lado, altura };
        return vectorPiramide;
    }
}
