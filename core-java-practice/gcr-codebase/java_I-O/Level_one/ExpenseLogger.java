import java.io.*;
import java.util.*;

public class ExpenseLogger {

    public static void main(String[] args)
            throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            String item = sc.nextLine();
            int amount = sc.nextInt();

            try (FileWriter fw = new FileWriter(
                    "expenses.txt", true)) {
                fw.write(item + " - " + amount + "\n");
            }
        }

        System.out.println("Saved");
    }
}