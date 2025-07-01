
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomize = new Random();
        System.out.println("How many random numbers should be printed?");
        int howMany = scanner.nextInt();
        for (int i = 0; i < howMany; i++) {
            int randomNumber = randomize.nextInt(11);
            System.out.println(randomNumber);
        }
    }

}
