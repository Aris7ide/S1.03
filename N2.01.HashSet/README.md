# Ejercicio 1 — HashSet sin duplicados exactos

## 📌 Enunciat del exercici
Crea una clase llamada Restaurantcon dos atributos: nom (String)y puntuació (int). Implementa los métodos necesarios ( equals()i hashCode()) para que no se puedan introducir objetos Restaurantcon el mismo nombre y la misma puntuación dentro de uno HashSet.

## Importante

Puede haber restaurantes con el mismo nombre si la puntuación es diferente, pero no puede haber duplicados exactos (mismo nombre y misma puntuación).

## ✨ Funcionalitats
- HashSet
- equals() y hashcode()

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- he creado las clases Restaurant y Main
- He creado en Restauran los metodos equal(), hashCode() y toString haciendo un Override.
- Desde el Main he creado un HashSet llamado listRest y he añadido dos restaurantes.
- Los he llamados con un for (Restaurant r : listRest) y han salido correctamente llamando el .toString();
- Intentando añadir elementos iguales con misma puntuacion y mismo nombre no deja.