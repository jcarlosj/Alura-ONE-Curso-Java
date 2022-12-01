package bitebank;

public class Account {
    private String id;
    private String name_bank;

    Account( String name_bank ) {
        this.id = String.valueOf( System.currentTimeMillis() );
        this.name_bank = name_bank;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name_bank='" + name_bank + '\'' +
                '}';
    }
}
