package collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Stream;

public class MainMap {
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

        /*** Encontrar un estudiante por código dentro del curso de Python ***/
        // Usando Streams
        System.out.println( "*** Encontrar un estudiante por código dentro del curso de Python ***" );
        System.out.println( "  (usando Stream)" );
        Optional<Student> student_found = python_course.getStudentsList().stream().filter(student -> "87634".equalsIgnoreCase( student.getCode() ) ).findFirst();

        if( student_found.isPresent() )
            System.out.println( "\t" + student_found.get() );

        // Usando Map: Pretende evitar las iteraciones (mejorar performance de cara a la cantidad de registros),
        // ya que su uso esta determinado por una propiedad única por la que deseamos identificar nuestros datos.
        System.out.println( "  (usando Map)" );
        Student student_found_2 = python_course.getStudentsMap().get( "87634" );
        System.out.println( "\t" + student_found_2 );
    }
}
