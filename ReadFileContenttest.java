import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.io.IOException;
import org.junit.Test;

public class ReadFileContenttest {
    @Test
     public void testReadFileContent() throws IOException {
        String filename = "testfile.txt";
        String content = "Chrome Heart";

        FileUtility.createAndSaveFile(filename, content);

        String actualContent = FileUtility.readFileContent(filename);

        assertEquals(content, actualContent, "The file content should match the written content");

        File file = new File(filename);
        assertTrue(file.delete(), "File should be deleted after the test");
    }
}

