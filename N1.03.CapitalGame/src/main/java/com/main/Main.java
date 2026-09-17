package com.main;

import com.console.ConsoleReader;
import com.utils.MapFileUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {

        Map<String,String> listCountries = new HashMap<>(MapFileUtils.readTxt("countries.txt"));

        String name = ConsoleReader.readStringName("Escribe el nombre del jugador");
        System.out.println("Hello " + name);

    }
}
