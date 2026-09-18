package com.gestor.ui;

import com.gestor.service.Service;

public class ConsoleUI {

    public ConsoleUI() {

    }

    public static void start() {
        int option = 1;
        while (option != 0) {
            System.out.println("1. Introduir persona.  \n" +
                    "2. Mostrar les persones ordenades per nom (A-Z).  \n" +
                    "3. Mostrar les persones ordenades per nom (Z-A).  \n" +
                    "4. Mostrar les persones ordenades per cognoms (A-Z).  \n" +
                    "5. Mostrar les persones ordenades per cognoms (Z-A).  \n" +
                    "6. Mostrar les persones ordenades per DNI (1-9).  \n" +
                    "7. Mostrar les persones ordenades per DNI (9-1).  \n" +
                    "0. Sortir.");
            option = ConsoleReader.readInt("");

            switch (option) {
                case 1:
                    Service.addPerson();
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 0:
                    option = 0;
                    break;
            }
        }
    }

}
