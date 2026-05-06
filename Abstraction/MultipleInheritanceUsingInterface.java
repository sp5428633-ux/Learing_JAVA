                   interface  AccountOperation{
    void deposit(double amount);
}

interface loanOperation{
   void apply(double amount);
}

class SmartAccount implements AccountOperation,loanOperation{
    String holderName ;
    double balance;
    
    SmartAccount(String holderName ,double balance){
       this. holderName=holderName ;
        this. balance=balance;
    }
   void display(){
   System.out.println("Name is: "+ holderName );
}
    @Override
  public  void deposit(double amount){
         balance=amount+balance;
         System.out.println("Deposit Amount: " + amount + " New Updated Balance is: " + balance);
    }

     @Override
  public   void apply(double amount){
        balance=amount+balance;
        System.out.println("loan  Amount Deposite : " + amount + " New Updated Balance is: " + balance);
    }
}

public class MultipleInheritanceUsingInterface {
   public static void main(String[] args) {
        SmartAccount obj= new SmartAccount("raj",1000);
    obj.display();
    obj.deposit(5000);
    
    obj.apply(5000);
   
   }
    
}
