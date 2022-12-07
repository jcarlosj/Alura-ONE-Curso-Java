package bitebank;

import java.util.Comparator;

public class SortClientById implements Comparator<Account> {
    @Override
    public int compare( Account account, Account t1 ) {
        // FORMA 1 (Básica): Retornará 0 (Cero): Si es igual, 1 (Uno): Si es mayor, -1 (Menos uno): Si es menor
        /*if( Integer.parseInt( account.getHolder().getId() ) == Integer.parseInt( t1.getHolder().getId() ) ) {
            return 0;
        }
        else if( Integer.parseInt( account.getHolder().getId() ) > Integer.parseInt( t1.getHolder().getId() ) ) {
            return 1;
        }
        else {
            return -1;
        }*/

        // FORMA 2 (Corta): Retornará 0 (Cero): Si es igual, # (Un positivo): Si es mayor, -# (Un negativo): Si es menor
        return Integer.parseInt( account.getHolder().getId() ) - Integer.parseInt( t1.getHolder().getId() );
    }
}
