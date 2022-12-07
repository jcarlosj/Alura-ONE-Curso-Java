package bitebank;

import java.util.Comparator;

public class SortClientByName implements Comparator<Account> {

    @Override
    public int compare(Account account, Account t1) {
        // Retornará 0 (Cero): Si es igual, 1 (Uno): Si es mayor, -1 (Menos uno): Si es menor
        return account.getHolder().getName().compareTo( t1.getHolder().getName() );
    }
}
