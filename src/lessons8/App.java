package lessons8;

import java.util.Scanner;

public class App {
    public static void main ( String[] args ){
        Scanner scanner = new Scanner( System.in );


        System.out.print( "¬вед≥ть число:" );
           int age = scanner.nextInt( );
           if(age <= 0){
               System.out.println("“акого в≥ку не ≥снуЇ" );
           }else if ( age >= 18 ) {
               System.out.println( "¬ам 18 або б≥льше рок≥в." );
           } else if ( age >= 16 ) {
               System.out.println( "¬ам 16 або б≥льше рок≥в." );
           } else {
               System.out.println( "¬ам менше 16 рок≥в." );
           }
    }
}
