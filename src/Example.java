import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zuich on 08.02.2017.
 */
public class Example {
    public static void main(String[] args) throws IOException {
        String s = getString();
        System.out.println(s);
    }

    public static String getString() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }
}
