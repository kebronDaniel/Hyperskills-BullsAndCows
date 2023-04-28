import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println(calculateArea(a,b,c));
    }

    public static double calculateArea(double a , double b, double c){
        double perimeter = (a + b + c) / 2;
        double area = Math.sqrt((perimeter) * (perimeter - a) * (perimeter - b) * (perimeter -c));
        return area;
    }
}