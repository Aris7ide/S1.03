# Ejercicio 2 — Ordenación múltiple

## 📌 Enunciat del exercici
Crea una clase llamada Restaurantcon dos atributos: nom (String)y puntuació (int). Implementa los métodos necesarios ( equals()i hashCode()) para que no se puedan introducir objetos Restaurantcon el mismo nombre y la misma puntuación dentro de uno HashSet.

## Importante
A partir de la clase Restaurantdel programa anterior, implementa la funcionalidad necesaria para que los objetos se puedan ordenar alfabéticamente por su nombre y, en caso de que coincidan, por puntuación en orden descendente .

Puedes hacerlo implementando la interfaz Comparableo mediante un Comparator, según consideres más adecuado.

## ✨ Funcionalitats
- Comparable

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- he copiado Main y Restaurant del ejercicio previo.
- He creado el metodo compareTo con un Overrida implementando Comparable<> en la clase Restaurant
- He creado reglas personalizadas en el metodo
- En el Main he creado mas restaurantes y despues de haber convertido el HashSet a List he llamado un Collections.sort
- La lista sale ordenada.
- Para hacer una prueba he cambiado el orden de la lista invertiendo this.name con other.name y this.points con other.points