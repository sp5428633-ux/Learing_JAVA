
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("java");
        list.add("python");
        list.add(".net");
        // System.out.println(list.size());

        list.addFirst("first");
        list.addLast("last");
        
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
// set ele on specified position
        list.set(2, "C#");

        list.remove(2);

        list.contains("java");
        System.out.println(list);
// 2nd list
         LinkedList<String> list2=new LinkedList<>();

         list2.add("go");
         list2.add("rust");
// copy all elements 
         list.addAll(list2);
         System.out.println(list);
         System.out.println(list2);
// remove all elements of  coped specifed list 
         list.removeAll(list2);
         System.out.println(list);

      list.add("java");
      System.out.println("RetianAll" + list);
    }
}
