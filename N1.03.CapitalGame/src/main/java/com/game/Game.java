package com.game;

import com.console.ConsoleReader;

import java.util.*;

public class Game {

    public static int startGame(Map listCountries) {

        int totalScore = 0;
        boolean value = false;

        for (int i = 0; i < 10; i++) {
            if (randomQuestion(listCountries,totalScore)) {
                totalScore++;
            }
        }
        return totalScore;
    }

    public static boolean randomQuestion(Map listCountries, int totalScore) {
        // Saca un elemento random del Map listCountries y un System print
        List<String> keys = new ArrayList<>(listCountries.keySet());
        boolean value = false;

        int randomIndex = new Random().nextInt(keys.size());

        String randomKey = keys.get(randomIndex);

        String answer = ConsoleReader.readStringName("Cual es la capital de " + randomKey);
        if (answer.equalsIgnoreCase((String) listCountries.get(randomKey))) {
            value = true;
        }

        return value;
    }
}
