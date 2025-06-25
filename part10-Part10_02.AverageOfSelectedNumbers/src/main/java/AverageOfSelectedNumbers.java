
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> inputs = new ArrayList<Integer>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(Integer.valueOf(input));
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String pickPositiveOrNegative = scanner.nextLine();
        double result = 0.0;
        if (pickPositiveOrNegative.equals("p")) {
            result = inputs.stream().mapToInt(value -> value).filter(value -> value > 0).average().getAsDouble();
        } else {
            result = inputs.stream().mapToInt(value -> value).filter(value -> value < 0).average().getAsDouble();
        }
        System.out.println(result);
    }
}
