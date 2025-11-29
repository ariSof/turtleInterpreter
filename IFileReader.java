import java.util.ArrayList;

public interface IFileReader {
    void setFileName(String fileName);
    ArrayList<String> readFile();
}
