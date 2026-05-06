class SchTread extends Thread{
     public   void run(){
       for (int i=1;i<=5;i++){
        System.out.println(Thread.currentThread().getName() + " running ");
       }
    }
}

public class SchdulingEx {
    public static void main(String[] args) {
         SchTread s1=new SchTread();
        SchTread s2 =new SchTread();
// Scheduling
        // s1.setPriority(Thread.MAX_PRIORITY);
        // s2.setPriority(Thread.MIN_PRIORITY);

        // s1.start();
        // s2.start();




    }
}
