package lessons19final;

import lessons14.Professor;

import java.util.ArrayList;

public class App {
    public static void main ( String[] args ) {
//        final double p = 3.14;
//        final ArrayList<String> strings = new ArrayList<> ( );
//        strings.add ( "Hello World!" );
//        System.out.println ( strings );

        final Professor professor = new Professor ( "Alex", "N.", 10 );
        professor.setExperience ( professor.getExperience ( ) + 1 );
        System.out.println ( professor.getExperience ( ) );

    }
}
