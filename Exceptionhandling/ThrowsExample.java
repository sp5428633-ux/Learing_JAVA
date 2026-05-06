
import java.io.FileReader;

public class ThrowsExample {

    public static void readFile() throws Exception{
    FileReader file = new FileReader("abc.txt");
    }
    public static void main(String[] args) throws Exception {
        readFile();
    }
}
