package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseListByClassroom {
    private int classroom_id;
    private List<Course> courses = new ArrayList<>();

    public CourseListByClassroom( int id, List<Course> courses ) {
        this.classroom_id = id;
        this.courses = courses;
    }

    // Getters & Setters
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses( List<Course> courses ) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "CourseListByClassroom{" +
            "classroom_id=" + classroom_id +
            ", courses=" + courses +
        '}';
    }
}
