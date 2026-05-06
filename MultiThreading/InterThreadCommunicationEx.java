class Customer{
    int amount =10000;
    synchronized void withdraw(int amount ){
     System.out.println("going to withdraw");
     
     if(this.amount < amount){
        System.out.println("Less Balance: waiting for deposit:");
        try {
            wait();// release lock and wait
        } catch (Exception e) {
        }
     }

     this.amount -=amount;
     System.out.println("Withdraw Completed ");

    }
    synchronized void deposit(int amount) {
        System.out.println("Going to deposit");

        this.amount += amount; // add money
        System.out.println("Deposit Completed");

        notify(); // wake up waiting thread
    }
    
}

public class InterThreadCommunicationEx {
    public static void main(String[] args) {
        Customer c=new Customer();
        new Thread (){
            public void run(){
                c.withdraw(15000);
            }
        }.start();

        new Thread (){
            public void run(){
                c.deposit(10000);
            }
        }.start();
    }
}
