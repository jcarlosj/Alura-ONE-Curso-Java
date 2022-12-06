package bitebank;

import java.util.Comparator;

class SortClientById implements Comparator<Account> {
    @Override
    public int compare( Account account, Account t1 ) {
        if( Integer.parseInt( account.getHolder().getId() ) == Integer.parseInt( t1.getHolder().getId() ) ) {
            return 0;
        }
        else if( Integer.parseInt( account.getHolder().getId() ) > Integer.parseInt( t1.getHolder().getId() ) ) {
            return 1;
        }
        else {
            return -1;
        }
    }

}
