package Lab2;

import java.util.Scanner;

public class Lab2 {
    private static Scanner scanner;

    public static void main(String[] args) throws Exception {

        /*
            Номер зачётки : 20
            C5 = 0 (C=a×B, a - const)
            C7 =  6 (float)
            C11 = 9 (Знайти середнє значення елементів кожного стовпчика матриця)

         */
        Lab2.scanner = new Scanner(System.in);

        System.out.println("Введіть розмір матриці:");

        final int N = Lab2.scanner.nextInt();

        System.out.println("Введіть матрицю:");
        final float[][] matrixB = receiveMatrix(N);

        System.out.println("Введіть константу :");
        final int a = Lab2.scanner.nextInt();

        final float[][] matrixC = new float[N][N];

        for (int index = 0; index < N; index++) {
            for (int jindex = 0; jindex < N; jindex++) {
                matrixC[index][jindex] = a * matrixB[index][jindex];
            }
        }

        System.out.println("Результати першої дії:");

        printMatrix(matrixC);

        System.out.println("Результати другої дії:");

        for (int jindex = 0; jindex < N; jindex++) {
            float sum = 0;
            for  (int index = 0; index < N; index++)  {
                sum += matrixC[index][jindex];
            }
            System.out.printf("%f ", sum / N);
        }
    }

    private static float[][] receiveMatrix(int size) throws Exception
    {

        float[][] matrix = new float[size][size];

        for(int index = 0; index < size; index++)
        {
            for(int jindex = 0; jindex < size; jindex++)
            {
                if(Lab2.scanner.hasNextFloat()) {

                    matrix[index][jindex] = Lab2.scanner.nextFloat();

                } else {
                    throw new Exception("Wrong Entered Matrix Element");
                }
            }
        }
        return matrix;
    }

    private static void printMatrix(float[][] matrix)
    {
        for(float[] row : matrix)
        {
            for(float element : row)
            {
                System.out.printf("%s\s", element);
            }
            System.out.printf("\n");
        };
    }
}
