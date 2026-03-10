
import java.util.function.Function;

public class Prog1 {
    public static void main(String[] args) {
        System.out.println("Hello, world john!");

        for (int i = 0; i < 10; i++) {
           System.out.println( "output: " + i + " " + sum(i) );
        }
    }

    static int sum(int x){
        return x + 1;
    }
}