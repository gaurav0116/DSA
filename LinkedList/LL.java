package LinkedList;
import java.util.LinkedList;    // linkedlist class

// Singley Linked-List
class LL{
    public static void main(String[] args) {
        // Create a new LL
        LinkedList<String> list = new LinkedList<String>();

        // Add element in first of LL
        list.addFirst("Gaurav");
        list.addFirst("name");
        list.addFirst("My");
        System.out.println(list);

        // Add element in lasr of LL
        list.addLast("I");
        list.add("am");     // store in last as default
        System.out.println(list);

        // Remove in fist 
        list.removeFirst();
        System.out.println(list);

        // Remove in last
        list.removeLast();
        System.out.println(list);

        // const size of list
        System.out.println(list.size());

        // print a list's values
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ "->");

        }
        System.out.print("null");
    }
}