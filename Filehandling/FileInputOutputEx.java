
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputEx {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("text.txt");

            String msg = "New file Created using fileOutputSream:";

            byte[] sdata = msg.getBytes();
            fos.write(sdata);
            fos.close();
            System.out.println("file written successfully");

// data reading using fileinputstream
            FileInputStream file = new FileInputStream("text.txt");
            int data;

            while ((data = file.read()) != -1) {
                System.out.println((char) data);
            }
            file.close();

        } catch (Exception e) {
            System.out.println("Exception handled" + e.getMessage());
        }

    }
}
