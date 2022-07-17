package manjay;
//import util pakage[all classes]

import java.util.*;
public class collection {

    public static void main(String[] args) {

        System.out.println("welcome to code java collection");
   /*
      creating collection
     1) Tpype safe- same type of obect are added to collection
     2)un Type safe- different type of element cab be added to collection
  */
       //Type safe collection

        ArrayList<String> names = new ArrayList<>();
        names.add("hemant");
        names.add("manjay");
        System.out.println(names);
      //  System.out.println(names.get(0)+"\n"+names.get(1));

        //un type safe
       /* LinkedList list = new LinkedList();

        list.add("sachin");
        list.add(123);
        list.add(625.5124);
        list.add(true);

        System.out.println(list);

        */
        names.remove("mukesh");
        System.out.println(names);
        System.out.println(names.size());
        //check item is there or not
        System.out.println(names.contains("manjay"));
        System.out.println(names.isEmpty());


        //setting value
        names.set(0,"ram");
        System.out.println(names);
        //Remove all elements
     //   names.clear();
       // System.out.println(names);
        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println("Vector"+vector);

        System.out.println("*______________________*______________________*");
        HashSet<Double> nmms = new HashSet<>();
        nmms.add(14.14);
        nmms.add(122.11);
        nmms.add(122.0);
        nmms.add(99.3);
        nmms.add(7.);
        System.out.println(nmms);
        //sorted hashset by using treeset//
        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nmms);
        System.out.println(tset);
     }
}
