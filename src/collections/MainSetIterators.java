package collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MainSetIterators {
    // TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html

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

        students.add( new Student( "Ana Maria", "54931" ) );
        students.add( new Student( "Juan Carlos", "87634" ) );

        Course python_course = new Course( "Python Basico", 50 );

        for( Object student : students ) {
            python_course.addStudent( ( Student ) student );
        }

        System.out.println( "Listado alumnos curso de Python (for)" );
        python_course.getStudentsList().forEach( student -> System.out.println( "\t> " + student ) );

        // Iterator: es una forma de como vamos a leer una lista
        Iterator<Student> studentsIterator = python_course.getStudentsList().iterator();

        System.out.println( "Listado alumnos curso de Python (Iterator)" );
        while ( studentsIterator.hasNext() ) {
            System.out.println( "\t> " + studentsIterator.next() );
        }

        // El iterador definido queda en la ultima posicion una ves iterado, por lo que si le indicamos avanzar
        // el valor será nulo, entonces debemos controlar la excepción que lanzaría en caso de hacerlo
        try {
            studentsIterator.next();
        } catch ( NoSuchElementException e ){
            System.out.println( "No Existen más alumnos en la lista" );
        }

    }
}
