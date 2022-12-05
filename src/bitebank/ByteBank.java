package bitebank;

import java.util.ArrayList;

public class ByteBank {
    public static void main(String[] args) {
        ArrayList<Account> accountsList = new ArrayList<Account>(); // ArrayList de tipo cuenta

        // Create Accounts
        Account sofia_account = new CurrentAccount( "ByteBank", "187632321","Sofia", "2331021", 5000 );
        Account eva_account = new SavingsAccount( "ByteBank", "154579925","Eva", "2115694"  );

        accountsList.add( sofia_account );
        accountsList.add( eva_account );

        for( Account account : accountsList ) {
            System.out.println( account );
        }
    }
}
