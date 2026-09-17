package com.main;

import com.utils.MapFileUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {

        Map<String,String> listCountries = new HashMap<>(MapFileUtils.readTxt("countries.txt"));

        if (!listCountries.isEmpty()) {

            for (Map.Entry<String, String> d : listCountries.entrySet()) {
                String key = d.getKey();
                String value = d.getValue();

                System.out.println("Pais: " + key + ", ciudad: " + value);
            }
        } else {

            System.err.println("La lista està vacia.");
        }

    }
}
