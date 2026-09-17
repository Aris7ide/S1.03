package com.utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MapFileUtils {

    public static Map<String,String> readTxt(String fileName) {

        Map<String,String> map = new HashMap<>();

        try (InputStream is = MapFileUtils.class.getClassLoader().getResourceAsStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(is))){

            if (is == null) {
                System.err.println("Error: no se ha podido encontrar el file " + fileName);
            }

            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();

                String[] parts = line.split("\\s+");

                if (parts.length == 2) {
                    map.put(parts[0],parts[1]);
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return map;
    }

    public static void saveScore(String fileName, String name, int totalScore) {
        try (FileWriter fw = new FileWriter(fileName, true);
        BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(name + " " + totalScore);
            bw.newLine();

            System.out.println("El jugador y la puntuaciòn ha sido guardada");

        } catch (IOException e) {
            System.err.println("Ha habido un error: " + e.getMessage());
        }
    }
}
