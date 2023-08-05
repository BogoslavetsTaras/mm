package lessons4;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class App2 {
    public static void main ( String[] args ) {
//        String name = "Taras";
//        String soNane = "Bogoslavets";
//        int newMails = 153;
//        String mess = String.format( "Hello " + name + ". You have " + newMails + " new mails." + " Today:" + LocalDate.now( ) + " " + LocalTime.now( ) );
//        String mess2 = String.format( "Hello %s. You have %d new mails. Today: %s".formatted( name, newMails, LocalDate.now( ) ) );
//
////        System.out.println( mess );
////        System.out.println( mess2 );
//
//
//
//        String mees3 = String.format( "Hello: %2$s, %1$s ", name, soNane);
//        String mees4 = String.format( "Hello: %s %s Today is %s".formatted( soNane, name, LocalDate.now( ) ) );
//
//        System.out.println( mees3 );
//        System.out.println( mees4 );


        String s = String.format( "Value: %.2f", 2.2555 );
        String s2 = String.format( "Value: %8.2f", 2.2555 );
        String s3 = String.format( "Value: %08.2f", 2.2555 );
        String s4 = String.format( Locale.CANADA, "Value: %08.2f", 2.2555 );
        String s5 = String.format( Locale.US, "Value: %08.2f", 2.2555 );
        String s6 = String.format( "Value: %09d", 123 );


        System.out.println( s );
        System.out.println( s2 );
        System.out.println( s3 );
        System.out.println( s4 );
        System.out.println( s5 );
        System.out.println( s6 );


//
//
//        System.out.println( "Hello " + name + ". You have " + newMails + " new mails." );
//
//        System.out.println( new StringBuilder( ).append( "Hello " ).append( name ).append( ". You have " ).append( newMails ).append( " new mails." ).toString( ) );
//
//        System.out.printf( "Hello %s. You have %d new mails%n", name, newMails );
//
//        System.out.println( MessageFormat.format( "Hello {0}. You have {1} new mails.", name, newMails ) );

    }
}
