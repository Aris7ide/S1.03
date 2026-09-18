package com.gestor.main;

import com.gestor.service.Service;
import com.gestor.ui.ConsoleUI;

public class Main {
    static void main(String[] args) {

        Service service = new Service();
        ConsoleUI ui = new ConsoleUI(service);

        ConsoleUI.start();

    }
}
