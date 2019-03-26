/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
      The default constructor is fine:
      take zero arguments
      do nothing
     */

    /**
      @return the number of elements in this list
     */
    public int size() {
        // recursive approach seems more perspicuous
        if( headReference == null) return 0;
        else return size( headReference);
    }

    // recursively-called helper
    private int size( Node startingAt) {
        Node next = startingAt.getReferenceToNextNode();
        if( next == null) return 1;
        else return 1+ size( next);
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        String stringRep = size() + " elements [";

        for( Node node = headReference
           ; node != null
           ; node = node.getReferenceToNextNode() )
            stringRep += node.getCargoReference() + ",";
        return stringRep + "]";
    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        headReference = new Node( val, headReference);
        return true;
     }
     
     public Object get( int index){
        // pass-through request
        Node val = headReference;
        for (int i = 0; i < index; i++) {
            val = val.getReferenceToNextNode();
        }
        return val.getCargoReference();
    }
    
    public boolean set(int index, Object val){
        Node currentNode = headReference;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getReferenceToNextNode();
        }
        Node nextNode = currentNode.getReferenceToNextNode();
        Node newNode = new Node(val, nextNode.getReferenceToNextNode());
        currentNode.setReferenceToNextNode(newNode);
        return true;
    }
    
    public boolean add(int index, Object val){
        Node currentNode = headReference;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getReferenceToNextNode();
        }
        Node newNode = new Node(val, currentNode.getReferenceToNextNode());
        currentNode.setReferenceToNextNode(newNode);
        return true;
   }
   
   public boolean remove(int index){
        Node currentNode = headReference;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getReferenceToNextNode();
        }
        Node nextNode = currentNode.getReferenceToNextNode();
        currentNode.setReferenceToNextNode(nextNode.getReferenceToNextNode());
        return true;
   }
}