package lessons14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main ( String[] args ) {

        Professor professorAlex = new Professor ( "Alex", "A", 10 );
        String profMsg = professorAlex.mail ( "Hello! Who are you?" );
        System.out.println ( profMsg );
        System.out.println (professorAlex.getMsgSent () );
        System.out.println (Professor.department );
//        Professor.department = "Economics";
//        System.out.println ( Professor.department );
        System.out.println (User.userCount );

        Student studentNick = new Student ( "Nick", "Leleka", 5, 3 );
//        String studMsg = studentNick.mail ( "Hello, I am a student" );
//        System.out.println ( studMsg );
//        System.out.println (studentNick.getSurname () );

        String proMsg1 = professorAlex.mail ( "Hello! Who are you?", studentNick.getSurname ( ) );
        System.out.println (proMsg1 );
        String proMsg2 = professorAlex.mail ( 5, studentNick.getSurname ( ) );
        System.out.println (proMsg2 );

//        List<User> userList = new ArrayList<> ( );
//        userList.add ( professorAlex );
//        userList.add ( studentNick );
//        System.out.println ( userList );

    }
}
