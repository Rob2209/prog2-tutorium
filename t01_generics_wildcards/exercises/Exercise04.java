package t01_generics_wildcards.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Aufgabe 4 – Wildcards
 *
 * Implementiere die folgenden Methoden. Wähle jeweils die passende Wildcard
 * für den Parameter — die Signatur gibt dir den Rahmen vor.
 *
 *  a) printAll
 *     Gibt alle Elemente einer Liste aus.
 *     Soll mit List<String>, List<Integer> usw. funktionieren.
 *
 *  b) sumList
 *     Summiert alle Elemente und gibt das Ergebnis als double zurück.
 *     Soll mit List<Integer>, List<Double> usw. funktionieren.
 *
 *  c) addNumbers
 *     Fügt die Zahlen 1 bis 5 in die übergebene Liste ein.
 *     Soll mit List<Integer> UND List<Number> funktionieren.
 *
 *  d) copy
 *     Kopiert alle Elemente von src nach dest.
 *     Teste: Kopiere eine List<Integer> in eine List<Number>.
 *
 * Beantworte als Kommentar in der Datei:
 *  Warum kann man bei b) keine Elemente zur Liste hinzufügen?
 */
public class Exercise04 {

    // TODO a): Wildcard einsetzen — ersetze List<Object> durch List<?>
    public static void printAll(List<Object> list) {
        // TODO: Implementierung hinzufügen
    }

    // TODO b): sumList() implementieren
    public static double sumList(List<? extends Number> list) {
        return 0.0; // Platzhalter – ersetzen!
    }

    // TODO c): addNumbers() implementieren
    public static void addNumbers(List<? super Integer> list) {
        // TODO: Zahlen 1 bis 5 hinzufügen
    }

    // TODO d): copy() implementieren — füge den korrekten Typparameter <T> hinzu
    public static void copy(List<?> src, List<?> dest) {
        // TODO: Implementierung hinzufügen — Signatur anpassen!
    }

    public static void main(String[] args) {
        // a) printAll
        List<String>  strings  = List.of("Hallo", "Welt");
        List<Integer> integers = List.of(1, 2, 3);
        // TODO: Teste printAll() mit beiden Listen

        // b) sumList
        List<Integer> ints    = List.of(1, 2, 3, 4);
        List<Double>  doubles = List.of(1.5, 2.5);
        // TODO: Teste sumList() mit beiden Listen

        // c) addNumbers
        List<Integer> intList    = new ArrayList<>();
        List<Number>  numberList = new ArrayList<>();
        // TODO: Teste addNumbers() mit beiden Listen

        // d) copy
        List<Integer> src  = List.of(10, 20, 30);
        List<Number>  dest = new ArrayList<>();
        // TODO: Kopiere src nach dest und gib dest aus
    }
}
