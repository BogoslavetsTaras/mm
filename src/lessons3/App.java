package lessons3;

import java.math.BigDecimal;

public class App {
    public static void main ( String[] args ) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 444444444444444444L;
        float f = 5.5f;
        double d = 6.6d;
        char c = 'A';
        boolean t = true;
        BigDecimal bdFromString = new BigDecimal( "0.1" );

//        long-> float
        long longValue = 3_000_000_000L;
        float floatValue = longValue;

//        double->long
        double doubleValue = 255.552;
        long longValue2 = (long) doubleValue;


        short shortValue = 128;
        byte byteValue = (byte) shortValue;
        System.out.println( byteValue );

        int rez = (int) l;
        System.out.println( rez );

        int rez2 = (char) 3;
        System.out.println( rez2 );

        char charValue = 'A';
        int intValue = charValue;
        System.out.println(intValue );

        int intValue2 = 98;
        char charValue2 = (char) intValue2;
        System.out.println(charValue2 );


    }
}
