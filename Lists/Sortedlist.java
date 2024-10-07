//Create a list of random integers and sort them in descending order.
// Write the code to display the sorted list.

package Lists;

import java.util.ArrayList;
import java.util.Collections;

public class Sortedlist {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(2);
        l1.add(31);
        l1.add(6);
        l1.add(17);
        System.out.println("Actuallist: " + l1);
        Collections.sort(l1, Collections.reverseOrder());
        //l1.sort((a, b) -> b - a); 
        System.out.println("Sorted list: " + l1);


    }
    
}
