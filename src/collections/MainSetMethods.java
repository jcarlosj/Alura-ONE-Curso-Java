package collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class MainSetMethods {
    public static void main(String[] args) {
        Collection<Student> students = new HashSet<Student>(){
            {
                add( new Student( "Juan Carlos", "87634" ) );
                add( new Student( "Maria", "69322" ) );
                add( new Student( "Maria", "72314" ) );
                add( new Student( "Carolina", "23093" ) );
                add( new Student( "Juan", "45391" ) );
            }
        };

        Student student = new Student( "Ana Maria", "54931" );      // -> Crea una instancia de Ana Maria (ORIGINAL)
        students.add( student );
        students.add( new Student( "Juan Carlos", "87634" ) );

//        System.out.println( students );

//        example1( students, student );
//        example2( students );
        example3( students );
    }

    public static void example3( Collection students ) {
        Course vue_course = new Course( "Vue Basico", 35 );

        for( Object student : students ) {
            vue_course.addStudent( ( Student ) student );
        }

        System.out.println( vue_course );

        // Imprime el código de los alumnos en forma descendente.
        System.out.println( "Imprime el código de los alumnos en forma descendente." );
        vue_course.getStudentsList().stream()
                .sorted( Comparator.comparing( Student::getCode ).reversed() )
                .forEach( student -> System.out.println( "\t> " + student.getCode() + " - " + student.getName() ) );
    }

    public static void example2( Collection students ) {
        Course angular_course = new Course( "Angular Basico", 50 );

        for( Object student : students ) {
            angular_course.addStudent( ( Student ) student );
        }

        System.out.println( angular_course );

        Student new_student = new Student( "Ana Maria", "54931" );

        // Hacemos las respectivas comparaciones usando 'contains' e 'equals'
        System.out.println( "  Contains? " + angular_course.getStudentsList().contains( new_student ) + " - (original & nueva instancia)" );  // TRUE
        System.out.println( "  studentExist? " + angular_course.studentExists( new_student ) + " - (original & nueva instancia)" );  // TRUE

        if( angular_course.studentExists( new_student ) )      // Compara instancia ORIGINAL e instancia NUEVA (sin hashCode: FALSE, con hashCode: TRUE)
            System.out.println( "\t" + new_student + " -> existe" );
        else
            System.out.println( "\t" + new_student + " -> NO existe" );

        // Valida si un objeto con otra instancia, pero los mismos datos, existe dentro del conjunto usando 'equals'
        System.out.println( "  (usando 'equals')" );

        System.out.println( "  Equals? " + angular_course.getStudentsList().equals( new_student ) + " - (original & nueva instancia)" );  // TRUE

        if( angular_course.getStudentsList().equals( new_student ) )        // Compara instancia ORIGINAL e instancia NUEVA (sin hashCode: FALSE, con hashCode: FALSE)
            System.out.println( "\t" + new_student + " -> existe" );
        else
            System.out.println( "\t" + new_student + " -> NO existe" );

    }

    public static void example1( Collection students, Student student ) {

        // Valida si un objeto con la misma instancia existe dentro del conjunto
        System.out.println( "Compara con la misma instancia" );
        if( students.contains( student ) )
            System.out.println( "\t" + student + " -> existe" );
        else
            System.out.println( "\t" + student + " -> NO existe" );

        // Valida si un objeto con otra instancia, pero los mismos datos, existe dentro del conjunto usando 'contains'
        System.out.println( "Compara con otra instancia con los mismos datos \n  (usando 'contains')" );
        Student new_student = new Student( "Ana Maria", "54931" );      // -> Crea NUEVA instancia de Ana Maria

        System.out.println( "  Iguales? " + student.equals( new_student ) + " - (original & nueva instancia)" );  // TRUE

        if( students.contains( new_student ) )      // Compara instancia ORIGINAL e instancia NUEVA (sin hashCode: FALSE, con hashCode: TRUE)
            System.out.println( "\t" + new_student + " -> existe" );
        else
            System.out.println( "\t" + new_student + " -> NO existe" );

        // Valida si un objeto con otra instancia, pero los mismos datos, existe dentro del conjunto usando 'equals'
        System.out.println( "  (usando 'equals')" );

        System.out.println( "  Iguales? " + student.equals( new_student ) + " - (original & nueva instancia)" );  // TRUE

        if( students.equals( new_student ) )        // Compara instancia ORIGINAL e instancia NUEVA (sin hashCode: FALSE, con hashCode: FALSE)
            System.out.println( "\t" + new_student + " -> existe" );
        else
            System.out.println( "\t" + new_student + " -> NO existe" );
    }
}
