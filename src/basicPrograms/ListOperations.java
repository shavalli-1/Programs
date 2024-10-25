package basicPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {


    public static void main(String[] args) {
//Initialize a new ArrayList to store a collection of String elements representing names.

        List<String> list = new ArrayList<String>();

    /*
    . Add Elements
Add at least five names to the list using the add() method.
Additionally, add a name at a specific index using add(index, element).
     */
        list.add(0, "shaik");
        list.add("shavalli");
        list.add("ShaikShavalli");
        list.add("Nagemoon");
        list.add(2, "Alhamdulillah");

/*    Retrieve the first and last names from the list using the get(index) method.
              Print the retrieved names to the console.*/



        list.getFirst();
        list.getLast();
        list.get(0);
        list.get(list.size() - 1);

        /* Update Elements
Update a name in the list using the set(index, element) method.
Print the list before and after the update to demonstrate the change.
        */
        System.out.println("List Before: " + list);
        list.set(2, "Subhanallah");
        System.out.println("List after: " + list);

       /* Remove Elements
        Remove a name by its index using remove(index) and print the updated list.
        Also, remove a name by its value using remove(Object) and display the final list.
       */

        list.remove(0);
        System.out.println("Updated List: " + list);
        list.remove("shavalli");
        System.out.println("final List: " + list);

        // 6. Iterate Over the List

        for (String str : list) {
            System.out.println(str);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        //size of the given list
        System.out.println("Size of the list: " + list.size());

        //clearing the list
        list.clear();
        System.out.println("After Clearing the list: " + list);
    }
}
