package t02_oop_fehlerbehandlung.exercises;

import java.util.List;

/**
 * Aufgabe 3 – Abstrakte Klassen & Interfaces
 *
 * Diese Aufgabe vertieft den Unterschied zwischen abstrakten Klassen
 * und Interfaces anhand des Bank-Beispiels.
 *
 * a) Füge dem Interface Payable eine Default-Methode hinzu:
 *
 *    default String paymentStatus() {
 *        return "Zahlung möglich: " + canPay(0.01);
 *    }
 *
 *    Rufe paymentStatus() auf einem CheckingAccount-Objekt auf.
 *    Muss CheckingAccount dafür geändert werden?
 *    // TODO: Antwort als Kommentar
 *
 * b) Erstelle ein neues Interface Transferable:
 *
 *    boolean transfer(Account target, double amount);
 *
 *    Implementiere Transferable in CheckingAccount:
 *    - Rufe canPay(amount) auf — wenn false, return false
 *    - Rufe withdraw(amount) auf dem eigenen Konto auf
 *    - Rufe target.deposit(amount) auf
 *    - return true
 *
 * c) Beantworte als Kommentar:
 *
 *    1. Was wäre der Unterschied wenn transfer() in Account als
 *       abstrakte Methode statt in einem Interface wäre?
 *       // TODO
 *
 *    2. Kann CheckingAccount sowohl Payable als auch Transferable
 *       implementieren? Wie sieht die Klassendeklaration aus?
 *       // TODO
 *
 *    3. Kann Account selbst Payable implementieren?
 *       Was müsste dann geändert werden?
 *       // TODO
 */
public class Exercise03 {

    // TODO: Klassen aus Aufgabe 2 hier einfügen oder importieren

    // TODO a): Default-Methode zu Payable hinzufügen

    // TODO b): Interface Transferable + Implementierung in CheckingAccount

    public static void main(String[] args) {
        // TODO a): paymentStatus() aufrufen

        // TODO b): transfer() zwischen zwei Konten testen
        //          Ausgabe: balance beider Konten vor und nach dem Transfer
    }
}
