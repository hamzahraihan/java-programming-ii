
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (true) {
            String input = scanner.nextLine();
            if (input.contains("-1")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }
        numbers.stream()
                .map(value -> value)
                .filter(value -> value >= 1 && value <= 5)
                .forEach(value -> System.out.println(value));
    }
}
