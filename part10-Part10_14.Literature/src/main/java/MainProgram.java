
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            String age = scanner.nextLine();

            books.add(new Book(title, Integer.valueOf(age)));

        }

        System.out.println(books.size() + " books in total.");

        System.out.println("Books:");
        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        books.stream().forEach(value -> System.out.println(value));
    }

}
