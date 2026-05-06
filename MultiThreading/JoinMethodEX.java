class Mythread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " Started ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {  
        }
     System.out.println(Thread.currentThread().getName() + " Finished ");

    }
}

public class JoinMethodEX {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Thread th1=new Thread(t1,"FCT Thread ");
     
         Mythread t2=new Mythread();
           try {
            th1.start();
            th1.join(); // wait for th1 to finish

            t2.start();
            t2.join(); // wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //  th1.start();
        //  th1.join();// wait for t1
        //  t2.start();
        //  t2.join();
         System.out.println("Main Completed");

    }
}
