package collections;

public class Classroom {
    private String floor;
    private String number;
    private String name;

    public Classroom( String floor, String number ) {
        this.floor = floor;
        this.number = number;
        this.name = "Classroom " + floor + number;
    }

    public Classroom( String floor, String number, String name ) {
        this.floor = floor;
        this.number = number;
        this.name = name;
    }

    // Getters
    public String getFloor() {
        return floor;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Classroom{" +
            "floor='" + floor + '\'' +
            ", number='" + number + '\'' +
            ", name='" + name + '\'' +
        '}';
    }
}
