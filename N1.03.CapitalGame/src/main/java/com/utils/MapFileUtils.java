package com.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
}
