//base class
class Account{

    String AHolderName;
    double balance;

    void deposit(double amount){
        balance += amount;
      System.out.println("Amount Added: "+ amount + "  New Balance is "+ balance);
    }
}

// derived class 
class SavingAccount extends Account{
   double interestRate;

   void ApplyInterest(){
    double interest = balance * interestRate /100;

    balance += interest;
    System.out.println("Balance after Interest: " + balance);
   }
}





// main class 
public class SingleInhe {
    public static void main(String[] args) {
        SavingAccount obj =new SavingAccount();
        obj.AHolderName="sagar";
        obj.balance=1000;
        obj.interestRate=5.0;
        obj.deposit(500);
        obj.ApplyInterest();

    }
}
