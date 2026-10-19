import java.util.Scanner;
public class CarLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the car: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the down payment: ");
        double downPayment = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the loan duration (in years): ");
        int loanDuration = scanner.nextInt();
        double monthlyPayment = (price - downPayment) * (1+interestRate * loanDuration / 100) / (loanDuration * 12);
        System.out.printf("The monthly payment is: %.2f%n", monthlyPayment);
        scanner.close();
    }
}
