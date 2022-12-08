package collections;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        iterateArrayList();
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
