package bitebank;

import java.util.ArrayList;

public class ByteBank {
    public static void main(String[] args) {
        ArrayList<Account> accountsList = new ArrayList<Account>(); // ArrayList de tipo cuenta

        // Create Accounts
        Account sofia_account = new CurrentAccount( "ByteBank", "187632321","Sofia", "2331021", 5000 );
        Account eva_account = new SavingsAccount( "ByteBank", "154579925","Eva", "2115694"  );
        Account milo_account = new SavingsAccount( "ByteBank", "154579925","Eva", "6707809"  );

        accountsList.add( sofia_account );
        accountsList.add( eva_account );

        for( Account account : accountsList ) {
            System.out.println( account );
        }

        // Verificamos si la referencia esta contenida dentro de la lista.
        if( accountsList.contains( milo_account ) )
            System.out.println( "La cuenta existe dentro de la lista" );
        else
            System.out.println( "La cuenta NO existe dentro de la lista" );

        // Verificamos si los objetos tienen los mismos valores dentro de si.
        if( eva_account.equals( accountsList.get( 1 ) ) )
            System.out.println( "La cuentas poseen los mismos valores" );
        else
            System.out.println( "La cuentas NO poseen los mismos valores" );
    }
}
