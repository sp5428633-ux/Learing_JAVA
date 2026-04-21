
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

// derived class from Account base class
class CureentAccount extends  Account{

    double overDraftLimit ;

    void setoverDraftLimit (double  limit){
     overDraftLimit=limit;
     System.out.println("overDraft Limit is " + overDraftLimit);
    }

    void  withdraw(double  amount ){
        if(amount <= overDraftLimit + balance){
            System.out.println(" you can withdraw");
            balance -= amount;
            System.out.println("Your new Balance Is " + balance);

        }
        else{
            System.out.println("Insufficint Balance ");
        }

    }
}




public class HeirachicalInheratance {
    public static void main(String[] args) {
        CureentAccount currobj= new CureentAccount();
        currobj.balance=2000;
        currobj.setoverDraftLimit(2000);
        currobj.withdraw(4000);

    }
}



// // main class 
// public class SingleInhe {
//     public static void main(String[] args) {
//         SavingAccount obj =new SavingAccount();
//         obj.AHolderName="sagar";
//         obj.balance=1000;
//         obj.interestRate=5.0;
//         obj.deposit(500);
//         obj.ApplyInterest();

//     }
// }

