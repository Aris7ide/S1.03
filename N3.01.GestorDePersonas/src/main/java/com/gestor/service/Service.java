package com.gestor.service;

import com.gestor.model.Person;
import com.gestor.ui.ConsoleReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Service {

    private static List<Person> listPeople;
    private static String nameFileCSV;

    public Service() {
        this.listPeople = new ArrayList<>();
        this.nameFileCSV = "N3.01.GestorDePersonas/people.csv";

        saveFromCSV();
    }

    private void saveFromCSV() {

            try (BufferedReader br = new BufferedReader(new FileReader(nameFileCSV))){
                String line;
                boolean isHeader = true;

                while ((line = br.readLine()) != null) {
                    line = line.trim();

                    if (line.isEmpty()) {
                        continue;
                    }

                    if (isHeader) {
                        isHeader = false;
                        continue;
                    }

                    String[] parts = line.split(",");

                    if (parts.length == 3) {
                        String name = parts[0].trim();
                        String surname = parts[1].trim();
                        String dni = parts[2].trim();

                        Person person = new Person(dni,surname,name);
                        listPeople.add(person);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }

    }

    public static void saveToCSV(Person person) {

        try (FileWriter fw = new FileWriter(nameFileCSV, true);
        BufferedWriter br = new BufferedWriter(fw)){
            String line = person.getName() + "," + person.getSurname() + "," + person.getDni();
            br.write(line);
            br.newLine();

            System.out.println("Persona guardada correctamente.");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void addPerson() {
        String name = ConsoleReader.readString("Cual es el nombre?");
        String surname = ConsoleReader.readString("Cual es el apellido?");
        String dni = ConsoleReader.readString("Dni?");

        listPeople.add(new Person(dni,surname,name));
        Service.saveToCSV(new Person(dni,surname,name));
    }

    public static void showByNameAZ() {
        listPeople.sort(Comparator.comparing(Person::getName));
        listPeople.forEach(p -> System.out.println(p));
    }

    public static void showByNameZA() {
        listPeople.sort(Comparator.comparing(Person::getName).reversed());
        listPeople.forEach(p -> System.out.println(p));
    }

    public static void showBySurnameAZ() {
        listPeople.sort(Comparator.comparing(Person::getSurname));
        listPeople.forEach(p -> System.out.println(p));
    }

    public static void showBySurnameZA() {
        listPeople.sort(Comparator.comparing(Person::getSurname).reversed());
        listPeople.forEach(p -> System.out.println(p));
    }

    public static void showByDniAZ() {
        listPeople.sort(Comparator.comparing(Person::getDni));
        listPeople.forEach(p -> System.out.println(p));
    }

    public static void showByDniZA() {
        listPeople.sort(Comparator.comparing(Person::getDni).reversed());
        listPeople.forEach(p -> System.out.println(p));
    }
}
