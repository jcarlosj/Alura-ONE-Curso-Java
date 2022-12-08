package collections;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        ArrayList<Course> tech_courses = new ArrayList<>(
            Arrays.asList(
                new Course( "PHP", 16 ),
                new Course( "Ruby", 24 ),
                new Course( "Java", 60 ),
                new Course( "Go", 22 ),
                new Course( "Pascal", 60 ),
                new Course( "JavaScript", 35 ),
                new Course( "Kotlin", 34 ),
                new Course( "Dart", 50 )
            )
        );

        LinkedList<Course> language_courses = new LinkedList<>(
            Arrays.asList(
                new Course( "Español", 80 ),
                new Course( "English", 180 ),
                new Course( "Français", 140 ),
                new Course( "Português", 70 )
            )
        );

        Vector<Course> marketing_courses = new Vector<>(
            Arrays.asList(
                new Course( "Google Analitycs", 100 ),
                new Course( "Google Studio", 60 ),
                new Course( "Google Ads", 80 )
            )
        );

        CourseList all_courses = new CourseList( tech_courses );
        all_courses.addCourseList( language_courses );
        all_courses.addCourseList( marketing_courses );
        System.out.println( all_courses );

    }
}
