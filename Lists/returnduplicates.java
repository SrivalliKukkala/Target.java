//Write a function that takes a list as input and returns a list of duplicate elements.
package Lists;
import java.util.ArrayList;
import java.util.List;

public class  returnduplicates{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("peaches");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("grapes");

        System.out.println("fruits " +fruits);
        
    }

    
}