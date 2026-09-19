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

## Execution
- Por primera cosa he pensado a una estructura:
```text
├── README.md                      
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── gestor/
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
- creo todas las clases y él .csv
- he llamado ConsoleUI.start() desde el Main, creado el método en ConsoleUI con el menu y el método .readString() en ConsoleReader llamando una exception.
- He creado el metodo saveFromCSV() in Service para guardar todos los datos en el CSV en un Arraylist<Person> people.
- He creado el primer metodo addPerson() in Service que guarda el new Person ne el Array y tambièn la añade al CSV.
- He creado el primer metodo para organizar los datos showByNameAZ using .sort(Comparator.comapring())
- Teniendo el people.csv en resources he tenido problema a escribir datos
- He puesto csv en la carpeta principal del proyecto y usado FileReader para encontrar el file, leer y escribir.