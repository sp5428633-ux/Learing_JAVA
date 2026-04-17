public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee();
       Employee emp1 = new Employee();

        
      
        obj.id=12;
        obj.name="sagar";
        obj.salary=35000.5f;
        
    //     System.out.println(obj.msg);
    //     System.out.println(obj.id);
    //     System.out.println(obj.name);
    //     System.out.println(obj.salary);
       
     
       
        emp1.id=32;
        emp1.name="Gana";
        emp1.salary=39000.5f;
        
    //     System.out.println(emp1.msg);
    //     System.out.println(emp1.id);
    //     System.out.println(emp1.name);
    //     System.out.println(emp1.salary);


    // print data using methods 
     obj.printDetails();
     emp1.printDetails();
    }
}

class Employee{
    String msg="Employees Details";
    int id;
    String name;
    float salary;

    public  void printDetails(){
        System.out.println(msg);
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
