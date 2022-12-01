package bitebank;

public class Client {
    // Atributes
    private String id;
    private String name;
    private String phone;

    Client( String owner_id, String owner_name, String owner_phone ) {
        this.id = owner_id;
        this.name = owner_name;
        this.phone = owner_phone;
    }

    // Getters & Setters
    public String getId() {
        return this.id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getNumber_phone() {
        return this.phone;
    }

    public void setNumber_phone( String number_phone ) {
        this.phone = number_phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number_phone='" + phone + '\'' +
                '}';
    }
}
