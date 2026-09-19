package com.gestor.ui;

import com.gestor.service.Service;

public class ConsoleUI {

    public ConsoleUI(Service service) {

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
                    break;
                case 2:
                    Service.showByNameAZ();
                    break;
                case 3:
                    Service.showByNameZA();
                    break;
                case 4:
                    Service.showBySurnameAZ();
                    break;
                case 5:
                    Service.showBySurnameZA();
                    break;
                case 6:
                    Service.showByDniAZ();
                    break;
                case 7:
                    Service.showByDniZA();
                    break;
                case 0:
                    option = 0;
                    break;
            }
        }
    }

}
