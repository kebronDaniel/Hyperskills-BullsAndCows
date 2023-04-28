import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {

    public static Double divide(long a, long b) {
        if (b != 0){
            Double result = (double) a/ b;
            return result;
        }
        return Double.parseDouble(null);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}