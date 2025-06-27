
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            List<String> dataCSV = Files.readAllLines(Paths.get("literacy.csv"));

            dataCSV.sort((line1, line2) -> {
                String[] partsA = line1.split(",");
                String[] partsB = line2.split(",");

                double rateA = Double.valueOf(partsA[5].trim());
                double rateB = Double.valueOf(partsB[5].trim());

                return Double.compare(rateA, rateB);
            });

            dataCSV.stream()
                    .map(value -> value.split(","))
                    .map(value -> value[3].trim() + " (" + Integer.valueOf(value[4].trim()) + "), " + value[2].trim().replace(" (%)", "") + ", " + Double.valueOf(value[5].trim()))
                    .forEach(value -> System.out.println(value));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
