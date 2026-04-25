
import java.util.Scanner;

  interface  Payment{
    

     void PaymaentProcess(double amount);

      void GeneretRecept();
}

 class CreditCard implements  Payment{
    private  final String CardNumber;
   
    CreditCard(String CardNumber){
       this.CardNumber=CardNumber;
    }
    @Override
   public  void PaymaentProcess(double amount){
      System.out.println("Payment Processing for Card: " + CardNumber );
    }
    @Override
   public  void GeneretRecept(){
     System.out.println("Recept Genereated for card: " + CardNumber);
    }
}

class UpiPayment implements  Payment{
    private  final String UpiID;
   
    UpiPayment(String UpiID){
       this.UpiID=UpiID;
    }
    @Override
   public  void PaymaentProcess(double amount){
      System.out.println("Payment Processing for UPI ID: " + UpiID );
    }
    @Override
   public  void GeneretRecept(){
     System.out.println("Recept Genereated for UPI ID : " + UpiID);
    }
}

class NetBankingPayment implements  Payment{
    private  final String UserID;
   
    NetBankingPayment(String UserID){
       this.UserID=UserID;
    }
    @Override
   public  void PaymaentProcess(double amount){
      System.out.println("Payment Processing for USER ID: " + UserID );
    }
    @Override
   public  void GeneretRecept(){
     System.out.println("Recept Genereated for USER ID : " + UserID);
    }
}

class PaymentService{
  
    private final Payment payment;

    PaymentService(Payment payment){
        this.payment=payment;
    }

   public  void executePayment(double amount){
   payment.PaymaentProcess(amount);
   payment.GeneretRecept();
   }
}



public class PayGatewayUsingIterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method: 1. Credit Card  2. UPI  3. Net Banking");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 

        Payment payment;

        switch (choice) {
            case 1:
                System.out.print("Enter Credit Card Number: ");
                String CardNumber = sc.nextLine();
                payment = new CreditCard(CardNumber);
                break;

            case 2:
                System.out.print("Enter UPI ID: ");
                String UpiId = sc.nextLine();
                payment = new UpiPayment(UpiId);
                break;

            case 3:
                System.out.print("Enter Net Banking User ID: ");
                String UserId = sc.nextLine();
                payment = new NetBankingPayment(UserId);
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return; // Exit safely
        }

        PaymentService service = new PaymentService(payment);
        service.executePayment(amount);

        sc.close();



    }
}



        