package com.console;

import com.exception.CharError;
import com.exception.NameInputError;

import java.util.Scanner;

public class ConsoleReader {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static String readStringName(String message) {
        while (true) {
            System.out.println(message);
            try {
                String name = SCANNER.nextLine();

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

    public static boolean readChar(String message) {
        while (true) {
            System.out.println(message);
            try {
                boolean value = false;
                String answer = SCANNER.nextLine();

                if (answer.equals("s") || answer.equals("n")) {
                    return answer.equals("s");
                } else {
                    throw new CharError("Tiene que ser s o n");
                }
            } catch (CharError | NameInputError e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
