
class Employee{

    String name;
    double salary;

    Employee(String name ,double salary){
      this.name=name;
      this.salary=salary;
      System.out.println(" Constructor Invoke");
      
 }

    public Employee(Employee emp) {
        this.name=emp.name;
      this.salary=emp.salary;
      System.out.println("Copy Constructor Invoke");
    }
 

 void display(){
    System.out.println("name is: " + name +" salary is " + salary);
 }

}

 
public class ParameterlizedC {
    public static void main(String[] args) {
       Employee emp = new Employee("sagar",3400.05);
       Employee emp1 = new Employee(emp);
       emp.display();
      emp1.display();

       System.out.println("End Program");
    }
}
