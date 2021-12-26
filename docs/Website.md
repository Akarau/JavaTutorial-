# Java Tutorial

## Allgemeiner Teil:

### Definition Algorithmus 

Ein Algorithmus ist eine eindeutige Handlungsvorschrift zur Lösung von Problemen. Algorithmus bestehen aus vielen wohldefinierten Einzelschritte. Das heißt, dass Algorithmus nach endlich vielen Schritten terminieren, also enden muss. 
Die Folge von Anweisungen findet sich häufig in Software wieder und liegt im Quellcode vor. Ein Algorithmus kann per Definition aber auch die schriftliche Anleitung sein, den Computer korrekt anzuschließen. Damit können sie zur Ausführung in ein Computerprogramm implementiert, aber auch in menschlicher Sprache formuliert werden. 

 [Quelle Nr.16](https://de.wikipedia.org/w/index.php?title=Algorithmus&oldid=218062723) und 
 [Quelle Nr.17](https://praxistipps.chip.de/was-ist-ein-algorithmus-einfach-erklaert_41355)

 
### Eigenschaften 

- Eindeutigkeit: ein Algorithmus darf keine widersprüchliche Beschreibung haben. Diese muss eindeutig sein. 
- Ausführbarkeit: jeder Einzelschritt muss ausführbar sein. 
- Finitheit (= Endlichkeit): die Beschreibung des Algorithmus muss endlich sein. 
- Terminierung: nach endlich vielen Schritten muss der Algorithmus enden und ein Ergebnis liefern. 
- Determiniertheit: der Algorithmus muss bei gleichen Voraussetzungen stets das gleiche Ergebnis liefern 
- Determinismus: zu jedem Zeitpunkt der Ausführung besteht höchstens eine Möglichkeit der Fortsetzung. Der Folgeschritt ist also eindeutig bestimmt. 

 [Quelle Nr.19](https://datasolut.com/wiki/was-ist-ein-algorithmus/) und 
 [Quelle Nr.20](https://www.dr-datenschutz.de/was-ist-ein-algorithmus-definition-und-beispiele/)

 ### Algorithmus im Alltag 

Algorithmen prägen den modernen Alltag tatsächlich in vielen unterschiedlichen Lebensbereichen. … Selbst beim Bau von Gebäuden und Brücken kommen mittlerweile Algorithmen zum Einsatz, um entsprechende Simulationen je nach Wetter, Temperatur, Belastung & Co zu erstellen. 

Beispiel 
-> Hinter jeder Ampel steckt ein Algorithmus, der das genaue Schaltverhalten definiert.  

[Quelle Nr.17](https://praxistipps.chip.de/was-ist-ein-algorithmus-einfach-erklaert_41355)

### Syntax:  

Ein Algorithmus wird - wie jeder andere Programmcode - nach einer strikten Syntax geschrieben.  
Syntax ist ein Teilgebiet der Grammatik und bezeichnet die Lehre vom Satzbau. Sie legt fest, wie aus einzelnen Komponenten - den Wörtern - sinnvolle Sätze entstehen. 

[Quelle Nr.18](https://praxistipps.chip.de/was-ist-syntax-einfach-erklaert_41262) 

### EVA: 

#### - Definition: 
Das sogenannte EVA-Prinzip stellt das grundlegende Prinzip der Datenverarbeitung dar. 

#### - Abkürzung: 
Steht für: Eingabe, Verarbeitung und Ausgabe von Informationen - EVA 
Hier findet die Verarbeitung von Daten statt.  

[Quelle Nr.24](https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwiJlMeDqJ_0AhVT8LsIHVrOChoQFnoECBIQAw&url=https%3A%2F%2Fwww.printer4you.com%2Fde%2Fdrucker-ratgeber%2Feva-prinzip&usg=AOvVaw0iZgr96XghLtksgzNAbC1F)

### Compiler und Interpreter: 

#### - Interpreter: 

Ein Interpreter verarbeitet den Quellcode eines Projekts zur Laufzeit. Dazu geht der Interpreter Zeile für Zeile vor: Eine Anweisung wird eingelesen, analysiert und sofort ausgeführt. Dann geht es mit der nächsten Anweisung weiter, bis schließlich das Ende des Programms erreicht ist; oder bis ein Fehler auftritt – der Interpreter stoppt seine Arbeit, sobald etwas nicht stimmt. Dadurch weiß man als Entwickler normalerweise sofort, an welcher Stelle sich der Fehler befindet, und kann das Problem so schneller beheben. 

#### - Compiler: 

Ein Compiler wandelt Quellcode in Maschinensprache um, übersetzt also das gesamte Programm von einer Programmiersprache in Maschinencode. Der Code wird vollständig übersetzt, bevor das Programm ausgeführt wird. 

Häufig passiert noch ein Zwischenschritt, bevor das Programm in Maschinensprache übersetzt wird: Der Quellcode wird zunächst in einen Zwischencode umgewandelt, zum Beispiel Objektcode. 

Der Zwischencode hat den Vorteil, dass er in der Regel auf verschiedenen Plattformen funktioniert und oft auch von einem Interpreter verwendet werden kann. Aus diesem Zwischenergebnis übersetzt der Compiler bzw. Assembler dann Maschinencode, der vom jeweiligen Zielsystem verstanden wird. Schließlich wird per Linker eine ausführbare Datei generiert. Moderne Programmiersprachen arbeiten häufig mit Bytecode statt Maschinencode, eine Art Pseudocode für Maschinen, der intern in speziellen virtuellen Maschinen ausgeführt wird. 

 

[Quelle Nr.25](https://www.dev-insider.de/der-unterschied-von-compiler-und-interpreter-a-742282/#:~:text=Definition%20%E2%80%9ECompiler%2C%20Interpreter%2C%20Compreter%E2%80%9C%20Der%20Unterschied%20von%20Compiler,Programmiersprache%20in%20Maschinencode.%203%20Just-in-time-Compiler%3A%20die%20Hybridl%C3%B6sung.%20)

## Einführung in die Programmierung (Kontrollstrukturen):

### Quellcode: 

Basierend auf einer bestimmten Programmiersprache legen Programmierer alle Regeln für eine vom Computer ausführbare Anwendung fest. Sollte der Verfasser einen unbemerkten Fehler in seine Arbeit einbauen, der gegen die Vorgaben der Programmiersprache verstößt, wird das Programm gar nicht erst funktionieren oder bei bestimmten Prozessen abstürzen. 

[Quelle Nr.21](https://www.ionos.de/digitalguide/websites/web-entwicklung/quellcode/)

### Struktogramm: 

Durch Struktogramme kann man den Code grafisch veranschaulichen. 

[Quelle Nr.22](http://dhika.de/index.php?id=grundlagen-struktogramm-strukturierte-programmierung)

### Programmablaufplan: 

Der Programmablaufplan wird auch als Programmstrukturplan oder Flussdiagramm bezeichnet. Ziel ist es, die Operationen zur Lösung von Aufgaben bzw. Problemen zu visualisieren. 

[Quelle Nr.23](https://www.dev-insider.de/was-ist-ein-programmablaufplan-a-888106/) 

### Variabel: 

Variablen sind Verweise auf Speicherplätze, die mit einem lesbaren Namen versehen, sowohl Werte primitiver Typen, als auch Objekte enthalten können. 
Jedes Computerprogramm verarbeitet Daten. Diese Daten können unterschiedliche Typen sein und als solche wiederum verschiedene Werte besitzen. So kann ein int (->Typ) den Wert 5, -34, 42069, etc. annehmen, ein String (->Typ) "Hallo Welt!" oder "Wer das liest, kann lesen" lauten. 
Die Daten stellen das 'Material' dar, das ein Programm verarbeitet. Im Rahmen dieser Verarbeitung müssen die Werte natürlich (zwischen-)gespeichert werden, um bei Bedarf auf sie zugreifen zu können. Variablen sind dabei eine Art 'Lesezeichen', das auf den Speicherort verweist und angibt, wie dieser angesprochen werden kann. Darüber hinaus enthält sie Informationen über den gespeicherten Datentyp. 

[Quelle Nr.1](https://javabeginners.de/Grundlagen/Variablen.php) 

### Wertezuweisung: 

In Java werden Variablen mittels Zuweisungsoperatoren Werte zugewiesen. Der wichtigste Zuweisungsoperator ist die „Einfache Wertzuweisung“, bspw. a = b. 

[Quelle Nr.2](https://www.programmierenlernenhq.de/java-grundlagen-zuweisungsoperatoren-in-java/)

#### Inkrement/- und Dekrement Operatoren: 

Inkrementieren bedeutet eine schrittweise Erhöhung einer Zahl. 
Und dementsprechend bedeutet Dekrementieren: Die schrittweise Verminderung einer Zahl. 
Das kann z.B. beim zählen einer List mit Namen genutzt werden. 

[Quelle Nr.3](https://mein-javablog.de/java-operatoren-inkrement-dekrement/)

 

 

### Datentypen: 

Aber was ist überhaupt ein Java Datentyp? Um Java Datentypen zu verstehen, musst du wissen, dass ein Computerspeicher beliebig viele Bitmuster enthält. Bitmuster stellen die Informationen, die ein Computer trägt, mithilfe verschiedener Kombinationen der Zahlen null und eins dar. Ein Datentyp ist ein Schema für die Verwendung von Bit, um Werte darzustellen. Dabei müssen diese Werte nicht aus Zahlen bestehen, sondern können jede Art von Daten, die ein Computer verarbeiten kann, enthalten. 

### Primitive Datentypen Java: 

Die acht primitive Datentypen haben folgende Namen: byte, short, int (integer), long, float, double, char (character) und boolean. Jeder dieser Typen besitzt eine festgelegte Anzahl an Bit. Zusätzlich lassen sie sich in Gruppen unterteilen. Zahlen sind in Java so wichtig, dass sechs der acht Java Datentypen numerisch sind. Das bedeutet, dass jeder von diesen, bis auf den char und den boolean, Zahlenwerte speichert. 

[Quelle Nr.4](https://studyflix.de/informatik/primitive-datentypen-215) 

- Type Casting: 
  Typumwandlung oder auch Typkonvertierung ist die Umwandlung eines Datentyps in einen anderen Datentyp. Es ist dabei besonders darauf zu achten, dass beim Umwandeln keine Typverletzung entsteht, d.h. die beiden Datentypen müssen zueinander kompatibel sein. Es gibt folgende Typumwandlungsarten: 
  - Explizite Typumwandlung – bei der im Quellcode die Typumwandlung ausdrücklich angewiesen wird. 
  - Implizite Typumwandlung – bei der die Typumwandlung nicht extra im Quelltext angewiesen wird, sondern automatisch vom Compiler durchgeführt wird. 

Implizite Typumwandlungen können zu sehr schwerwiegenden Fehlern führen, wenn dabei Informationen verloren oder anders interpretiert werden. Daher werden in Java implizite Typkonvertierungen nur dann durchgeführt, wenn diese ohne Informationsverlust erfolgen. Dabei muss der Ziel-Datentyp immer einen gleichen oder größeren Wertebereich als der Ausgangs-Datentyp besitzen. 
Bei der Umwandlung eines Datentyps in einen Datentyp mit einem größeren Wertebereich spricht man von einer erweiternden Konvertierung (type Promotion). Wird bei der Typumwandlung der Wertebereich verringert, dann spricht man von einer einschränkenden Konvertierung (type Demotion) bei der gespeicherte Informationen verloren gehen können.  

[Quelle Nr.5](https://www.programmierenlernenhq.de/java-grundlagen-typumwandlung-type-casting-in-java/)

### Bedingungen (if und switch): 

 #### - If: 
 
 Die If-Anweisung dient dazu einen Ausdruck auszuwerten und je nach Ergebnis weiter zu verfahren. Der Ausdruck muss dabei einen Wert vom Datentyp boolean haben. Um If-Anweisungen wird man im kaum einem Programm herumkommen. Das simple Konzept ist sehr mächtig und kann in den unterschiedlichsten Situationen eingesetzt werden. 
 
[Quelle Nr.6](https://www.java-programmieren.com/if-anweisung-java.php)

#### - Switch:

Allgemein ist ein Java Switch Case wie eine mehrfach geschachtelte if-Anweisung, die durch ihren Aufbau ziemlich übersichtlich gestaltet ist. Aber was macht ein Switch genau? Mit Hilfe einer switch-case-Verzweigung kannst du den Wert einer Variablen vom Typ int oder String überprüfen. Der Wert der Variable wird innerhalb verschiedener Cases (Fälle) gesucht und bei einer Übereinstimmung die zusammenhängende Anweisung ausgeführt. Mit der switch-Anweisung kannst du also ganz einfach aus einer Vielzahl von Möglichkeiten eine bestimmte Alternative auswählen. 

 [Quelle Nr.7](https://studyflix.de/informatik/switch-case-java-1804) 

 

- verschachtelte Bedingungen: 
  Mehrere z.B. if-Bedingungen die auf einander folgen. 
  
[Quelle Nr.8](https://www.informatikzentrale.de/_files/16java/java20_if-else-verzweigung.pdf) 

 

 

### Schleifen 

Eine Schleife ist ein Anweisungsblock, dessen Anweisungen mehrfach wiederholt werden. Beginn und Ende sind markiert. Wie oft die Schleife wiederholt wird, ist in der Schleifenbedingung festgelegt. 

- for: 
  Die for-Schleife eignet sich, wenn vor dem Start der Schleife schon feststeht, wie oft die Schleife durchlaufen werden soll. 

- while: 
  Die while-Schleife eignet sich, wenn beim Einstieg in die Schleife noch nicht bekannt ist, wie oft die Schleife durchlaufen werden soll. 
  Eine häufige Anwendung ist das Lesen von Tabellen. Java liest eine Zeile nach der anderen ein. Wenn die letzte Zeile eingelesen ist (das merkt Java daran, dass es keine weitere Zeile mehr findet) wird die Schleife verlassen. Die Anzahl der Schleifendurchläufe vorher festzulegen, wäre unvernünftig, weil dazu die Tabelle schon vorab bis zum Ende gelesen werden müsste, um die Zeilenanzahl zu ermitteln, bevor die eigentliche Lese-Schleife beginnt. 

- do-while: 
  Diese Schleife wird benötigt, wenn man eine Austrittsbedingung statt einer Eintrittsbedingung hat, dass heißt, dass die Bedingung am Ende des Schleifendurchlaufs geprüft wird. Hier wird die Anweisung also auf jeden Fall einmal ausgeführt. 
  
  [Quelle Nr.9](https://www.a-coding-project.de/ratgeber/java/schleifen) 

## Einführung in die Projektorientierte Programmierung:

### Klassen: Bedeutung und Implementation: 

In einer Klasse sind Methoden und Eigenschaften eines Objektes definiert. Die Klasse dient als Vorlage, aus der dann beliebig viele Objekte erzeugt werden können.  

 [Quelle Nr.10](https://www.a-coding-project.de/ratgeber/java/klassen-und-objekte)  

### Objekte: 

Objekte sind Instanzen von Klassen, sie werden mit Hilfe des new-Operator erzeugt. Dabei wird zuerst eine Variable vom Typ der Klasse deklariert. Dieser Variablen wird dann das erzeugte Objekt zugewiesen. 

 [Quelle Nr.11](https://www.programmierenlernenhq.de/klassen-und-objekte-in-java/)

### Klassendiagramme: 

Mit Klassendiagrammen kann man alle Information eines Objektes, zusammengefasst darstellen. Beispiel das Objekt aus einer Klasse Hund hat die folgenden Attribute (mit - dargestellt) Name: String    Gewicht: int    und die folgenden Methoden (durch ein + dargestellt)  Bellen: void    … . 

 

[Quelle Nr.12](http://www.codeadventurer.de/?p=2428) 

 

### Objektdiagramme: 

Ähnlich wie in einem Klassendiagramm hat man auch bei Objektdiagrammen recht viele Freiheiten. Man kann Attribute angeben, muss aber nicht alle Attribute aufführen, sondern nur die jeweils wichtigen. Auch die Methoden können angegeben werden, müssen es aber nicht.  

Bei den Objekten ist eigentlich klar, welche Methoden sie besitzen, denn das geht ja schon aus dem Klassendiagram hervor. Bei den Objekten interessieren eigentlich die Attributwerte am meisten, da sich die Objekte ein- und derselben Klasse in ihren Attributwerten unterscheiden (nicht zwingend, aber meistens).  

[Quelle Nr.13](http://u-helmich.de/inf/lexikon/M-R/Objektdiagramm.html)  

### Konstruktoren: 

In einer Klasse ist der Java Konstruktor eine Methode, die den gleichen Namen wie die Klasse hat. Sie wird dazu verwendet, ein neues Objekt dieser einen Klasse zu erstellen. Das ist der Grund, weshalb jede Klasseninstanz einen Konstruktor haben muss. 

[Quelle Nr.14](https://studyflix.de/informatik/java-konstruktor-1900)

### Objektmethoden: 

Im Unterschied zur Klassenmethode muss eine Objektmethode an einem konkret instanziierten Objekt aufgerufen werden, dies ist bei Klassenmethoden nicht der Fall. 

Wir definieren ein Objekt   Auto   über die Attribute: 

- Marke 

- Farbe 

- Verbrauch 

Diese Attribute können pro Auto mit einem objektspezifischen Wert belegt werden, dies erfolgt mit dem Konstruktor. 
Nach der Instanziierung eines Objekts können wir die Objektmethode   fahren()   an einem konkreten Objekt aufrufen und so über   this   auch auf die Objektattribute zugreifen. 
Die Gesamtheit aller Autos lässt sich über die Anzahl der Räder beschreiben, die Belegung gilt über alle Objekte hinweg. Daher wird   anzahlRaeder()   als   static   definiert. 

[Quelle Nr.15](https://lernjava.de/klassenmethoden-und-objektmethoden/)