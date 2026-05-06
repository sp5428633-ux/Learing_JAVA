import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        
        HashSet <String> list = new HashSet<>();

        list.add("Java");// creating hashset object
        list.add("python");
        list.add("C#");
        list.add("C#");

        System.out.println(list);

        // iterator 
        Iterator<String> it = list.iterator();
          while(it.hasNext()){
            System.out.println(it.next());
          }

          // hash Code
          System.out.println("hashCode of clonedset: " + list.hashCode());

          

    }
}
