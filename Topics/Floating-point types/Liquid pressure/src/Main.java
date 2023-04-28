import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println(calculatePressure(density,height));
    }

    public static double calculatePressure(double density,double height){
        return density * height * 9.8;
    }
}