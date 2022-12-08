package collections;

import java.util.Random;

public class Course {
    private String name;
    private int time;

    // Constructor
    public Course( String name, int time ) {
        this.name = name;
        this.time = time;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Course{" +
            "name='" + name + '\'' +
            ", time=" + time +
        '}';
    }
}
