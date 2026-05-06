class MyThread extends Thread{
  public void run(){
     // sleep method in for loop
        try {
            for(int i=1;i<=5;i++){
                System.out.println(" Thread is ruuning " + i);
                Thread.sleep(1500);
                
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

  }
}

public class SleepMethod {
    public static void main(String[] args) {
        // sleep Method 
        // try{
        //     System.out.println("Program Started ");
        //     Thread.sleep(10000);
        //     System.out.println("Program Resumed After 10 Sec:");

        // }
        // catch(InterruptedException e){
        //      System.out.println(e.getMessage());
        // }
        
        MyThread t1=new MyThread();
        t1.start();
         MyThread t2=new MyThread();
        t2.start();

    }
}
