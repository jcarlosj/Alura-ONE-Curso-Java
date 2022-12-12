package collections;

import java.util.*;

public class Course implements Comparable<Course> {
    private String name;
    private int time;
    private List<Classroom> classroom_list = new ArrayList<>();
    private Collection<Student> students_list = new HashSet<>();

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

    public Collection<Student> getStudentsList() {
        return students_list;
    }

    public void setStudentsList( Collection<Student> students_list ) {
        this.students_list = students_list;
    }

    // Methods
    public void addClassroom( Classroom classroom ) {
        this.classroom_list.add( classroom );
    }

    public void addStudent( Student student ) {
        this.students_list.add( student );
    }

    public boolean studentExists( Student student ) {
        return this.students_list.contains( student );
    }

    @Override
    public String toString() {
        return "Course{" +
            "name='" + name + '\'' +
            ", time=" + time +
            ", classroom_list=" + classroom_list +
            ", students_list=" + students_list +
        '}';
    }

    @Override
    public int compareTo( Course course ) {
        return this.getName().compareTo( course.getName() );
    }
}
