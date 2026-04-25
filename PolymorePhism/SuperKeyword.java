class Parent {
   String name="parent";
  
}

class Child extends Parent{
  String name="child";

  void show(){
    System.out.println(name);
    System.out.println(super.name);

   
  }
}

class Employee{
    String company;

    Employee(String company){
       this.company=company;
       System.out.println("Employee constructor callled");
    }

    void getdetails(){
        System.out.println("company: " + company);
    }
}

class Manager extends Employee{
    String department;

    public Manager(String company,String department) {
        super(company);// calling parent constructor

        this.department=department;
        System.out.println("Manager Constructor called");

    }

    void  getFullDetails(){
        super.getdetails();//calling parent method 
        System.out.println("Department: " + department);
    }

    
}


public class SuperKeyword {
    public static void main(String[] args) {
        Manager obj= new Manager("FCT","IT");
       System.out.println("Manager Details");
        obj.getFullDetails();
    }
}
