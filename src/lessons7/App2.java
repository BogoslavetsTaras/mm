package lessons7;

import java.util.Scanner;

public class App2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        System.out.print( "������ ������� ��������: " );
        int min = scanner.nextInt( );

        System.out.print( "������ ����� ��������: " );
        int max = scanner.nextInt( );

        if ( min >= max ) {
            System.out.println( "����������� �������. ������� ������� ���� ����� ����." );
        } else {
            // ��������� ����������� ����� � �������� �������


            int randomNumber = (int) Math.round( Math.random( ) * (max + 1 - min) + (min - 0.5) );

            System.out.println( "��������� �����: " + randomNumber );
        }

        scanner.close( );
    }
}

