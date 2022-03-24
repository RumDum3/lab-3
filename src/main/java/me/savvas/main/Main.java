package me.savvas.main;

import java.util.Scanner;

public class Main {
    private static int counter = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        diskoi(64, 1, 2, 3);
    }

    private static void askhsh4() {
        for (int i=1; i<= 10000; i++) {
            if (isPrime(i, counter)) {
                System.out.println(i);
            }
        }
    }

    private static void askhsh3(Scanner scanner) {
        System.out.print("Dose arithmo [akeraio]: ");
        for (int i=1; i<=10; i++) {
            int input = scanner.nextInt();
            String strInput = String.valueOf(input);
            if (strInput.length() < 1 || strInput.length() > 5) {
                System.out.println("O arithmos den einai sostos");
                return;
            }

            if (isRecurrent(input)) {
                System.out.println("o arithmos einai palindromos");
            }
        }
    }

    private static void askhsh3String(Scanner scanner) {
        System.out.println("Dose symboloseira: ");
        String input = scanner.next();
        if (isRecurrent(input)) {
            System.out.println("h symboloseira einai palindromh");
        }
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }

    public static void diskoi(int arithmosDiskon, int stylos1, int stylos2, int stylos3) {
        if (arithmosDiskon == 1) {
            System.out.println(stylos1 + " -> " + stylos2);
            return;
        }

        diskoi(arithmosDiskon -1, stylos1, stylos3, stylos2);

        System.out.println(stylos1 + " -> " + stylos2);

        diskoi(arithmosDiskon -1, stylos3, stylos2, stylos1);
    }

    public static int paragontiko(int input) {
        if (input >= 1) return input * paragontiko(input - 1);
        else return 1;
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    public static boolean isRecurrent(String input) {
        char[] strArray = String.valueOf(input).toCharArray();

        switch (strArray.length) {
            case 1:
            case 2:
            case 3:
                if (strArray[0] == strArray[strArray.length - 1]) {
                    return true;
                }
                break;
            case 4:
            case 5:
                if (strArray[0] == strArray[strArray.length - 1] && strArray[1] == strArray[strArray.length - 2]) {
                    return true;
                }
                break;
        }
        return false;
    }

    public static boolean isRecurrent(int input) {
        char[] strArray = String.valueOf(input).toCharArray();

        switch (strArray.length) {
            case 1:
            case 2:
            case 3:
                if (strArray[0] == strArray[strArray.length - 1]) {
                    return true;
                }
                break;
            case 4:
            case 5:
                if (strArray[0] == strArray[strArray.length - 1] && strArray[1] == strArray[strArray.length - 2]) {
                    return true;
                }
                break;
        }
        return false;
    }
}
