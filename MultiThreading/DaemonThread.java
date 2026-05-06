class Mythread extends Thread{
    public void run(){
     if(Thread.currentThread().isDaemon()){
        System.out.println("Daemon Thread is Running: ");
     }
     else {
        System.out.println("User Thread Is Running:");
     }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Mythread t2 =new Mythread();
        
        t1.setDaemon(true);// making thread daemon
        t1.start();
        t2.start();

    }
}
