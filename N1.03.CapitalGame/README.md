# Exercici 3 — Capital Game

## 📌 Enunciat del exercici
En aquest exercici posarem en pràctica la lectura de fitxers, l’ús de col·leccions com HashMap i la interacció amb l’usuari mitjançant un petit joc de preguntes.

A partir del fitxer countries.txt (consulta l’apartat de recursos), que conté parelles de país i capital separades per comes, el programa ha de llegir totes les dades i emmagatzemar-les en un HashMap<String, String>, on la clau és el nom del país i el valor, la seva capital.

Un cop carregades les dades, el programa demanarà el nom de l’usuari/ària i començarà el joc.

El funcionament consisteix a realitzar 10 preguntes, escollint aleatòriament 10 països diferents del HashMap. En cada ronda, es mostrarà el nom d’un país i l’usuari/ària haurà d’introduir el nom de la seva capital. Si la resposta és correcta (tenint en compte majúscules i minúscules si cal), es sumarà un punt a la seva puntuació. Al final de les 10 preguntes, es mostrarà la puntuació total obtinguda.

En finalitzar les 10 preguntes, el programa guardarà el nom de l’usuari/ària i la seva puntuació en un fitxer anomenat classificacio.txt.

## ✨ Funcionalitats
- HashMap

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- Por primera cosa he movido el file countries.txt a resources
- Creando una clase MapFileUtils que permita atraves de dos metodos leer y escribir de un .txt.
- He creado una clase usando unas clases de Java: InputStream, InputStreamReader y BufferReader
- #### Estas clases permiten leer un .txt, transformalo en bytes y retransformarlo en caracteres para que BufferReader pueda leerlos. 
- br.readLine() permite leer una linea de ese .txt
- He puesto todo lo de readTxt() en un try-catch con un catch con IOException.
- teoricamente desde el main, llamando el metodo y especificando el nombre de un file en resources ahora se crea un HashMap con todos los valores del .txt
- He llamado el metodo del main, ya que no me devuelve elementos he usado un if-else para verificar que listCountries no estè vacia, efectivamente està vacia.
- #### el error estaba en .line.split(), habia puesto \d en vez de \s
- He creado una clase ConsoleReader que pueda manejar el Scanner y las excepciones.
- Tambièn he creado una excepcion personalizada NameInputError.
- 