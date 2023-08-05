package lessons11collection;

import java.util.*;

public class App2 {
    public static void main ( String[] args ) {
        ArrayList<String> strings = new ArrayList<> ( );
        strings.add ( "Hello world!" );
        strings.add ( "You are" );

//        System.out.println ( strings);
//        System.out.println ( strings.get ( 1 ));


        LinkedList<String> linkedList = new LinkedList<> ( );
//        linkedList.add ( 0, "Hello" );
//        linkedList.add ( 1, "World!" );
        linkedList.add ( "Hello" );
        linkedList.add ( "World!" );

//        System.out.println (linkedList );
//        System.out.println (linkedList.getFirst () );
//        System.out.println (linkedList.get ( 1 ) );


        HashSet<String> hashSet = new HashSet<> ( );
        hashSet.add ( "2" );
        hashSet.add ( "1" );
        hashSet.add ( "2" );
        hashSet.add ( "3" );
        hashSet.add ( "1" );

//        System.out.println (hashSet );


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer> ( );
        linkedHashSet.add ( 40 );
        linkedHashSet.add ( 20 );
        linkedHashSet.add ( 40 );
        linkedHashSet.add ( 30 );

//        System.out.println (linkedHashSet );
//        System.out.println (linkedHashSet.size () );


        HashMap<Integer, Integer> hashMap = new HashMap<> ( );
        hashMap.put ( 0, 1 );
        hashMap.put ( 1, 2 );
        hashMap.put ( 2, 4 );
        hashMap.put ( 3, 9 );

//        System.out.println (hashMap );
//        System.out.println (hashMap.size () );
//        System.out.println (hashMap.values () );
//        System.out.println (hashMap.get ( 2 ) );
//        System.out.println (hashMap.containsKey ( 2 ) );
//        System.out.println (hashMap.containsValue ( 2 ) );


    }
}
