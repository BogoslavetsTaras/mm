package lessons8;

import java.util.Scanner;

public class App {
    public static void main ( String[] args ){
        Scanner scanner = new Scanner( System.in );


        System.out.print( "������ �����:" );
           int age = scanner.nextInt( );
           if(age <= 0){
               System.out.println("������ ��� �� ����" );
           }else if ( age >= 18 ) {
               System.out.println( "��� 18 ��� ����� ����." );
           } else if ( age >= 16 ) {
               System.out.println( "��� 16 ��� ����� ����." );
           } else {
               System.out.println( "��� ����� 16 ����." );
           }
    }
}
