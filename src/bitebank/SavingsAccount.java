package bitebank;

public class SavingsAccount extends Account {
    // Atributes
    private static final double COMMISSION = 0.03;
    private static final int WITHDRAWAL_LIMIT = 3;

    SavingsAccount( String name_bank, String owner_id, String owner_name, String owner_phone ) {
        super( name_bank, owner_id, owner_name, owner_phone );
    }

    SavingsAccount( String name_bank, String owner_id, String owner_name, String owner_phone, double balance ) {
        super( name_bank, owner_id, owner_name, owner_phone, balance );
    }

    @Override
    protected double apply_commission( double value ) {
        if( WITHDRAWAL_LIMIT < this.account_movements )
            return value + ( value * COMMISSION );

        return value;
    }

    public void withdraw_amount( double value ) throws InsufficientBalanceException {
        super.withdraw_amount( apply_commission( value ) );
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "COMMISSION=" + COMMISSION +
                ", WITHDRAWAL_LIMIT=" + WITHDRAWAL_LIMIT +
                "} " + super.toString();
    }
}
