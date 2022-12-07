package bitebank;

import java.util.ArrayList;
import java.util.Comparator;

public class ByteBank {
    public static void main(String[] args) {
        ArrayList<Account> accountsList = new ArrayList<Account>(); // ArrayList de tipo cuenta

        // Create Accounts
        Account sofia_account = new CurrentAccount( "ByteBank", "187632321","Sofia", "2331021", 5000 );
        Account eva_account = new SavingsAccount( "ByteBank", "154579925","Eva", "2115694"  );
        Account rex_account = new SavingsAccount( "ByteBank", "738296752","Rex", "2115694"  );
        Account marx_account = new SavingsAccount( "ByteBank", "213865534","Marx", "2115694"  );
        Account milo_account = new SavingsAccount( "ByteBank", "154579925","Eva", "6707809"  );

        accountsList.add( sofia_account );
        accountsList.add( marx_account );
        accountsList.add( eva_account );
        accountsList.add( rex_account );

        System.out.println( "Lista sin ordenar" );
        for( Account account : accountsList ) {
            System.out.println( account );
        }
        System.out.println();

        Comparator<Account> comparatorClientByID = new SortClientById();
        accountsList.sort( comparatorClientByID );

        System.out.println( "Lista ordenada por ID de cliente" );
        for( Account account : accountsList ) {
            System.out.println( account );
        }
        System.out.println();

        Comparator<Account> comparatorClientByName = new SortClientByName();
        accountsList.sort( comparatorClientByName );

        System.out.println( "Lista ordenada por nombre de cliente" );
        for( Account account : accountsList ) {
            System.out.println( account );
        }
        System.out.println();

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
