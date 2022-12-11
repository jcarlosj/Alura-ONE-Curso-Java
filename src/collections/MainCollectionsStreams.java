package collections;

import java.util.ArrayList;

public class MainCollectionsStreams {
    public static void main(String[] args) {
        ArrayList<Course> course_list = new ArrayList<>() {
            {
                add( new Course( "PHP", 30 ) );
                add( new Course( "Ruby", 40 ) );
                add( new Course( "JavaScript", 26 ) );
                add( new Course( "Python", 20 ) );
            }
        };

        System.out.println( "*** LISTA DE CURSOS ***\n" + course_list );

        calculate_total_hours( course_list );
        get_longer_course( course_list );
        calculate_total_hours( course_list, "Ruby" );
    }

    public static void calculate_total_hours( ArrayList<Course> course_list ) {
        System.out.println( "*** Total hours ***" );

        // Obtener el total de horas de los cursos de la lista tratandola como Collections
        int total_time = 0;
        for( Course course: course_list ) {
            total_time += course.getTime();
        }
        System.out.println( "Collections: " + total_time + " hours" );

        // Obtener el total de horas de los cursos de la lista tratandola como Stream
        System.out.println( "Stream: " + course_list.stream().mapToInt( Course::getTime ).sum() + " hours" );
    }

    public static void get_longer_course( ArrayList<Course> course_list ) {
        System.out.println( "*** Longer course ***" );

        // Obtener el curso con mas horas de la lista tratandola como Collections
        int longer_duration = 0;
        for( Course course: course_list ) {
            if( course.getTime() > longer_duration )
                longer_duration = course.getTime();
        }
        System.out.println( "Collections: " + longer_duration + " hours" );

        // Obtener el curso con mas horas de la lista tratandola como Stream
        System.out.println( "Stream: " + course_list.stream().mapToInt( Course::getTime ).max().getAsInt() + " hours" );
    }

    public static void calculate_total_hours( ArrayList<Course> course_list, String course_name ) {
        System.out.println( "*** Total hours excluding a Course ***" );

        // Obtener el total de horas de los cursos de la lista tratandola como Collections
        int total_time = 0;
        for( Course course: course_list ) {
            if( ! course.getName().equals( course_name ) ) {
                total_time += course.getTime();
            }
        }
        System.out.println( "Collections: " + total_time + " hours, excluding the course of '" + course_name + "'" );

        // Obtener el total de horas de los cursos de la lista tratandola como Stream
        System.out.println( "Stream: " + course_list.stream().filter( course -> ! course.getName().equals( course_name ) ).mapToInt( Course::getTime ).sum() + " hours, excluding the course of '" + course_name + "'" );
    }
}
