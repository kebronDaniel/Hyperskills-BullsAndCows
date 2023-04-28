package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        collectData();
    }

    private static void collectData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        String lengthInput = scanner.nextLine();
        int length = 0;
        try {
            length = Integer.parseInt(lengthInput);
            if (length == 0){
                try {
                    throw new RuntimeException();
                }catch (RuntimeException runtimeException){
                    System.out.println("Error: " + length +  " isn't a valid number.");
                    System.exit(0);
                }
            }
        }catch (NumberFormatException numberFormatException){
            System.out.println("error" + numberFormatException.getMessage());
            System.exit(0);
        }

        System.out.println("Input the number of possible symbols in the code:");
        int numberOfSymbols  = scanner.nextInt();
        if (numberOfSymbols > 36) {
            try {
                throw new RuntimeException();
            }catch (RuntimeException runtimeException){
                System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
                System.exit(0);
            }
        }
        if (length > numberOfSymbols){
            try {
                throw new RuntimeException();
            }catch (RuntimeException runtimeException){
                System.out.println("Error: it's not possible to generate a code with a length of " + length + " with " + numberOfSymbols +  " unique symbols.");
                System.exit(0);
            }
        }
        String randomNumber = randomNumberGenerator(length,numberOfSymbols);
        System.out.println(randomNumber);
        calculateScore(randomNumber,numberOfSymbols);
    }


    private static String randomNumberGenerator(int length, int numberOfSymbols){
//        String setOfNumbers = "0123456789";
//        String setOfChars = "abcdefghijklmnopqrstuvwxyz";
        String fullSet = "0123456789" + "abcdefghijklmnopqrstuvwxyz";
        StringBuilder generatedCode = new StringBuilder();
        String setOfWorkingChars = fullSet.substring(0,numberOfSymbols);
        int i = 0;
        int range = setOfWorkingChars.length();
        while ((i < length)){
            int rand = (int) (Math.random() * range);
            char ch = setOfWorkingChars.charAt(rand);
            if (generatedCode.indexOf(String.valueOf(ch)) == -1){
                generatedCode.append(ch);
                i++;
            }
        }
        return String.valueOf(generatedCode);
    }

    private static void calculateScore(String randomNumber, int numberOfSymbols){

        int range = randomNumber.length();
        String setOfChars = "abcdefghijklmnopqrstuvwxyz";

        String message="";
        String star = "";
        for (int i = 0; i<range; i++){
            star += "*";
        }
        if (numberOfSymbols <= 10){
            message = "The secret is prepared: "+star+" (0-" + (numberOfSymbols - 1) + ")";
        }
        else if (numberOfSymbols == 11){
            message ="The secret is prepared:"+star+" (0-9, a)";
        }
        else {
            char finalChar = setOfChars.charAt(numberOfSymbols - 11);
            message = "The secret is prepared:"+star+" (0-9, a - " +finalChar +")";
        }
        System.out.println(message);
        System.out.println("Okay, let's start a game!");
        int turns = 1;
        String originalNumber = randomNumber;
        Scanner scanner = new Scanner(System.in);
        while (true){
            int cows = 0;
            int bulls = 0;
            System.out.println("Turn "+turns + ":");
            String userGuess = scanner.nextLine();
            for (int i = 0; i < userGuess.length(); i++){
                if (randomNumber.charAt(i) == userGuess.charAt(i)){
                    bulls++;
                    randomNumber = randomNumber.replace(String.valueOf(randomNumber.charAt(i)), "-");
                } else if (randomNumber.contains(String.valueOf(userGuess.charAt(i)))) {
                    cows++;
                }
            }
            turns++;
            randomNumber = originalNumber;
            if (bulls == randomNumber.length()){
                System.out.println("Grade : " + bulls + " bulls");
                System.out.println("Congratulations! You guessed the secret code");
                break;
            }else {
                System.out.println("Grade: " + bulls + " bull and " + cows + " cow");
            }
        }
    }
}