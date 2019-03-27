/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
                          
        // get()
        System.out.println("get() testing");
        System.out.println(list.get(2));
        
        // set()
        System.out.println("set() testing");
        list.set(2, "a");
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        list.set(0, "s");    
        System.out.println( "populated list: " + list
                          + System.lineSeparator());            
        // add()
        System.out.println("add() testing");
        list.add(2, "u");
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        list.add(0, "a");
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
                          
         list.add(5, "a");
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        
        // remove()
        System.out.println("remove() testing");
        list.remove(3);
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        list.remove(0);
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        list.remove(4);
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        
        
    }
}
