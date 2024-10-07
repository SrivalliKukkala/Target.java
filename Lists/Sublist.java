package Lists;
//Given the list numbers = [10, 20, 30, 40, 50],
// write a code snippet to extract the sublist containing the second and third elements.
import java.util.ArrayList;
import java.util.List;

public class Sublist {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        // Create list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        
        List<Integer> sublist = list.subList(1, 2); 
        System.out.println("Sublist : " + sublist);
    }
}
