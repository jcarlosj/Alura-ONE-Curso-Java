package bitebank;

public class ByteBank {
    public static void main(String[] args) {
        Account[] accounts = new Account[ 5 ];      // Array de tipo cuenta

        // Create Accounts
        Account sofia_account = new CurrentAccount( "ByteBank", "187632321","Sofia", "2331021", 5000 );
        Account eva_account = new SavingsAccount( "ByteBank", "154579925","Eva", "2115694"  );

        accounts[ 1 ] = sofia_account;
        accounts[ 2 ] = eva_account;

        for( int i = 0; i < accounts.length; i++ ) {
            System.out.println( accounts[ i ] );
        }
    }
}
