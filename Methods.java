


public class Methods {
     // method without return type 
    public   void greet (){
      System.out.println("Good Mornning");
     }

     // method with parameter and  return type 
     public int add(int a,int b){
        return a+b;
     }

     // static method 
     public static  void msg (){
      System.out.println("Hello");
     }

     // recursion 
     public  void recur(int n){
        if(n > 0) {
           
            System.out.println(n);
             recur(n-1);
            
        }
    }
    public  void recurSO(int n){
        if(n > 0) {
            recurSO(n-1);
            System.out.println(n);
            
        }
     }
 
     // recurtion to print factorial
     public int fact(int n){
       if(n == 0) return 1;

       int result=n * fact(n-1);
        return result;
        
     }
        



 public static void main(String[] args) {
    
    Methods obj=new Methods();
    obj.greet();
    msg();
     System.out.println(obj.add(10,30));
     System.out.println(" example of Recursion");
     obj.recur(5);
     System.out.println(" Stack overflow condition");
     obj.recurSO(5);
     System.out.println(obj.fact(5));

 }   
}
