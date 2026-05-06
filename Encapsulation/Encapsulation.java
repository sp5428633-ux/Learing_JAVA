

class BankAccount{
    private double balanace;
    private String acHolderName;

    BankAccount(double balanace,String acHolderName){
           this.balanace=balanace;
           this. acHolderName= acHolderName;
    }

    public double getBalance(){
        return balanace;
    }

    public String getAcHolder(){
        return acHolderName;
    }

    public void withdrown(double amount){
      if(amount > 0 && amount <= balanace){
         balanace-=amount;
         System.out.println("Amount Withdrown " + amount + " New Balance IS " + balanace);
       }
       else{
        System.out.println("Enter sufficient amount to withdrown");
       }

    }

     public void doposit(double amount){
       if(amount > 0){
         balanace+=amount;
         System.out.println("Amount deposited " + amount + "  New Balance IS " + balanace);
       }
       else{
        System.out.println("Enter sufficient amount");
       }

    }
}



public class Encapsulation {
    public static void main(String[] args) {

       BankAccount obj=new BankAccount(1000, "raja");
    System.out.println("Account Holder name is " + obj.getAcHolder()); 
    System.out.println("Current Balance is:" + obj.getBalance());
    //    obj.doposit(100);
    obj.withdrown(1000);
    

    }
}
