package t01_generics_wildcards.examples;

/**
 * Generische Klasse mit zwei unabhängigen Typparametern.
 * Speichert ein Paar aus zwei Werten beliebiger Typen.
 */
public class Pair<A, B> {

    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    /**
     * Generische Methode: Gibt ein neues Pair mit vertauschten Werten zurück.
     * Beachte: Eingabe ist Pair<A,B>, Ausgabe ist Pair<B,A>.
     */
    public static <A, B> Pair<B, A> swap(Pair<A, B> pair) {
        return new Pair<>(pair.getSecond(), pair.getFirst());
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    // --- Demo ---
    public static void main(String[] args) {
        Pair<String, Integer> person = new Pair<>("Alice", 42);
        Pair<Integer, Integer> point  = new Pair<>(3, 7);

        System.out.println(person);                  // (Alice, 42)
        System.out.println(point);                   // (3, 7)

        Pair<Integer, String> swapped = Pair.swap(person);
        System.out.println(swapped);                 // (42, Alice)

        // Typsicherheit — kein Cast nötig
        String name = person.getFirst();
        int    age  = person.getSecond();
        System.out.println(name + " ist " + age + " Jahre alt.");
    }
}
