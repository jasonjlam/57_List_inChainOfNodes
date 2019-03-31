/*********************************
 * comments
 ********************************/

public class UserOfOrderedList {
    private static final int TEST_NUMBER = 10;
    
	public static void main(String[] commandLine) {
		System.out.println("Ordered List Testing");
        OrderedList_inArraySlots test = new OrderedList_inArraySlots();
        // add() testing;
        for (int i = 0; i < TEST_NUMBER; i++) {
            int num = (int)Math.floor(Math.random() * 20);
            System.out.println("Adding: " + num);
            test.add(num);
            System.out.println(test.size() + ": " + test);
        }
        // get() testing;
        for (int i = 0; i < TEST_NUMBER; i++) {
            int num = (int)Math.floor(Math.random() * 20);
            System.out.println("Getting: " + num);
            System.out.println(test.get(num));
        }
        // remove() testing;
        for (int i = 0; i < TEST_NUMBER; i++) {
            int num = (int)Math.floor(Math.random() * 20);
            System.out.println("Removing: " + num);
            System.out.println(test.remove(num));
            System.out.println(test.size() + ": " + test);
        }
        
        
	}
}