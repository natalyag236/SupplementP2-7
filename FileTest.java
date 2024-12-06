import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Files;
import org.junit.Test;

public class FileTest {

    @Test
    public void testCreateandSaveFile() throws IOException {
        String filename = "testfile.txt";
        String content = " Christmas time";

        File file = FileUtility.createandSaveFile(filename, content);

        assertTrue(file.exists(),"File should exits after creation");

        String actualContent = Files.readString(Path.of(filename));
        assertEquals(content, actualContent, " File content should match the input content");

        assertTrue(file.delete(),"File should be deleted after the test");
    }
        
    
}