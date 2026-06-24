import java.io.*;

public class SchoolResult {
    public static void main(String[] args) {

        try {
            BufferedWriter bw;
            try (BufferedReader br = new BufferedReader(
                    new FileReader("marks.txt"))) {
                bw = new BufferedWriter(
                        new FileWriter("report.txt", true));
                String line;
                int total = 0, count = 0;
                while((line = br.readLine()) != null) {
                    String[] data = line.split(" ");
                    total += Integer.parseInt(data[1]);
                    count++;
                    bw.write(line);
                    bw.newLine();
                }   bw.write("Average = " + (total/count));
                bw.newLine();
            }
            bw.close();

        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch(IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}