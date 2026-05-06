
import java.util.Hashtable;

public class HashTableEX {

    public static void main(String[] args) {

        Hashtable <Integer, String> table = new Hashtable <>();
        
        table.put(12,"java");
         table.put(13,"C#");
        table.put(1, "value");
         table.put(2,"PHP");
        System.out.println(table);

        System.out.println(table.containsKey(12));
       
    

    }
}
