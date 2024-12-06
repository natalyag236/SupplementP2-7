import java.io.*;

public class FileUtility{
     /**
     * Creates a file with the specified name, writes the provided content to it, and saves it.
     *
     * @param filename the name of the file to create (including path if needed)
     * @param content  the content to write into the file
     * @return the created File object
     * @throws IOException if an I/O error occurs during file creation or writing
     */
    public static File createandSaveFile(String filename, String content) throws IOException{
        File file = new File(filename);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
           writer.write(content);
        }
        return file;
    }
}
