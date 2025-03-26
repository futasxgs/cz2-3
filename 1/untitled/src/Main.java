import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj mi stopnie w fahrenheitach: ");
        double fr = sc.nextDouble();
        double result = (fr-32)*5/9;
        System.out.println("celsiush: " + result);
    }
}