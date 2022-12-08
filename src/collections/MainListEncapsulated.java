package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainListEncapsulated {
    public static void main(String[] args) {
        Course finance_course = new Course( "Finanzas I", 2 );
        finance_course.addClassroom( new Classroom( "3", "9" ) );
        finance_course.addClassroom( new Classroom( "1", "7" ) );
        finance_course.addClassroom( new Classroom( "3", "11" ) );

        ArrayList<Classroom> classroom_list = new ArrayList<>(
            Arrays.asList(
                new Classroom( "3", "5" ),
                new Classroom( "2", "2" )
            )
        );

        Course java_course = new Course( "Java III", 3, classroom_list );

        List<Course> courses = new ArrayList<>();
        courses.add( finance_course );
        courses.add( java_course );

        finance_course.addClassroom( new Classroom( "1", "3" ) );

        System.out.println( "ESTADO INICIAL: Todos los cursos con todos sus salones: \n\t" + courses );

        // MUTABLE
        System.out.println( "\n*** MUTABLE ***" );

        List<Classroom> finace_course_classrooms = finance_course.getClassroom();       // Obtenemos los salones clase Finanzas I (usando su Getter)
        System.out.println(
            "Salones (Finanzas I): Obtenemos salones de Finanzas I (usando su Getter) \n\t" +
            finace_course_classrooms
        );

        finace_course_classrooms.add( new Classroom( "5", "13" ) );     // Agregamos un nuevo salon para la clase de Finanzas I

        System.out.println(
            "Salones (Finanzas I) - ACTUALIZADO: Agregamos un nuevo salon donde se impartira esta clase (Salon 513)\n\t" +
            finace_course_classrooms
        );
        System.out.println();


        ArrayList<Course> newClassroomList = new ArrayList<>();    // Creamos una nueva lista de cursos y
        newClassroomList.add( finance_course );                    // Agregamos nuevo salon a partir de la Instancia Original
        System.out.println(
            "Creamos NUEVA LISTA de salones para Finanzas I (Instancia Original): \n\t" +
            newClassroomList
        );

        System.out.println(
            "Obtenemos NUEVA LISTA de salones para Finanzas I  (Instancia Original): \n\t" +
            newClassroomList.get( 0 ).getClassroom()
        );

    }
}
