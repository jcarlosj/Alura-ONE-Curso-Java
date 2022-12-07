package bitebank;

import java.util.Comparator;
import java.util.Objects;

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

    // Getters
    public String getId() { return id; }
    public Client getHolder() {
        return holder;
    }

    protected abstract double apply_commission( double value );

    public void withdraw_amount( double value ) throws InsufficientBalanceException {
        if( this.balance < value ) {
            throw new InsufficientBalanceException( "Insufficient Balance" );
        }

        this.balance -= value;
        this.account_movements++;
    }

    public boolean deposit_amount( double value ) {
        if( value > 0 ) {
            this.balance += value;
            this.account_movements++;

            return true;
        }

        return false;
    }

    public boolean transfer_amount( double value, Account destination_account ) throws InsufficientBalanceException {
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

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        Account account = ( Account ) o;    // Casting: Object to Account

        // Verifica que el valor de cada uno de los atributos de la clase sea el mismo
        return Double.compare(account.balance, balance) == 0 && account_movements == account.account_movements && Objects.equals(id, account.id) && Objects.equals(name_bank, account.name_bank) && Objects.equals(holder, account.holder);
    }
}
