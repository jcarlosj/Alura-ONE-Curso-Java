package collections;

import java.util.Arrays;

public class MainListByClassroom {
    public static void main(String[] args) {
        CourseListByClassroom class_list = new CourseListByClassroom(
            309,
            Arrays.asList(
                new Course( "Estadística I", 1 ),
                new Course( "Lógica programación", 2 ),
                new Course( "English", 1 )
            )
        );

        System.out.println( class_list );
        System.out.println( class_list.getCourses() );

        class_list.setCourses(
            Arrays.asList(
                new Course( "Java", 3 ),
                new Course( "Estadística II", 2 ),
                new Course( "Infraestructura", 2 )
            )
        );
        System.out.println( class_list.getCourses() );

    }
}
