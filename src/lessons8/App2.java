package lessons8;

import java.util.Scanner;

public class App2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Введіть назву міста:" );
        String city = scanner.next ( );

        switch (city) {
            case "Kyiv" -> System.out.println ( "Столиця" );
            case "Lviv" -> System.out.println ( "Захід" );
            case "Kharkiv" -> System.out.println ( "Схід" );
            default -> System.out.println ( "Інше місто" );
        }

//        switch (city) {
//            case "Kyiv": {
//                System.out.println( "Столиця" );
//                break;
//            }
//            case "Lviv": {
//                System.out.println( "Захід" );
//                break;
//            }
//            case "Kharkiv": {
//                System.out.println( "Схід" );
//            }
//            default: {
//                System.out.println( "Інше місто" );
//            }
//        }

//        if ( "Kyiv".equals ( city ) ) {
//            System.out.println ( "Столиця" );
//        } else if ( "Lviv".equals ( city ) ) {
//            System.out.println ( "Захід" );
//        } else if ( "Kharkiv".equals ( city ) ) {
//            System.out.println ( "Схід" );
//            System.out.println ( "Інше місто" );
//        } else {
//            System.out.println ( "Інше місто" );
//        }


    }
}
