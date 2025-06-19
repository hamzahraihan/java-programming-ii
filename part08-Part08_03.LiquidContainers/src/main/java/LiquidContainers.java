
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("> ");
            System.out.println("first: " + first + "/100");
            System.out.println("second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
            if (value < 0) {
                continue;
            }
            if (command.equals("add")) {
                int valueToAdd = Math.min(first + value, 100);
                first = valueToAdd;
            }
            if (command.equals("move")) {
                int valueToMove = Math.min(value, first);
                first -= valueToMove;
                second = Math.min(second + valueToMove, 100);
            }

            if (command.equals("remove")) {
                int valueToRemove = Math.min(value, second);
                second -= valueToRemove;
            }
        }

    }

}
