package t01_generics_wildcards.exercises;

/**
 * Aufgabe 1 – Pair<A, B> erweitern
 *
 * Die Klasse Pair<A, B> aus dem Beispiel ist der Ausgangspunkt.
 * Erweitere sie um die folgenden Methoden:
 *
 *  a) equals(Object o)
 *     Zwei Pairs sind gleich, wenn first und second jeweils gleich sind.
 *     Tipp: Nutze instanceof und die equals()-Methoden der Felder.
 *
 *  b) hashCode()
 *     Implementiere hashCode() passend zu equals().
 *     Tipp: Objects.hash(first, second)
 *
 *  c) static <T> Pair<T, T> of(T value)
 *     Erstellt ein Pair, bei dem beide Werte identisch sind.
 *     Beispiel: Pair.of("hallo") → ("hallo", "hallo")
 *
 * Teste deine Implementierung in der main()-Methode.
 */
public class Exercise01 {

    public static class Pair<A, B> {

        private A first;
        private B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        public A getFirst()  { return first; }
        public B getSecond() { return second; }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }

        // TODO a): equals() implementieren
        @Override
        public boolean equals(Object o) {
            return false; // Platzhalter – ersetzen!
        }

        // TODO b): hashCode() implementieren
        @Override
        public int hashCode() {
            return 0; // Platzhalter – ersetzen!
        }

        // TODO c): statische Factory-Methode of() implementieren
        public static <T> Pair<T, T> of(T value) {
            return null; // Platzhalter – ersetzen!
        }
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Alice", 42);
        Pair<String, Integer> p2 = new Pair<>("Alice", 42);
        Pair<String, Integer> p3 = new Pair<>("Bob",   99);

        // TODO: Teste equals() — p1 und p2 sollten gleich sein, p1 und p3 nicht
        // TODO: Teste of() — beide Werte sollten identisch sein
    }
}
