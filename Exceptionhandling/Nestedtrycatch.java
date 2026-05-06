
public class Nestedtrycatch {

    public static void main(String[] args) {
        //outer try block
        try {
            int arr[] = {10, 20, 30};

            System.out.println(arr[3]);

            try {

                int a = 10;
                int b = 0;
                int result = a / b;
                System.out.println(result);

            } catch (Exception e) {
                System.out.println("Inner catch block:  cannot divide by Zero " + e.getMessage());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch Block: Array Index Problem");
        } finally {
            System.out.println("program continues...");
        }

    }
}
