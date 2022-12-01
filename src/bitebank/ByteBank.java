package bitebank;

public class ByteBank {
    public static void main(String[] args) {
        // Create Accounts
        Account bba_1 = new Account( "ByteBank", "187632321","Sofia", "2331021" );
        Account bba_2 = new Account( "ByteBank", "154579925","Eva", "2115694"  );
        System.out.println( bba_1 );
        System.out.println( bba_2 );
    }
}
