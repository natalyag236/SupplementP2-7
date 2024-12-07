import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class AppendFile {
    public static String readFileContent(String filename) throws IOException {
        Path filePath = Path.of(filename);

        if (!Files.exists(filePath)) {
            throw new IOException("File not found: " + filename);
        }

        return Files.readString(filePath, StandardCharsets.UTF_8);
    }
    public static void createAndSaveFile(String filename, String content) throws IOException {
        Path filePath = Path.of(filename);

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        Files.writeString(filePath, content, StandardCharsets.UTF_8);
    }
    public static void appendToFile(String filename, String content) throws IOException {
        Path filePath = Path.of(filename);

        if (!Files.exists(filePath)) {
            throw new IOException("File does not exist: " + filename);
        }

        Files.write(filePath, content.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
    }
}
