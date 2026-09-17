package com.console;

import com.exception.NameInputError;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    public static String readStringName(String message) {

        while (true) {
            System.out.println(message);
            try {
                String name = scanner.nextLine();

                if (name.isEmpty()) {
                    throw new NameInputError("El nombre no es valido");
                }

                if (name.matches(".*\\d.*")) {
                    throw new NameInputError("El nombre no es valido");
                }

                return name;

            } catch (NameInputError e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
