import java.util.Random;

public class OneRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10001);
        System.out.println("Random number: " + num);
        int digit = 0;
        int total = 0;
        while (num > 0) {
            digit = num % 10;
            total += digit;
            num /= 10;
        }       
        System.out.println("Sum of digits: " + total);
    }
}
