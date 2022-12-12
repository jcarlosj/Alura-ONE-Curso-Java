package collections;

import java.util.Collection;
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

        System.out.println( students );

        // Valida si un objeto con la misma instancia existe dentro del conjunto
        System.out.println( "Compara con la misma instancia" );
        if( students.contains( student ) )
            System.out.println( "\t" + student + " -> existe" );
        else
            System.out.println( "\t" + student + " -> NO existe" );

        // Valida si un objeto con otra instancia, pero los mismos datos, existe dentro del conjunto usando 'contains'
        System.out.println( "Compara con otra instancia con los mismos datos \n  (usando 'contains')" );
        Student new_student = new Student( "Ana Maria", "54931" );      // -> Crea NUEVA instancia de Ana Maria

        System.out.println( "  Iguales? " + student.equals( new_student ) + " - (original & nueva instancia)" );  // FALSE

        if( students.contains( new_student ) )                                      // Compara instancia ORIGINAL e instancia NUEVA
            System.out.println( "\t" + new_student + " -> existe" );
        else
            System.out.println( "\t" + new_student + " -> NO existe" );

        // Valida si un objeto con otra instancia, pero los mismos datos, existe dentro del conjunto usando 'equals'
        System.out.println( "  (usando 'equals')" );

        System.out.println( "  Iguales? " + student.equals( new_student ) + " - (original & nueva instancia)" );  // FALSE

        if( students.equals( new_student ) )                                        // Compara instancia ORIGINAL e instancia NUEVA
            System.out.println( "\t" + new_student + " -> existe" );
        else
            System.out.println( "\t" + new_student + " -> NO existe" );
    }
}
