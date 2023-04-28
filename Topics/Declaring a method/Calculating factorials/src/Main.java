import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long result = 1;
        if (n == 0){
            return result;
        }
        else {
            for (long i = n; i > 0 ; i--){
                result = result * i;
            }
            long result1 = result;
            return result1;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}