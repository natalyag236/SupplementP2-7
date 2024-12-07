import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class AppendFileTest {

    @Test
    public void testAppendToFile() throws IOException {
        String filename = "testfile.txt";
        String initialContent = "Summer Walker";
        String appendContent = " Appended text.";

        AppendFile.createAndSaveFile(filename, initialContent);

        AppendFile.appendToFile(filename, appendContent);

        String actualContent = ReadFile.readFileContent(filename);

        assertEquals(initialContent + appendContent, actualContent, "The file content should match the initial content followed by the appended content.");

        File file = new File(filename);

        assertTrue(file.delete(), "File should be deleted after the test");
    }
}
