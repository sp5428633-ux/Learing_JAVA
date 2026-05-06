class MyThread extends Thread{
  public   void run(){
        System.out.println("Multi thrading is running:");
        System.out.println(Thread.currentThread().getName());
    }

   
}

class MyThread2 extends Thread{
  public   void run(){
       for (int i=1;i<=5;i++){
        System.out.println("Task One:" + i);
       }
    }

   
}
class MyThread3 extends Thread{
  public   void run(){
       for (int i=1;i<=5;i++){
        System.out.println("Task  Two :" + i);
       }
    }

   
}



public class MultiThreadingEX  {
    public static void main(String[] args) {
         Thread obj=new MyThread();

        //  obj.start();

        // Thread  t2=new Thread("FCT Thread");
        // t2.start();
        //  System.out.println(t2.getName());
        
        // MyThread t3=new MyThread();
        // t3.setName("3rd Thread ");
        // t3.start();

        // MyThread2 td1=new MyThread2();
        // MyThread3 td2=new MyThread3();
        //  td1.start();
        // td2.start();

       
        

    }
}
