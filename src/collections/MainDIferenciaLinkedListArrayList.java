package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainDIferenciaLinkedListArrayList {

    public static final List<List<Integer>> lists = new ArrayList<List<Integer>>() {
        {
            add( new LinkedList<>() );
            add( new ArrayList<>() );
        }
    };
    public static final int MAXIMUM_QUANTITY = 200000;

    public static void main(String[] args) {

        // Itera lista principal de tipo ArrayList que contiene dos listas de tipo (LinkedList & ArrayList)
        for( List<Integer> list : lists ) {
            final String implementation_name = list.getClass().getName();

            // Iteracion para AGREGAR elementos a cada tipo de lista (LinkedList & ArrayList)
            long initial_time = System.currentTimeMillis();
            for( int i = MAXIMUM_QUANTITY; i >= 0; i-- ) {
                list.add( i );
            }
            long final_time = System.currentTimeMillis();
            long duration = final_time - initial_time;

            System.out.println( " > " + implementation_name + " (add) time: " + duration );

            // Iteracion para OBTENER elementos a cada tipo de lista (LinkedList & ArrayList)
            initial_time = System.currentTimeMillis();
            for( int i = MAXIMUM_QUANTITY; i >= 0; i-- ) {
                list.get( i );
            }
            final_time = System.currentTimeMillis();
            duration = final_time - initial_time;

            System.out.println( " > " + implementation_name + " (get) time: " + duration );

            // Iteracion para ELIMNAR elementos a cada tipo de lista (LinkedList & ArrayList)
            initial_time = System.currentTimeMillis();
            for( int i = MAXIMUM_QUANTITY; i >= 0; i-- ) {
                list.remove( i );
            }
            final_time = System.currentTimeMillis();
            duration = final_time - initial_time;

            System.out.println( " > " + implementation_name + " (remove) time: " + duration );
        }
    }
}
