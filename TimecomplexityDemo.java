public class TimecomplexityDemo {
    public static void main(String[] args) {

        double time = System.currentTimeMillis();
        TimecomplexityDemo demo = new TimecomplexityDemo();
        System.out.println(demo.findsum(9878555));

        System.out.println("Time taken"+" " + (System.currentTimeMillis() - time) + " millisec");

    }
    // public int findsum(int n){

    //   return  n*(n+1)/2;
    // }
    public int findsum(int n) {

        int sum = 0;
     for(int i=1;i<n;i++){

         sum= sum+i;
     }
     return sum;
    }


}
