
import java.util.*;
import java.util.stream.Collectors;

public class PositiveNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<Integer>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }
        System.out.println(positive(numbers));
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());
    }
    
}
