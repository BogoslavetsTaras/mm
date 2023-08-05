package lessons7;

import java.util.Scanner;

public class App2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        System.out.print( "Введіть початок діапазону: " );
        int min = scanner.nextInt( );

        System.out.print( "Введіть кінець діапазону: " );
        int max = scanner.nextInt( );

        if ( min >= max ) {
            System.out.println( "Некоректний діапазон. Початок повинен бути менше кінця." );
        } else {
            // Генерація випадкового числа в заданому діапазоні


            int randomNumber = (int) Math.round( Math.random( ) * (max + 1 - min) + (min - 0.5) );

            System.out.println( "Випадкове число: " + randomNumber );
        }

        scanner.close( );
    }
}

