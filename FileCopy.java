import java.io.*;
public class FileCopy {
    public static void main(String[] args) {
        String inputFilePath = "D:\\507\\text1.txt"; // Source file
        String outputFilePath = "D:\\507\\text2.txt"; // Destination file

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            System.out.println("Contents of the input file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line); 
                writer.write(line);
                writer.newLine(); 
            }
            System.out.println("\nFile copied successfully to: " + outputFilePath);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}



