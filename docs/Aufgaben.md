# Aufgaben zu Java Grundlagen

<br>

## Variablen und Werte Zuweisungen
<br>

### String und Wörter
Erstelle den String Schüler und bennene ihn Kevin

<br>

### Integer und Zahlen
Erstelle den Integer Note und setze ihn auf 6.

<br>
Nun gib bitte einen Satz aus der Kevins Note sagt.

---

<br>

## Datentypen

---

<br>

## if und switch

<br>

### if
Verwende die Programmierung aus "Variablen und Werte Zuweisung"
Wenn Kevin seine Note 6 ist soll ein weiter Satz ausgegeben werden  aber nur dann!

<br>

### switch

Erstelle eien Switch Case Abfrage, welche für jede mögliche Note einen eigenen Satz ausgibt.

---

<br>

## Schleifen 

<br>

### whlile-Schleifen
Erstelle eine unendliche while Schleife welche ständig das Selbe aus gibt.

<br>

### for-Schleife
Schreibe eine for-Schleife, die 10 mal "Hello World!" ausgibt.

<br>

### do-Schleife

Was wird hier ausgegeben

<br>

    int i = 4;
        do {
            System.out.println(i);
            	i++;
        } while (i < 6);


---
<br>


# Aufgaben Objekrtorientierte Porgrammierung
## Klasse
Erstelle eine neue Klasse namens "car".
## Objekte
Erstelle in deiner main-class ein neues Objekt von der Klasse "car" und nenne es "car1".
## Eigenschaften und Methoden
### Eigenschaften
Gebe der Klasse "car" die Attribute/ Eigenschaften
- "color" (String) 
- "horsepower" (integer)


### Methoden
Gib der Klasse "car" die Methode "drive" die ausgibt "Das Auto fährt"
<br>
Führe die Methode in der main-class mit "car1" aus.
# Lösungen Aufgaben Java Grundlagen

<br>

## Variablen und Werte Zuweisungen


<br>

### String und Wörter


    String schüler = "Kevin";

<br>

### Integer und Zahlen
    int note = 6;

<br>

  _Nun gib bitte einen Satz aus der Kevins Note sagt._

    System.out.println(schüler + " hat die Note " + note);

---

<br>

## Datentypen

---

<br>

## if und switch

<br>

    
  ### if
    if (note == 6);{
          System.out.println("Kevin bekommt Ärger.");
    }

<br>

### switch

    switch(note) {
        case 1: System.out.println("Die Note ist einz"); break;
        case 2: System.out.println("Die Note ist zwei"); break;
        case 3: System.out.println("Die Note ist drei"); break;
        case 4: System.out.println("Die Note ist vier"); break;
        case 5: System.out.println("Die Note ist fünf"); break;
        case 6: System.out.println("Die Note ist sechs"); break;
    }

---

<br>

## Schleifen 

<br>

### whlile-Schleife
    int number = 0;
    while(number == 0) {
        System.out.println("Das ist die unendliche While-Schleife");
    }

<br       

### for-Schleife
    for (int i = 0; i < 5; i++){
        System.out.println("Hello World!");
    }
<br>

### do-Schleife
    4
    5
# Lösungen Aufgaben Objektorientierte Programmierung
