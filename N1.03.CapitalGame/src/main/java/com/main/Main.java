package com.main;

import com.console.ConsoleReader;
import com.game.Game;
import com.utils.MapFileUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {

        Map<String,String> listCountries = new HashMap<>(MapFileUtils.readTxt("countries.txt"));

        String name = ConsoleReader.readStringName("Escribe el nombre del jugador");
        boolean sn = ConsoleReader.readChar("Hello " + name + ", quieres empezar el juego? s/n");

        if (sn) {
            int finale = Game.startGame(listCountries);
            System.out.println(name + " has conseguido " + finale + " punto/s.");
        }

        //PUNTOS FINALES
        //Asegurarme de que se hayan guardado en classificacio.txt




    }
}
