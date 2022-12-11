package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainCollectionsStreams {
    public static void main(String[] args) {
        ArrayList<Course> course_list = new ArrayList<>() {
            {
                add( new Course( "PHP", 30 ) );
                add( new Course( "Ruby", 40 ) );
                add( new Course( "JavaScript", 26 ) );
                add( new Course( "Python", 20 ) );
                add( new Course( "JavaScript", 44 ) );
                add( new Course( "Java", 60 ) );
                add( new Course( "JavaScript", 26 ) );
                add( new Course( "PHP", 34 ) );
                add( new Course( "Python", 20 ) );
            }
        };

        System.out.println( "*** LISTA DE CURSOS ***\n" + course_list );

        calculate_total_hours( course_list );
        get_longer_course( course_list );
        calculate_total_hours( course_list, "Ruby" );
        calculate_total_average( course_list );
        get_shorter_course( course_list );
        calculate_courses_by_name( course_list );
    }

    public static void calculate_total_hours( ArrayList<Course> course_list ) {
        System.out.println( "*** Total hours ***" );

        // Obtener el total de horas de los cursos de la lista tratandola como Collections
        int total_time = 0;
        for( Course course: course_list ) {
            total_time += course.getTime();
        }
        System.out.println( "\t> Collections: " + total_time + " hours" );

        // Obtener el total de horas de los cursos de la lista tratandola como Stream
        System.out.println( "\t> Streams: " + course_list.stream().mapToInt( Course::getTime ).sum() + " hours" );
    }

    public static void get_longer_course( ArrayList<Course> course_list ) {
        System.out.println( "*** Longer course ***" );

        // Obtener el curso con mas horas de la lista tratandola como Collections
        int longer_duration = 0;
        for( Course course: course_list ) {
            if( course.getTime() > longer_duration )
                longer_duration = course.getTime();
        }
        System.out.println( "\t> Collections: " + longer_duration + " hours" );

        // Obtener el curso con mas horas de la lista tratandola como Stream
        System.out.println( "\t> Streams: " + course_list.stream().mapToInt( Course::getTime ).max().getAsInt() + " hours" );

        // Obtener el curso con mas horas de la lista tratandola como ParallelStream
        System.out.println( "\t> ParallelStreams: " + course_list.parallelStream().mapToInt( Course::getTime ).max().getAsInt() + " hours" );
    }

    public static void calculate_total_hours( ArrayList<Course> course_list, String course_name ) {
        System.out.println( "*** Total hours excluding a Course ***" );

        // Obtener el total de horas de los cursos de la lista tratandola como Collections excluyendo un curso
        int total_time = 0;
        for( Course course: course_list ) {
            if( ! course.getName().equals( course_name ) ) {
                total_time += course.getTime();
            }
        }
        System.out.println( "\t> Collections: " + total_time + " hours, excluding the course of '" + course_name + "'" );

        // Obtener el total de horas de los cursos de la lista tratandola como Stream excluyendo un curso
        System.out.println( "\t> Streams: " + course_list.stream().filter( course -> ! course.getName().equals( course_name ) ).mapToInt( Course::getTime ).sum() + " hours, excluding the course of '" + course_name + "'" );
    }

    public static void calculate_total_average( ArrayList<Course> course_list ) {
        System.out.println( "*** Average course listing time ***" );

        // Obtener el promedio de horas de los cursos de la lista tratandola como Collections
        int total_time = 0;
        for( Course course: course_list ) {
            total_time += course.getTime();
        }

        double average = total_time / course_list.size();

        System.out.println( "\t> Collections: " + average + " average hours" );

        // Obtener el promedio de horas de los cursos de la lista tratandola como Stream excluyendo un curso
        System.out.println( "\t> Streams: " + course_list.stream().mapToInt( Course::getTime ).average().getAsDouble() + " average hours" );

        // Obtener el promedio de horas de los cursos de la lista tratandola como ParallelStream excluyendo un curso
        System.out.println( "\t> ParallelStreams: " + course_list.parallelStream().mapToInt( Course::getTime ).average().getAsDouble() + " average hours" );
    }

    public static void get_shorter_course( ArrayList<Course> course_list ) {
        System.out.println( "*** Shorter course ***" );

        // Obtener el curso con menos horas de la lista tratandola como Collections
        int shorter_duration = 1000;
        for( Course course: course_list ) {
            if( course.getTime() < shorter_duration )
                shorter_duration = course.getTime();
        }
        System.out.println( "\t> Collections: " + shorter_duration + " hours" );

        // Obtener el curso con menos horas de la lista tratandola como Stream
        System.out.println( "\t> Streams: " + course_list.stream().mapToInt( Course::getTime ).min().getAsInt() + " hours" );
    }

    public static void calculate_courses_by_name( ArrayList<Course> course_list ) {
        System.out.println( "*** Grouped courses: Courses by name ***" );

        // Agrupar cursos de la lista para obtener el numero de cursos repetidos en la lista como Stream
        Map<String, List<Course>> course_groups = course_list.stream().collect( Collectors.groupingBy( Course::getName ) );
        System.out.println( course_groups );
        System.out.println( "\t> Streams: " );
        course_groups.forEach( ( key, value ) -> System.out.println( "\t\t- " + key + ": " + value.size() ) );
    }
}
