# Ejercicio 1 — Gestor de personas con ordenación

## 📌 Enunciat del exercici
Crea una aplicación capaz de leer un archivo CSV. Este archivo tiene 3 campos: nombre, apellido y DNI, por cada registro. Se trata de ordenar a las personas leídas del fichero, mediante su nombre, apellido o DNI. Puedes utilizar la lista que creas más adecuada.

## ✨ Funcionalitats
- CSV
- Comparable and Comparator
- ConsoleUI
- Class Service
- InputStream and BufferedReader

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- Por primera cosa he pensado a una estructura:
```text
├── README.md                      
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── miproyecto/
        │           ├── main/
        │           │   └── Main.java          <-- Punto de entrada de la aplicación
        │           ├── model/
        │           │   └── Person.java        <-- Clase modelo (Nombre, Apellidos, DNI, etc.)
        │           ├── service/
        │           │   └── Service.java       <-- Lógica de negocio y lectura/procesamiento de datos
        │           └── ui/
        │               ├── ConsoleReader.java <-- Utilidad para la lectura segura por consola
        │               └── ConsoleUI.java     <-- Interfaz de usuario y flujo del menú
        └── resources/people.csv
```
- creo todas las clases y el .csv