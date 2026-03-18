package t01_generics_wildcards.exercises;

import java.util.List;

/**
 * Aufgabe 3 – Bounded Type Parameters
 *
 * Implementiere die folgenden Methoden. Überlege jeweils welchen Bound
 * der Typparameter braucht — und warum ohne ihn die Implementierung
 * nicht möglich wäre.
 *
 *  a) max
 *     Gibt den größeren von zwei Werten zurück.
 *     Soll mit jedem vergleichbaren Typ funktionieren.
 *     Beispiel: max(3, 7)          → 7
 *              max("Anna", "Zoe")  → "Zoe"
 *
 *  b) min
 *     Gibt das kleinste Element einer Liste zurück.
 *     Wirf eine IllegalArgumentException wenn die Liste leer ist.
 *     Beispiel: min([3, 1, 4, 1, 5]) → 1
 *
 *  c) sum
 *     Summiert alle Elemente einer Liste als double.
 *     Soll mit List<Integer>, List<Double>, List<Float> usw. funktionieren.
 *     Tipp: Welche Methode haben alle Zahlentypen gemeinsam?
 *     Beispiel: sum([1, 2, 3])     → 6.0
 *              sum([1.5, 2.5])     → 4.0
 *
 * Beantworte als Kommentar über jeder Methode:
 * Warum ist der gewählte Bound notwendig?
 *
 * Teste alle Methoden in der main()-Methode.
 */
public class Exercise03 {

    // TODO a): max() — Signatur und Implementierung selbst schreiben


    // TODO b): min() — Signatur und Implementierung selbst schreiben


    // TODO c): sum() — Signatur und Implementierung selbst schreiben


    public static void main(String[] args) {
        // TODO: Teste alle drei Methoden
        // Bonusfrage: Was passiert bei min() mit einer leeren Liste?
    }
}
