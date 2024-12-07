import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;


public class ReadFile {
    /**
     * Reads the content of a file and returns it as a string.
     * 
     * @param filename The name of the file to read.
     * @return The content of the file as a string.
     * @throws IOException If an I/O error occurs, such as the file not being found.
     */
    public static String readFileContent(String filename) throws IOException {
        Path filePath = Path.of(filename);

        if (!Files.exists(filePath)) {
            throw new IOException("File not found: " + filename);
        }

        return Files.readString(filePath, StandardCharsets.UTF_8);
    }
    /**
     * Creates a new file or overwrites an existing file with the given content.
     * 
     * @param filename The name of the file to create or overwrite.
     * @param content The content to write to the file.
     * @throws IOException If an I/O error occurs during file creation or writing.
     */
    public static void createAndSaveFile(String filename, String content) throws IOException {
        File file = new File(filename);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        }
    }
}
