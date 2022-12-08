package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MainObjectLists {
    public static void main(String[] args) {

        ArrayList<Course> courseList = new ArrayList<Course>( Arrays.asList(
            new Course( "Angular", 85 ),
            new Course( "Vue", 40 ),
            new Course( "React", 50 )
        ));

        courseList.add( new Course( "Node", 90 ) );

        System.out.println( courseList );
    }
}
