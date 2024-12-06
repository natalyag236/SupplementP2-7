import java.io.*;

public class FileUtility{
    public static File createandSaveFile(String filename, String content) throws IOException{
        File file = new File(filename);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
           writer.write(content);
        }
        return file;
    }
}
