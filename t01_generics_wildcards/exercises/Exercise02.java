package t01_generics_wildcards.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Aufgabe 2 – Generische Methoden schreiben
 *
 * Implementiere die folgenden drei Methoden in der Klasse GenericUtils.
 * Die Methodensignaturen musst du selbst herleiten — überlege jeweils:
 *   - Welche Typparameter brauche ich?
 *   - Was sind die Parameter-Typen?
 *   - Was ist der Rückgabetyp?
 *
 *  a) repeat
 *     Gibt eine Liste zurück, die item genau n-mal enthält.
 *     Beispiel: repeat("ha", 3) → ["ha", "ha", "ha"]
 *              repeat(42, 2)   → [42, 42]
 *
 *  b) firstOrDefault
 *     Gibt das erste Element der Liste zurück.
 *     Falls die Liste leer ist, wird defaultValue zurückgegeben.
 *     Beispiel: firstOrDefault([1, 2, 3], 0) → 1
 *              firstOrDefault([],         0) → 0
 *
 *  c) zip
 *     Verschachtelt zwei Listen abwechselnd.
 *     Beispiel: zip([1,2,3], [4,5,6]) → [1,4,2,5,3,6]
 *     Hinweis: Gehe bis zum Ende der kürzeren Liste.
 *
 * Teste alle drei Methoden in der main()-Methode mit mindestens zwei
 * verschiedenen Typen (z.B. String und Integer).
 */
public class Exercise02 {

    public static class GenericUtils {

        // TODO a): repeat() — Signatur und Implementierung selbst schreiben


        // TODO b): firstOrDefault() — Signatur und Implementierung selbst schreiben


        // TODO c): zip() — Signatur und Implementierung selbst schreiben

    }

    public static void main(String[] args) {
        // TODO: Teste alle drei Methoden
    }
}
