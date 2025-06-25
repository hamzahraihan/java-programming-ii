
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<Integer> inputs = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(Integer.valueOf(input));
        }
        double average = inputs.stream().mapToInt(value -> value).average().getAsDouble();
        System.out.println("average of the numbers: " + average);

    }
}
