class Table {
 
    void printTable(int n) {
 
        System.out.println(Thread.currentThread().getName() + " reached method");
 
        // Only this block is synchronized
        synchronized (this) {
 
            System.out.println(Thread.currentThread().getName() + " entered synchronized block");
 
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
 
                try {
                    Thread.sleep(500); // simulate delay
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
 
            System.out.println(Thread.currentThread().getName() + " exiting synchronized block\n");
        }
 
        // This part is NOT synchronized
        System.out.println(Thread.currentThread().getName() + " finished method\n");
       
    }
}
 
public class SynchronizedBlockExample {
    public static void main(String[] args) {
 
        Table obj = new Table(); // shared object
 
        Thread t1 = new Thread(() -> obj.printTable(2), "Thread-1");
        Thread t2 = new Thread(() -> obj.printTable(5), "Thread-2");
 
        t1.start();
        t2.start();
    }
}
 
 