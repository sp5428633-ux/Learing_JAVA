class Calculator{

    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }

    double add(double  a,double  b){
        return a+b;
    }
} 

class propertyTax{

    double CalcTax(double areaInsqreFoot){

           return areaInsqreFoot*10;
    }

    double CalcTax(int propertyvalue){
        
        return propertyvalue * 0.05;
    }

    double CalcTax(double areaInsqreFoot,double retepersqFoot){

           return areaInsqreFoot * retepersqFoot;
    }


     double CalcTax(double propertyvalue, int serviceCharge){
        
        return (propertyvalue * 0.05) + serviceCharge;
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
       Calculator c1=new Calculator();
       
       System.out.println(c1.add(2,2));
       System.out.println(c1.add(2,2,1));
       System.out.println( c1.add(2.5,2));
    

       propertyTax p1=new propertyTax();

       System.out.println(p1.CalcTax(400.0));
       System.out.println(p1.CalcTax(40000));
       System.out.println(p1.CalcTax(400,200.0));
       System.out.println(p1.CalcTax(40000,100));
    }

}
