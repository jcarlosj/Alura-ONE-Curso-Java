package bitebank;

public abstract class Account {
    private String id;
    private String name_bank;
    private Client holder;
    protected double balance;
    protected int account_movements;

    Account( String name_bank, String owner_id, String owner_name, String owner_phone ) {
        this.id = String.valueOf( System.currentTimeMillis() );
        this.name_bank = name_bank;
        this.holder = new Client( owner_id, owner_name, owner_phone );
    }

    Account( String name_bank, String owner_id, String owner_name, String owner_phone, double balance ) {
        this.id = String.valueOf( System.currentTimeMillis() );
        this.name_bank = name_bank;
        this.holder = new Client( owner_id, owner_name, owner_phone );
        this.balance = balance;
    }

    protected abstract double apply_commission( double value );

    public boolean withdraw_amount( double value ) {
        if( this.balance >= value ) {
            this.balance -= value;
            this.account_movements++;

            return true;
        }

        return false;
    }

    public boolean deposit_amount( double value ) {
        if( value > 0 ) {
            this.balance += value;
            this.account_movements++;

            return true;
        }

        return false;
    }

    public boolean transfer_amount( double value, Account destination_account ) {
        if( this.balance >= value ) {
            this.withdraw_amount( value );
            destination_account.deposit_amount( value );
            this.account_movements++;

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name_bank='" + name_bank + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                ", account_movements=" + account_movements +
                '}';
    }
}
