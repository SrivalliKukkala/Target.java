//Given a list of strings fruits = ['apple', 'banana', 'cherry'], 
//use a list comprehension to create a new list that contains the lengths of each string.

package Lists;

import java.util.ArrayList;
import java.util.List;


public class newlist {
    public static void main(String[] args) {
        // Given list of fruits
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println("fruits ="+fruits);

        List<Integer> length = new ArrayList<Integer>();

/*Iterating Through the List:
A for loop is used to iterate over the indices of the fruits list. 
The get(i) method retrieves each fruit, and length() is called to get its length,
 which is then added to the lengths list.*/

 for (int i = 0; i < fruits.size(); i++) {
    length.add(fruits.get(i).length());
 }
        System.out.println(length);
    }
}

//Method 2
//Can use streams(Map)
