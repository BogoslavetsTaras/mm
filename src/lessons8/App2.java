package lessons8;

import java.util.Scanner;

public class App2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "������ ����� ����:" );
        String city = scanner.next ( );

        switch (city) {
            case "Kyiv" -> System.out.println ( "�������" );
            case "Lviv" -> System.out.println ( "�����" );
            case "Kharkiv" -> System.out.println ( "����" );
            default -> System.out.println ( "���� ����" );
        }

//        switch (city) {
//            case "Kyiv": {
//                System.out.println( "�������" );
//                break;
//            }
//            case "Lviv": {
//                System.out.println( "�����" );
//                break;
//            }
//            case "Kharkiv": {
//                System.out.println( "����" );
//            }
//            default: {
//                System.out.println( "���� ����" );
//            }
//        }

//        if ( "Kyiv".equals ( city ) ) {
//            System.out.println ( "�������" );
//        } else if ( "Lviv".equals ( city ) ) {
//            System.out.println ( "�����" );
//        } else if ( "Kharkiv".equals ( city ) ) {
//            System.out.println ( "����" );
//            System.out.println ( "���� ����" );
//        } else {
//            System.out.println ( "���� ����" );
//        }


    }
}
