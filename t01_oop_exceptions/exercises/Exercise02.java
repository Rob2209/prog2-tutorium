package t02_oop_fehlerbehandlung.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Aufgabe 2 – Vererbung & Polymorphismus
 *
 * Baue auf deiner Account-Klasse aus Aufgabe 1 auf.
 *
 * a) Implementiere CheckingAccount extends Account implements Payable
 *    - Feld: overdraftLimit (double) — wie weit darf das Konto ins Minus?
 *    - Konstruktor: owner, overdraftLimit (balance startet bei 0.0)
 *    - withdraw(): Abheben erlaubt bis balance + overdraftLimit
 *      Abgelehnt wenn Betrag das Limit überschreitet (einfach return)
 *    - canPay(): true wenn withdraw() erfolgreich wäre
 *
 * b) Implementiere SavingsAccount extends Account
 *    - Feld: interestRate (double) — Zinssatz z.B. 0.03 für 3%
 *    - Konstruktor: owner, balance, interestRate
 *    - withdraw(): Abheben nur erlaubt wenn balance >= amount (kein Dispo)
 *    - addInterest(): erhöht balance um balance * interestRate
 *
 * c) Polymorphismus — beantworte als Kommentar:
 *    Welche withdraw()-Implementierung wird hier aufgerufen?
 *
 *    Account a = new CheckingAccount("Alice", 500.0);
 *    a.withdraw(100.0); // TODO: Kommentar — welche Implementierung?
 *
 * d) Erstelle eine List<Account> mit mindestens einem CheckingAccount
 *    und einem SavingsAccount. Iteriere über die Liste und gib für jedes
 *    Konto owner und balance aus.
 *    Beobachtung: Welche withdraw()-Methode wird jeweils aufgerufen?
 */
public class Exercise02 {

    // TODO: Klassen aus Aufgabe 1 hier einfügen oder importieren

    // TODO a): CheckingAccount implementieren


    // TODO b): SavingsAccount implementieren


    public static void main(String[] args) {
        // TODO c): Polymorphismus-Beispiel mit Kommentar

        // TODO d): List<Account> mit gemischten Typen
    }
}
