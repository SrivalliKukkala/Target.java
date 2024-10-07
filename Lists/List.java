package Lists;
//List
//Create a list of five integers and demonstrate how to append, insert, and remove an element from it

import java.util.*;
public class List{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //APPEND
        list.add(6);
        System.out.println("Newlist : "+list);

        //insert element 10 at index3
        list.add(3,10);
        System.out.println("Insert list :"+list);

        //remove
        list.remove(1);
        System.out.println("Remove list :"+list);

        System.out.println("Final list :"+list);

        
    }
}
