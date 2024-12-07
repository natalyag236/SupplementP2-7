import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;


public class AppendFile {

    /**
     * Reads the content of a file and returns it as a string.
     *
     * @param filename the name of the file to be read
     * @return the content of the file as a string
     * @throws IOException if an I/O error occurs or the file does not exist
     */
    public static String readFileContent(String filename) throws IOException {
        Path filePath = Path.of(filename);

        if (!Files.exists(filePath)) {
            throw new IOException("File not found: " + filename);
        }

        return Files.readString(filePath, StandardCharsets.UTF_8);
    }

    /**
     * Creates and saves a file with the given content. If the file already exists, it overwrites the content.
     *
     * @param filename the name of the file to be created
     * @param content  the content to be written to the file
     * @throws IOException if an I/O error occurs
     */
    public static void createAndSaveFile(String filename, String content) throws IOException {
        Path filePath = Path.of(filename);

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        Files.writeString(filePath, content, StandardCharsets.UTF_8);
    }

    /**
     * Appends the given content to an existing file. If the file does not exist, throws an IOException.
     *
     * @param filename the name of the file to append to
     * @param content  the content to append to the file
     * @throws IOException if an I/O error occurs or the file does not exist
     */
    public static void appendToFile(String filename, String content) throws IOException {
        Path filePath = Path.of(filename);

        if (!Files.exists(filePath)) {
            throw new IOException("File does not exist: " + filename);
        }

        Files.write(filePath, content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
    }
}
