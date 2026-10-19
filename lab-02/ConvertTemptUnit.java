import java.util.Scanner;
public class ConvertTemptUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", fahrenheit, celsius);
        scanner.close();
    }
    
}
