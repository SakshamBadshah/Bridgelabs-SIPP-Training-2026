import java.io.*;

public class BillReader {

    public static void main(String[] args)
            throws Exception {

        try (BufferedReader br = new BufferedReader(
                new FileReader("bill.txt"))) {
            String line;
            int count = 0;
            
            while((line = br.readLine()) != null) {
                
                System.out.println(line);
                count++;
            }
            
            System.out.println(
                    "Total Lines = " + count);
        }
    }
}