import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Метод програми, який запитує користувачів про кількість чисел і яку цифру потрібно знайти
         */

        System.out.print("Введіть кількість чисел Фібоначчі: ");
        int n = scanner.nextInt();

        System.out.print("Введіть задану цифру (0-9): ");
        int digit = scanner.nextInt();

        /**
         * Генерація чисел Фібоначі
         */

        FibonacciNumber[] fibonacciNumbers = new FibonacciNumber[n];

        int a = 0, b = 1;
        fibonacciNumbers[0] = new FibonacciNumber(0, a);
        if (n > 1) {
            fibonacciNumbers[1] = new FibonacciNumber(1, b);
        }

        System.out.println("Числа фібоначі:");
        for (int i = 2; i < n; ++i) {
            int c = a + b;
            fibonacciNumbers[i] = new FibonacciNumber(i, c);
            a = b;
            b = c;
            System.out.println(c);
        }

        System.out.println("Числа Фібоначчі, що закінчуються на цифру " + digit + ":");
        for (FibonacciNumber fn : fibonacciNumbers) {
            if (fn.getValue() % 10 == digit) {
                System.out.println(fn);
            }
        }

        scanner.close();
    }
}

