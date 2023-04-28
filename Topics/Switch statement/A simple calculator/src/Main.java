import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int index = 0;
        char operation  = input.charAt(index);
        if (input.contains("+")){
            index = input.indexOf('+');
            operation  = input.charAt(index);
        }else if (input.contains("-")){
            index = input.indexOf('-');
            operation  = input.charAt(index);
        } else if (input.contains("*")) {
            index = input.indexOf('*');
            operation  = input.charAt(index);
        } else if (input.contains("/")) {
            index = input.indexOf('/');
            operation  = input.charAt(index);
        }else {
            System.out.println("Unknown operator");
        }
        if (index != 0) {
            Long firstOperand = Long.parseLong(input.substring(0, index - 1));
            Long secondOperand = Long.parseLong(input.substring(index + 2, input.length()));
            switch (operation){
                case '+':
                    System.out.println(firstOperand + secondOperand);
                    break;
                case '-':
                    System.out.println(firstOperand - secondOperand);
                    break;
                case '*':
                    System.out.println(firstOperand * secondOperand);
                    break;
                case '/':
                    if (secondOperand == 0L){
                        System.out.println("Division by 0!");
                        break;
                    }
                    else {
                        System.out.println(firstOperand/secondOperand);
                        break;
                    }
                default:
                    System.out.println("Unknown operator");
            }
        }
    }
}