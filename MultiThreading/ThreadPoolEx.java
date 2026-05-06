import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

public void run(){
    System.out.println(
        Thread.currentThread().getName() + " Executing task "
    );
}
}


public class ThreadPoolEx {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=1;i<=10;i++){
            executor.execute(new Task());
        }

        executor.shutdown();
    }
}
