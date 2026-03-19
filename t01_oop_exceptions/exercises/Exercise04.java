package t02_oop_fehlerbehandlung.exercises;

/**
 * Aufgabe 4 – Exceptions & try-catch-finally
 *
 * Erweitere die Bank-Hierarchie um eine saubere Fehlerbehandlung.
 *
 * a) Schreibe eine Checked Exception AccountException extends Exception
 *    - Konstruktor: AccountException(String message)
 *
 * b) Schreibe eine Unchecked Exception InsufficientFundsException
 *    extends RuntimeException
 *    - Feld: missingAmount (double) — wie viel fehlt?
 *    - Konstruktor: InsufficientFundsException(double missing)
 *      Nachricht: "Insufficient funds. Missing: " + missing + "€"
 *    - Getter: getMissingAmount()
 *
 * c) Passe withdraw() in CheckingAccount an:
 *    - Signatur: public void withdraw(double amount) throws AccountException
 *    - Wirf AccountException wenn amount <= 0
 *      Nachricht: "Withdrawal amount must be positive"
 *    - Wirf InsufficientFundsException wenn Limit überschritten
 *
 * d) Passe withdraw() in SavingsAccount an:
 *    - Signatur: public void withdraw(double amount) throws AccountException
 *    - Wirf AccountException wenn amount <= 0
 *    - Wirf InsufficientFundsException wenn balance < amount
 *
 * e) Schreibe eine Methode processWithdrawal(Account account, double amount):
 *    - Rufe account.withdraw(amount) in einem try-Block auf
 *    - catch InsufficientFundsException: gib aus wie viel fehlt
 *    - catch AccountException: gib die Fehlermeldung aus
 *    - finally: gib immer "Transaktion abgeschlossen." aus
 *
 * Beantworte als Kommentar:
 *    Warum fangen wir InsufficientFundsException VOR AccountException ab?
 *    // TODO
 *
 * Teste in der main()-Methode:
 *    - Normales Abheben
 *    - Abheben mit zu wenig Guthaben
 *    - Abheben mit negativem Betrag
 */
public class Exercise04 {

    // TODO: Klassen aus Aufgabe 2 hier einfügen oder importieren

    // TODO a): AccountException implementieren

    // TODO b): InsufficientFundsException implementieren

    // TODO c): withdraw() in CheckingAccount anpassen

    // TODO d): withdraw() in SavingsAccount anpassen

    // TODO e): processWithdrawal() implementieren
    static void processWithdrawal(/* TODO: Parameter */) {
        // TODO
    }

    public static void main(String[] args) {
        // TODO: Alle drei Szenarien testen
    }
}
