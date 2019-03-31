/**
  Implement a list of diverse types.
 */

public class OrderedList_inArraySlots {

    private List_inArraySlots list;

    /**
      Construct an empty list with a small initial capacity.
     */
    public OrderedList_inArraySlots() {
      list = new List_inArraySlots();
    }


    /**
      @return the number of elements in this list
     */
   public int size() {
      return list.size();
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        return list.toString();
    }


    /**
      Appends @value to the list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add( int val) {
        if (list.get(0) > val) {
            list.add(0, val);
            return true;
        } 
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i-1)< val && list.get(i) > val) || val == list.get(i)) {
                index = i;
                list.add(index, val);
                return true;
            }        
        }
        list.add(val);
        return true;  
     }

    // Returns the first time an int occurs in the list.
    public int get( int val){
        // pass-through request
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                  return i;
            }
        }
        return -1;
    }
    
    // Removes the first instance of an int in the list.
    public boolean remove (int val) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                  list.remove(i);
                  return true;
            }
        }
        return false;
    }
        
        
}

