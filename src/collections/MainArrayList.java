package collections;

import java.util.*;
import java.util.stream.Collectors;

public class MainArrayList {
    public static void main(String[] args) {
        iterateArrayList();
        sortArrayList();
    }

    public static void sortArrayList() {
        ArrayList<String> nameList = new ArrayList<String>( Arrays.asList( "Paul", "David", "Lisa", "Alyssa", "Alex", "Ronald", "Todd", "Hope" ) );

        System.out.println( "Lista original" );
        System.out.println( "\t" + nameList );

        // Usando clase 'Collections'
        Collections.sort( nameList );
        System.out.println( "Lista ordenada ASC usando clase 'Collections'" );
        System.out.println( "\t" + nameList );

        Collections.sort( nameList, Collections.reverseOrder() );
        System.out.println( "Lista ordenada DESC usando clase 'Collections'" );
        System.out.println( "\t" + nameList );

        // Usando 'sort' y clase 'Comparator'
        nameList.sort( Comparator.naturalOrder() );
        System.out.println( "Lista ordenada ASC usando metodo 'sort' y clase 'Comparator'" );
        System.out.println( "\t" + nameList );

        nameList.sort( Comparator.reverseOrder() );
        System.out.println( "Lista ordenada DESC usando metodo 'sort' y clase 'Comparator'" );
        System.out.println( "\t" + nameList );

        // Usando 'stream' y clase 'Collectors'
        List<String> nameListAsc = nameList.stream().sorted().collect( Collectors.toList() );
        System.out.println( "Lista ordenada ASC usando metodo 'stream' y clase 'Collectors'" );
        System.out.println( "\t" + nameListAsc );

        List<String> nameListDsc = nameList.stream().sorted( Collections.reverseOrder() ).collect( Collectors.toList() );
        System.out.println( "Lista ordenada DSC usando metodo 'stream' y clase 'Collectors'" );
        System.out.println( "\t" + nameListDsc );
    }

    public static void iterateArrayList () {
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add( "Apple" );
        fruitList.add( "Orange" );
        fruitList.add( "Grapes" );
        fruitList.add( "Corn" );
        fruitList.add( "Mango" );
        fruitList.add( "Lulo" );

        fruitList.remove( 3 );
        fruitList.set( 2, "Mandarin" );

        System.out.println( "FORMA 1: Iterando usando un bucle for tradicional" );
        System.out.print( "\t" );
        // FORMA 1: Iterando usando un bucle for tradicional
        for( int i = 0; i < fruitList.size(); i++ ) {
            System.out.print( fruitList.get( i ) + ", " );
        }
        System.out.println();

        System.out.println( "FORMA 2: Iterando usando un bucle corto tipo for" );
        System.out.print( "\t" );
        // FORMA 2: Iterando usando un bucle corto tipo for
        for( String fruit : fruitList ) {
            System.out.print( fruit + ", " );
        }
        System.out.println();

        System.out.println( "FORMA 3: Iterando con metodo forEach y los Lambdas, disponibles desde la version Java 8 en adelante" );
        System.out.print( "\t" );
        // FORMA 3: Iterando con metodo forEach y los Lambdas, disponibles desde la version Java 8 en adelante
        fruitList.forEach( fruit -> System.out.print( fruit + ", " ) );
        System.out.println();
    }
}
