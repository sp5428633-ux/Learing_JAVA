
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("demo.txt");
            String msg="hello!, this file handling using fileoutputstream";
            
            byte[] data= msg.getBytes();

            fos.write(data);
            fos.close();
            /*
            why use close() method
            1.data may not fuully written.
            2.resource leak can happen
            3.file corruption can happen 
            4.file may not stay locked for some system 
             */
        //    String text="\n this line appemded";
        //    fos.write(text.getBytes());
        //    fos.close();
        //    sout


          System.out.println(" file written successfully");

        } catch (IOException e) {
            System.out.println("IOException handled" + e.getMessage());
        }
    }
}
