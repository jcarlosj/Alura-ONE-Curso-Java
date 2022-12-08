package collections;

import java.util.*;
import java.util.stream.Collectors;

public class MainObjectLists {
    public static void main(String[] args) {
        ArrayList<Course> courseList = new ArrayList<Course>( Arrays.asList(
                new Course( "Angular", 85 ),
                new Course( "Vue", 40 ),
                new Course( "React", 50 )
        ));

        courseList.add( new Course( "Node", 90 ) );

        System.out.println( "Lista original \t" + courseList );

        // FORMA 1: Usando la Interface 'Comparator' en la clase 'Course' para implementar clase 'Collections' para el
        //          ordenamiento de objetos dentro del 'ArrayList'.
        System.out.println( "\n*** ORDENAR: usando interface 'Comparable' y la clase 'Collections ***" );
        Collections.sort( courseList );
        System.out.println( "Lista ordenada ASC \t" + courseList );
        Collections.sort( courseList, Collections.reverseOrder() );
        System.out.println( "Lista ordenada DSC \t" + courseList );

        // FORMA 2: No requiere la implementacion de la Interface 'Comparator' en la clase 'Course'
        //          Esta implementacion hace uso de la clase 'Collection'
        System.out.println( "\n*** ORDENAR: usando clase 'Collections' & 'Comparator' ***" );
        Collections.sort( courseList, Comparator.comparing( Course::getName ) );
        System.out.println( "Lista ordenada ASC \t" + courseList );
        Collections.sort( courseList, Comparator.comparing( Course::getName ).reversed() );
        System.out.println( "Lista ordenada DSC \t" + courseList );

        // FORMA 3: No requiere la implementacion de la Interface 'Comparator' en la clase 'Course'
        //          Esta implementacion se hace sobre el ArrayList
        System.out.println( "\n*** ORDENAR: usando metodo 'sort' y clase 'Comparator' ***" );
        courseList.sort( Comparator.comparing( Course::getName ) );
        System.out.println( "Lista ordenada ASC \t" + courseList );
        courseList.sort( Comparator.comparing( Course::getName ).reversed() );
        System.out.println( "Lista ordenada DSC \t" + courseList );

        // FORMA 4: No requiere la implementacion de la Interface 'Comparator' en la clase 'Course'
        //          Esta implementacion usando 'stream' genera una nueva lista ordenada
        System.out.println( "\n*** ORDENAR: usando metodo 'stream' y clase 'Comparator' ***" );
        List<Course> orderByNameAsc = courseList.stream().sorted( Comparator.comparing( Course::getName ) ).collect( Collectors.toList() );
        System.out.println( "Lista ordenada ASC por nombre \t" + orderByNameAsc );
        List<Course> orderByNameDsc = courseList.stream().sorted( Comparator.comparing( Course::getName ).reversed() ).collect( Collectors.toList() );
        System.out.println( "Lista ordenada DSC por nombre \t" + orderByNameDsc );

        List<Course> orderByTimeAsc = courseList.stream().sorted( Comparator.comparingInt( Course::getTime ) ).collect( Collectors.toList() );
        System.out.println( "Lista ordenada ASC por tiempo \t" + orderByTimeAsc );
        List<Course> orderByTimeDsc = courseList.stream().sorted( Comparator.comparingInt( Course::getTime ).reversed() ).collect( Collectors.toList() );
        System.out.println( "Lista ordenada DSC por tiempo \t" + orderByTimeDsc );
    }
}
