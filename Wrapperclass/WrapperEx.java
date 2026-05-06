public class WrapperEx {
 public static void main(String[] args) {
     int primitiveint=20;

     Integer wraperInt=Integer.valueOf(primitiveint); // Boxing

     System.out.println("Primitive Int:" + primitiveint );
     System.out.println("Wrapper Int:" + wraperInt );

     String num="123";
     int parseInt=Integer.parseInt(num); // unboxing
     System.out.println("Parsed int:" + parseInt);


     // Exception : NumberFormatException
    //  String num="ABC";
    //  int parseInt=Integer.parseInt(num); // unboxing
    //  System.out.println("Parsed int:" + parseInt);

    Integer a=100;
    Integer b=100;

    System.out.println("a==b : " + (a==b));//true ,because integer caching
    System.out.println("a.equals(b): " + a.equals(b));
    
 }
}
