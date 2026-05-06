class Resource {
    void method1(Resource r2) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked Resource 1");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            synchronized (r2) {
                System.out.println(Thread.currentThread().getName() + " locked Resource 2");
            }
        }
    }
 
    void method2(Resource r1) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked Resource 2");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            synchronized (r1) {
                System.out.println(Thread.currentThread().getName() + " locked Resource 1");
            }
        }
    }
}
 
public class DeadlockExample {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();
        Thread t1 = new Thread(() -> r1.method1(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.method2(r1), "Thread-2");
        t1.start();
        t2.start();
    }
}
 
// Thread A   waiting for Thread B to release Resource
// Thread B   waiting for Thread A to release Resource
 
 
 