package t02_oop_fehlerbehandlung.exercises;

/**
 * Aufgabe 1 – Klassen, Objekte & Encapsulation
 *
 * Betrachte das folgende UML-Diagramm und beantworte zunächst die Fragen,
 * bevor du mit der Implementierung beginnst.
 *
 * ┌─────────────────────────────────────────┐
 * │          «interface» Payable            │
 * ├─────────────────────────────────────────┤
 * │ + canPay(amount: double): boolean       │
 * └─────────────────────────────────────────┘
 *                     ▲ (implements)
 *                     │
 * ┌─────────────────────────────────────────┐
 * │           «abstract» Account            │
 * ├─────────────────────────────────────────┤
 * │ # owner: String                         │
 * │ # balance: double                       │
 * ├─────────────────────────────────────────┤
 * │ + getBalance(): double                  │
 * │ + deposit(amount: double): void         │
 * │ + withdraw(amount: double): void {abs.} │
 * └─────────────────────────────────────────┘
 *           ▲                    ▲
 *        (extends)           (extends)
 *           │                    │
 * ┌──────────────────┐  ┌────────────────────┐
 * │ CheckingAccount  │  │   SavingsAccount   │
 * ├──────────────────┤  ├────────────────────┤
 * │-overdraftLimit:  │  │-interestRate:      │
 * │  double          │  │  double            │
 * ├──────────────────┤  ├────────────────────┤
 * │+withdraw(double) │  │+withdraw(double)   │
 * │+canPay(double)   │  │+addInterest()      │
 * └──────────────────┘  └────────────────────┘
 *  (implements Payable)
 *
 * ── UML-Fragen (als Kommentar beantworten) ──────────────────────
 *
 * 1. Warum ist Account abstract?
 *    // TODO
 *
 * 2. Warum implementiert nur CheckingAccount das Interface Payable,
 *    nicht aber SavingsAccount?
 *    // TODO
 *
 * 3. Was bedeutet # bei owner und balance?
 *    // TODO
 *
 * 4. Kann man ein Objekt vom Typ Account direkt erzeugen? Warum (nicht)?
 *    // TODO
 *
 * ── Implementierung ─────────────────────────────────────────────
 *
 * a) Implementiere das Interface Payable gemäß UML.
 *
 * b) Implementiere die abstrakte Klasse Account gemäß UML.
 *    - Felder mit korrektem Zugriffsmodifier
 *    - Konstruktor mit owner und balance
 *    - deposit() soll negative Beträge ablehnen (einfach return)
 *    - getBalance() als Getter
 *    - withdraw() bleibt abstrakt
 *
 * Teste in der main()-Methode:
 *  - Versuche ein Account-Objekt direkt zu erzeugen — was passiert?
 *  - Erstelle ein CheckingAccount-Objekt (aus Aufgabe 2) und rufe deposit() auf
 */
public class Exercise01 {

    // TODO a): Interface Payable implementieren


    // TODO b): Abstrakte Klasse Account implementieren


    public static void main(String[] args) {
        // TODO: Teste deine Implementierung
    }
}
