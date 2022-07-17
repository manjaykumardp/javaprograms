import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
     ArrayList<Integer> List = new ArrayList<>();

     List.add(0);
     List.add(1);
     List.add(2);
        System.out.println(List);

            int element = List.get(1);
        System.out.println(element);
        //add new element in arraylist any where
        List.add(3,10);
        System.out.println(List);
        //change the element
        List.set(0,10);
        System.out.println(List);
        //delete element from list
        List.remove(3);
        System.out.println(List);
        //find size of arraylist

        int size = List.size();
        System.out.println(size);
        // loop to get element in arraylist
        for(int i=0;i< List.size();i++){
            System.out.println(List.get(i));
 //sorting of element
            Collections.sort(List);
            System.out.println(List);
        }
    }
}
