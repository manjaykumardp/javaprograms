package manjay;

import java.security.Key;
import java.time.temporal.ValueRange;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

        HashMap<String,Integer> courses = new HashMap<>();
        courses.put("java",1000);
        courses.put("python",2000);
        courses.put("Spring",1200);
        courses.put("android",3000);
        System.out.println(courses);
        courses.forEach((e1,e2)->{
            System.out.println(e1+"=>"+e2);
        });

        System.out.println("_____________________");
        courses.forEach((Key, Value)->{
            System.out.println(Key + " => "+Value);

            System.out.println();
        });
        System.out.println("price of java = "+courses.get("java"));
    }
}
