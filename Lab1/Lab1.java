package Lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] enteredNumbers = new int[4];
        String[] enteredKeys = {"a", "b", "n", "m"};

        for (int index = 0; index < enteredKeys.length; index++) {
            System.out.printf("Введіть число %s :\n",enteredKeys[index]);
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Invalid inputted value type");
            }
            enteredNumbers[index] = scanner.nextInt();
        }
        final int a = enteredNumbers[0];
        final int b = enteredNumbers[1];
        final int n = enteredNumbers[2];
        final int m = enteredNumbers[3];
        final int C = 2;

        if(a > n || b > m) {
            throw new IllegalArgumentException("Invalid typed edges");
        }

        if (a <= -C && -C <= n) {
            throw new IllegalArgumentException("Function is not differentiated on all typed interval");
        }

        float sum = 0;
        for (double i = a; i <= n; i++)
        {
            for(double j = b; j <= m; j++)
            {
                sum += (i * j) / (i + C);
            }
        }

        System.out.printf("Result: %f", sum);

    }
}
