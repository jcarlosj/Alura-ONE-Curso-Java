package collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MainSet {
    // TODO: https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html

    public static void main(String[] args) {
        Collection<String> students = new HashSet<String>(){
            {
                add( "Juan Carlos" );
                add( "Ana" );
                add( "Maria" );
                add( "Carolina" );
                add( "Juan" );
            }
        };
        students.add( "Ana Maria" );
        students.add( "Juan Carlos" );

        System.out.println( "[ORIGINAL]\n\t" + students );

        // Iterando una Colletion
        System.out.println( "Iterando conjunto" );
        for( String student : students ) {
            System.out.println( "\t> " + student );
        }

        // FORMA TRADICIONAL: Valida si una cadena dada existe en el conjunto
        String name_to_find = "Juan";
        System.out.println( "Valida si una cadena dada existe en el conjunto" );
        if( students.contains( "Juan" ) )
            System.out.println( ": '" + name_to_find + "' existe en el conjunto" );
        else
            System.out.println( ": '" + name_to_find + "' NO existe en el conjunto" );

        // FORMA usando Stream: Valida si una cadena dada existe en el conjunto
        name_to_find = "Gustavo Polar";
        System.out.println( students.stream().filter(alumno -> alumno.equalsIgnoreCase("Gustavo Polar" ) ).findFirst().orElse(": '" + name_to_find + "' NO Existe en el conjunto") );

        // Obtenemos el nombre mas largo del conjunto
        String longer_name = students.stream().max( Comparator.comparingInt( String::length ) ).get();
        System.out.println( ": El nombre mas largo es '" + longer_name + "', con " + longer_name.length() + " caracteres" );
        // Obtenemos el nombre mas corto del conjunto
        String shorter_name = students.stream().min( Comparator.comparingInt( String::length ) ).get();
        System.out.println( ": El nombre mas corto es '" + shorter_name + "', con " + shorter_name.length() + " caracteres" );

        // Elimina a Carolina y a Maria del conjunto

        System.out.println( "Elimina a Carolina y a Maria del conjunto" );
        String name_to_delete = "Carolina y Maria";
        students.removeIf( name_to_delete::equalsIgnoreCase );      // Elimina a 'Carolina' del conjunto
        name_to_delete = "Maria";
        students.removeIf( name_to_delete::equalsIgnoreCase );      // Elimina a 'Maria' del conjunto
        System.out.println( "[ACTUALIZADO]\n\t" + students );

    }
}
