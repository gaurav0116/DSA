import java.util.ArrayList;     // import arraylist
import java.util.Collections;


public class MyArrayList {
    public static void main(String[] args) {

        // Create Array list (Type = Integer)
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Add items in arraylist
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(5);
            System.out.println(list);

        // Get items in arraylist
            int getItem = list.get(2);
            System.out.println("index no 1's element is: " + getItem);

        // Add item between the list
            list.add(3, 4);
            System.out.println(list);
        
        // Set element (modify element)
            list.set(0,0);
            System.out.println(list);

        // Delete element
            list.remove(0);
            list.remove(3);
            System.out.println(list);

        // Size of the list
            int size = list.size();
            System.out.println(size);

        // iterate the list
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();

        // sort the list
            Collections.sort(list);
            System.out.println(list);
    }
}
