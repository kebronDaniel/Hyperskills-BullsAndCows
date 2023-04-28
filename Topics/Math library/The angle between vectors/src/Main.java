import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double vectorProduct = Math.sqrt((a * a) + (b * b));
        double vectorProductTwo = Math.sqrt((c * c) + (d * d));

        double scalarProduct = (a * c) + (b * d);
        double angle = Math.round(Math.toDegrees(Math.acos(scalarProduct / (vectorProduct * vectorProductTwo))));
        System.out.println(angle);
    }
}