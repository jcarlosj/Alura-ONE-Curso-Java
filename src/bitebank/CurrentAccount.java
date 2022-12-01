package bitebank;

public class CurrentAccount extends Account {
    // Atributes
    private static final double COMMISSION = 0.08;

    CurrentAccount( String name_bank, String owner_id, String owner_name, String owner_phone ) {
        super( name_bank, owner_id, owner_name, owner_phone );
    }

    CurrentAccount( String name_bank, String owner_id, String owner_name, String owner_phone, double balance ) {
        super( name_bank, owner_id, owner_name, owner_phone, balance );
    }

    @Override
    protected double apply_commission( double value ) {
        return value + ( value * COMMISSION );
    }

    public boolean withdraw_amount( double value ) {
        return super.withdraw_amount( apply_commission( value ) );
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "COMMISSION=" + COMMISSION +
                "} " + super.toString();
    }
}
