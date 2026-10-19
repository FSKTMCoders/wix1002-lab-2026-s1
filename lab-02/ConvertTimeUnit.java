import java.util.Scanner;
public class ConvertTimeUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int seconds = scanner.nextInt();
        
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = seconds % 60;
        
        System.out.println(seconds + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + second + " seconds.");
        
        scanner.close();
    }
}
