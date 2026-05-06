import java.util.*;

public class ArrayListAllMethodsDemo {
    public static void main(String[] args) {

        // 1. Create ArrayList
        // Dynamic array, size can grow automatically
        ArrayList<String> list = new ArrayList<>();

        // 2. add()
        // Adds element at the end of the list
        list.add("Java");
        list.add("C#");
        list.add("Python");

        // 3. add(index, element)
        // Inserts element at specific index, shifts existing elements
        list.add(1, "C++");

        System.out.println("After add: " + list);

        // // 4. get()
        // // Retrieves element at given index (0-based index)
        // System.out.println("Element at index 2: " + list.get(2));

        // // 5. set()
        // // Updates element at specific index (replace value)
        // list.set(2, "DotNet");
        // System.out.println("After set: " + list);

        // // 6. remove(index)
        // // Removes element at index and shifts remaining elements
        // list.remove(1);

        // // 7. remove(object)
        // // Removes first occurrence of given value
        // list.remove("Python");

        // System.out.println("After remove: " + list);

        // 8. size()
        // Returns number of elements in list
        System.out.println("Size: " + list.size());

        // // 9. contains()
        // // Checks if element exists in list (returns true/false)
        // // System.out.println("Contains Java? " + list.contains("Javaa"));

        // // 10. isEmpty()
        // // Checks whether list is empty
        // System.out.println("Is Empty? " + list.isEmpty());
        // ArrayList<Integer> testL = new ArrayList<>();
        // System.out.println(testL.isEmpty());

        // 11. indexOf()
        // Returns first index of element, -1 if not found
        System.out.println("Index of Java: " + list.indexOf("Javaa"));

        // // 12. lastIndexOf()
        // // Returns last occurrence index of element
        // list.add("Java");
        // list.add("C# DOTNET");
        // list.add("Java");
        // System.out.println("Last Index of Java: " + list.lastIndexOf("Java"));
        // System.out.println("Last Index of Java: " + list.indexOf("Java"));

        // 13. addAll()
        // Adds all elements from another collection
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Go");
        list2.add("Rust");

        list.addAll(list2);
        System.out.println("After addAll: " + list);

        // // 14. removeAll()
        // // Removes all elements that exist in another collection
        // list.removeAll(list2);
        // System.out.println("After removeAll: " + list);

        // 15. retainAll()
        // Keeps only common elements, removes others
        // ArrayList<String> list3 = new ArrayList<>();
        // list3.add("Java");

        // list.retainAll(list3);
        // System.out.println("After retainAll: " + list);

        // // 16. toArray()
        // // Converts ArrayList to normal array
        // Object[] arr = list.toArray();
        // System.out.println("Array: " + Arrays.toString(arr));

        // // 17. clear()
        // // Removes all elements from list
        // // list.clear();
        // System.out.println("After clear: " + list);

        // 18. isEmpty() after clear
        // Now list should be empty
        System.out.println("Is Empty now? " + list.isEmpty());

        // 19. Sorting (using Collections class)
        // Sorts elements in ascending order
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        System.out.println("Sorted numbers: " + numbers);// 50- 10 30

        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);// 10 30 50
        // 20. Looping
        // Iterating through list using for-each loop
        System.out.println("Looping elements:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

       
    }
}
// add(end) - O(1)
// add(in middle) - O(n)

// get - O(1)
// remove - O(n) (shifting elements)

// list 10
// old * 1.5 = new size 15
// old * 1.5 = new size 22
// old * 1.5 = new size 33