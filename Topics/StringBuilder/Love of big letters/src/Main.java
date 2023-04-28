import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        // write your code here
        StringBuilder stringBuilder = new StringBuilder(message);
        for (int i = 0; i < stringBuilder.length(); i++){
            if (i % 2 == 0){
                char ch = stringBuilder.charAt(i);
                char upperch = Character.toUpperCase(ch);
                stringBuilder.setCharAt(i,upperch);
            }
        }
        return String.valueOf(stringBuilder);
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}