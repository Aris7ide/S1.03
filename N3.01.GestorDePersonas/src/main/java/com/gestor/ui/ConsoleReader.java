package com.gestor.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.err.println("Inserir un numero entre 0 y 7");
                scanner.nextLine();
            }
        }
    }

    public static String readString(String message) {
        while(true) {
            System.out.println(message);
            try {
                String value = scanner.nextLine().trim();

                if (value.isEmpty()) {
                    throw new IllegalArgumentException("El valor no es valido.");
                }

                return value;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
