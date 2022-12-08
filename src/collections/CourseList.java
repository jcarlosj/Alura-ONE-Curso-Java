package collections;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
    private List<List> courses = new ArrayList<>();

    public CourseList( List<Course> course_list ) {
        this.courses.add( course_list );
    }

    public List<List> getCourses() {
        return courses;
    }

    public void addCourseList( List<Course> course_list ) {
        this.courses.add( course_list );
    }

    @Override
    public String toString() {
        return "CourseList{" + "\n" +
            "\tcourses=" + courses + "\n" +
        "}\n";
    }
}
