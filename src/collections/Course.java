package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Course implements Comparable<Course> {
    private String name;
    private int time;
    private List<Classroom> classroom_list = new ArrayList<>();

    // Constructor
    public Course( String name, int time ) {
        this.name = name;
        this.time = time;
    }

    public Course( String name, int time, ArrayList<Classroom> classroom_list ) {
        this.name = name;
        this.time = time;
        this.classroom_list = classroom_list;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<Classroom> getClassroom() {
        return Collections.unmodifiableList( classroom_list );
    }

    public void setClassroom( List<Classroom> classroom ) {
        this.classroom_list = classroom;
    }

    // Methods
    public void addClassroom( Classroom classroom ) {
        this.classroom_list.add( classroom );
    }

    @Override
    public String toString() {
        return "Course{" +
            "name='" + name + '\'' +
            ", time=" + time +
            ", classroom_list=" + classroom_list +
        '}';
    }

    @Override
    public int compareTo( Course course ) {
        return this.getName().compareTo( course.getName() );
    }
}
