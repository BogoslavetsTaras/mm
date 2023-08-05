package lessons10cycles;

import java.util.Scanner;

public class App {
    public static void main ( String[] args ) {
        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] *= 2;
//            System.out.print ( arr[i] + " " );
//        }
//
//        for (int element : arr
//        ) {
//            System.out.print( element + " ");
//        }

        Scanner scanner = new Scanner ( System.in );

//        while (true){
//            String line = scanner.nextLine ();
//            if ( line.equalsIgnoreCase ( "stop") || line.equals ( "" ) ){
//                break;
//            }
//            System.out.println (line );
//        }

//        int value = 0;
//        do {
//            System.out.print ( "Введіть число:" );
//            value = value + scanner.nextInt ( );
//            System.out.println ( "Поточне значення: " + value );
//        } while (value < 100);

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
            if ( arr[i] == 5 ) break;
            if ( arr[i] % 2 != 0 ) continue;
            System.out.print ( arr[i] + " " );
        }


    }
}
