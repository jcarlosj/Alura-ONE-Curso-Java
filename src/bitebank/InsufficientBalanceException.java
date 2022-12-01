package bitebank;

// Define clase para personalizar una Exception Verificada (Checked Exception)
public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException() {
        super();
    }
    InsufficientBalanceException( String message ) {
        super( message );
    }
}
