
class Employee{
    String name;
    double baseSalary;
    

    public double  calculateSalary(){
        return baseSalary;
    }

    public  void showDetails(){
        System.out.println("Employee " + name + ",salary : " + calculateSalary());
    }



}


class FullTimeEmployee extends Employee{
    double bonus;

    @Override
    public double  calculateSalary(){
        return baseSalary  + bonus ;
    }
    @Override
    public  void showDetails(){
        System.out.println(" Full Time Employee " + name + " ,salary: " + calculateSalary());
    }
}


class PartTimeEmployee extends Employee{
    int hourWorked;
    double hourlyRate;

    @Override
    public double  calculateSalary(){
        return hourWorked  * hourlyRate ;
    }
    @Override
    public  void showDetails(){
        System.out.println(" Part Time Employee " + name + " ,salary: " + calculateSalary());
    }
}


class TemporaryEmployee extends Employee{
    int dayWorked;
    double dailyRate;

    @Override
    public double  calculateSalary(){
        return dayWorked  * dailyRate ;
    }
    @Override
    public  void showDetails(){
        System.out.println(" Temporary  Employee " + name + " , salary: " + calculateSalary());
    }
}



public class MethodOverriding {
    public static void main(String[] args) {
      Employee emp1=new FullTimeEmployee();
      
      emp1.name="Raj";
      emp1.baseSalary=20000;
      ((FullTimeEmployee)emp1).bonus=5000;

     Employee emp2=new PartTimeEmployee();
     emp2.name="Shyam";
     ((PartTimeEmployee)emp2).hourWorked=100;
     ((PartTimeEmployee)emp2).hourlyRate=200;

     Employee emp3=new TemporaryEmployee();
     emp2.name="Gana";
     ((TemporaryEmployee)emp3).dayWorked=15;
     ((TemporaryEmployee)emp3).dailyRate=500;

    emp1.showDetails();
    emp2.showDetails();
    emp3.showDetails();


    }
}


// Employee emp;
// emp=new FullTimeEmployee();
// emp=new FullTimeEmployee()