package manjay;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class traverseExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("manjay1");
        names.add("manjay2");
        names.add("manjay3");
        names.add("manjay4");
        // for each loop
        for(String str:names)
        {
            System.out.print(str+"\t"+str.length()+"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("_____________________");


        //travesrsing using iterator: forward traversing
        Iterator<String> itr= names.iterator();

        while(itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("**************");
        //backward traversal
        ListIterator<String>  litr= names.listIterator(names.size());
        while(litr.hasPrevious()){
            String previous = litr.previous();
            System.out.println(previous);

        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        names.forEach(e->{
            System.out.println(e);

        });
        TreeSet<String> set = new TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });



    }
}
