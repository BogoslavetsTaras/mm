package lessons18Recursive;

/*
3! = 3*2*1 =6
5! = 5*4*3*2*1 =120
1!=1
0!=1
 */

public class App {
    public static void main ( String[] args ) {
        int fact = recursive ( 5 );
        System.out.println ( fact );

    }

    public static int recursive ( int n ) {
        int result = 1;
        for (int j = 1; j <= n; j++) {
            result = result * j;
        }
        return result;

        //        _________________________________________________________________________________
//        if ( n == 1 ) return 1;
//        return n * recursive ( n - 1 );
        //        _________________________________________________________________________________


//        if ( n == 0 ) {
//            System.out.println ( n );
//            return;
//        }
//        recursive ( n + 1 );
//        _________________________________________________________________________________

//        return n == 1 ? 1 : n * recursive ( n - 1 );
        //        _________________________________________________________________________________
//        return switch (n) {
//            case 1 -> 1;
//            default -> n * recursive ( n - 1 );
//        };

    }
}
