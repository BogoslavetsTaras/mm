package lessons5;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main ( String[] args ) {
//        System.out.println( "Hello \nWorld!" );
//        System.out.println( "\tHello \tWorld!" );
//
//        String name = "Taras";
//        System.out.printf( Locale.CHINA, "Hello, %s\n ", name );
//
//        final Logger logger = Logger.getGlobal();
//        logger.info( "Hello, Taras!" );
//        logger.log( Level.OFF, "Hello, Taras!" );

        Scanner scanner = new Scanner( System.in );
        System.out.print( "Enter your name:" );
//        String name = scanner.nextLine( );
        String name = scanner.next( ); //зчитування до пробілу
        System.out.print( "Enter your age:" );
        int age = scanner.nextInt( );
//        System.out.println("Hello " + name + " You are " + age + " old." );
        System.out.printf( "\nHello %s. You are %d old.\n", name, age );

        scanner.close();
    }
}
