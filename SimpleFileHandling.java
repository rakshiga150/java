import java.io.*;
public class SimpleFileHandling {
    public static void main(String[] args) {
        try {
            // 1. Write (create new file or overwrite existing file)
            FileWriter fw = new FileWriter("students.txt");
            fw.write("101, John, CSE\n");
            fw.write("102, Mary, ECE\n");
            fw.close();
            System.out.println("File created and data written.");

            // 2. Append (add more data to same file)
            FileWriter fa = new FileWriter("students.txt", true); // true = append
            fa.write("103, Alex, IT\n");
            fa.close();
            System.out.println("Data appended.");

            // 3. Read (display file contents)
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;
            System.out.println("\nReading Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}