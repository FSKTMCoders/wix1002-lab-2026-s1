import java.util.Random;
public class ThreeRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(10,51);
        int num2 = random.nextInt(10,51);
        int num3 = random.nextInt(10,51);
        int sum = num1 + num2 + num3;
        double average = (double)sum / 3.0;
        
        System.out.println("Three random numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Sum of the three random numbers: " + sum);
        System.out.printf("Average of the three random numbers: %.2f%n", average);
    }

}
