
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double total = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                total += number;
                count++;
            }
        }

        if (count <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(total / count);
        }
    }
}
