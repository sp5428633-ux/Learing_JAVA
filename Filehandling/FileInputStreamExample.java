
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream file= new FileInputStream("demo.txt");
            // FileInputStream filter=new FileInputStream(file);
            int data;

            while ((data = file.read()) != -1) { 
                System.out.println((char) data);
            }
            file.close();
        }
        catch (IOException e){
           e.printStackTrace();

        }
    }
}
