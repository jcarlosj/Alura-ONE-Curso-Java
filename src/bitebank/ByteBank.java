package bitebank;

public class ByteBank {
    public static void main(String[] args) {
        // Create Accounts
        Account sofia_account = new CurrentAccount( "ByteBank", "187632321","Sofia", "2331021", 5000 );
        Account eva_account = new SavingsAccount( "ByteBank", "154579925","Eva", "2115694"  );
        System.out.println( "Valores iniciales" );
        System.out.println( sofia_account );
        System.out.println( eva_account );

        // Solo un try/catch es quien realmente se hace cargo de manejar la Exception
        try {
            sofia_account.transfer_amount( 2000, eva_account );
            eva_account.withdraw_amount( 500 );
            eva_account.withdraw_amount( 2500 );        // -> Producirá InsufficientBalanceException, Excepción personalizada (Checked Exception)
            eva_account.withdraw_amount( 50 );
            eva_account.withdraw_amount( 50 );
        } catch ( InsufficientBalanceException e ) {
            e.printStackTrace();
        }

        System.out.println( "Valores finales" );
        System.out.println( sofia_account );
        System.out.println( eva_account );
    }
}
