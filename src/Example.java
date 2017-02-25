/**
 * Created by zuich on 08.02.2017.
 */
public class Example {
    public static void main(String[] args){


        String s1 = "A";
        String s2 = "C";
        String s3 = "D";
        int n = s2.compareTo(s1); // на сколько s2 опережает s1
        System.out.println(n);
        System.out.println(s3.compareTo(s2)); // на сколько s3 опережает s1
    }
}
