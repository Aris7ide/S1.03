# Nivell 1 Exercici 1 — Duplicats

## 📌 Enunciat del exercici
Crea una classe anomenada Month amb un atribut name, que emmagatzemi el nom del mes. Afegeix 11 objectes Month a un ArrayList, deixant fora "Agost". Insereix aquest mes a la posició corresponent i comprova que l’ordre dels mesos és correcte.

Converteix després l’ArrayList en un HashSet i verifica que no es permeten duplicats.
Finalment, recorre la col·lecció amb un bucle for i amb un Iterator.

## ✨ Funcionalitats
- ArrayList y HashSet
- for y Iterator

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
- He creado una clase Month con atributo name y un main donde he creado un Arraylist monthList.
- He creado 11 instancias de Month y las he guardado en el ArrayList.
- He creado un metodo @override in Month para que pueda salir el nombre en main llamando .toString().
- He usado el .add(index,month) para inserir August exactamente a la posicion 7 (Seria el octavo meses ya que el array empeza de 0)
- He transformado el Arraylist en un hashSet y llamandolo con el for todos los elementos han salido en otro orden.
- Si intento añadir otro elemento en una posicion index ya existente ese elemento no se guarda.
- Si añado un elemento sin especificar el index si se añade.
- #### aunque los elemento tienen el mismo "name" Java no sabe que son iguales ya que el hash de los dos es diferente.
- He creado un Iterator<Month> iterator para poder usar el iterator para llamar todos los Months atraves de un while(iterator.hasNext());