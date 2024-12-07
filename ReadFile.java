import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;


public class ReadFile {

    public static String readFileContent(String filename) throws IOException {
        Path filePath = Path.of(filename);

        if (!Files.exists(filePath)) {
            throw new IOException("File not found: " + filename);
        }

        return Files.readString(filePath, StandardCharsets.UTF_8);
    }
    public static void createAndSaveFile(String filename, String content) throws IOException {
        File file = new File(filename);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        }
    }
}
