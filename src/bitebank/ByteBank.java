package bitebank;

public class ByteBank {
    public static void main(String[] args) {
        // Create Accounts
        Account bba_1 = new Account( "ByteBank" );
        System.out.println( bba_1 );
        Account bba_2 = new Account( "ByteBank" );
        System.out.println( bba_1 );
        System.out.println( bba_2 );

        // Create Clients
        Client client_1 = new Client("187632321","Sofia", "2331021" );
        Client client_2 = new Client( "154579925","Eva", "2115694" );
        System.out.println( client_1 );
        System.out.println( client_2 );
    }
}
