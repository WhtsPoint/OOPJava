package Lab2;

import java.util.Scanner;

public class Lab2 {
    private static Scanner scanner;

    public static void main(String[] args) {

        /*
            Номер зачётки : 20
            C5 = 0 (C=a×B, a - const)
            C7 =  6 (float)
            C11 = 9 (Знайти середнє значення елементів кожного стовпчика матриця)

         */
        Lab2.scanner = new Scanner(System.in);

        System.out.println("Введіть розмір матриці:");


        final int yLength = Lab2.scanner.nextInt();

        final int xLength = Lab2.scanner.nextInt();


        if(xLength < 0 || yLength < 0) throw new IllegalArgumentException("Розміри матриці повинні бути натуральним числом");

        System.out.println("Введіть матрицю:");
        final float[][] matrixB = receiveMatrix(yLength,xLength);

        System.out.println("Введіть константу :");
        final float a = Lab2.scanner.nextFloat();


        final float[][] matrixC = new float[yLength][xLength];

        for (int index = 0; index < yLength; index++) {
            for (int jindex = 0; jindex < xLength; jindex++) {
                matrixC[index][jindex] = a * matrixB[index][jindex];
            }
        }

        System.out.println("Результати першої дії:");

        printMatrix(matrixC);

        System.out.println("Результати другої дії:");

        for (int jindex = 0; jindex < xLength; jindex++) {
            float sum = 0;
            for (int index = 0; index < yLength; index++) {
                sum += matrixC[index][jindex];
            }
            System.out.printf("%f ", sum / yLength);
        }
    }

    private static float[][] receiveMatrix(int y, int x) {

        float[][] matrix = new float[y][x];

        for (int index = 0; index < y; index++) {
            for (int jindex = 0; jindex < x; jindex++) {
                if (Lab2.scanner.hasNextFloat()) {

                    matrix[index][jindex] = Lab2.scanner.nextFloat();

                } else {
                    throw new IllegalArgumentException("Wrong Entered Matrix Element");
                }
            }
        }
        return matrix;
    }

    private static void printMatrix(float[][] matrix) {
        for (float[] row : matrix) {
            for (float element : row) {
                System.out.printf("%s\s", element);
            }
            System.out.printf("\n");
        }
    }


}
