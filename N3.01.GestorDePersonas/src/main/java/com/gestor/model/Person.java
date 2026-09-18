package com.gestor.model;

public class Person {

    String name;
    String surname;
    String dni;

    public Person(String dni, String surname, String name) {
        this.dni = dni;
        this.surname = surname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return name + " " + surname + "|" + dni;
    }
}
