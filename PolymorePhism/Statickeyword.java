public class Statickeyword {

    static String name;
    static  String dept;
   
    Statickeyword(String name){
     this.name=name;
    }

    static void print(){
        System.out.println("Name: " + name + " , Department:  " + dept);
    }

    public static void main(String[] args) {
        // Statickeyword obj =new Statickeyword("");
        // obj.print();
      Statickeyword.name="sagar";
      Statickeyword.dept="IT";
      Statickeyword.print();

    }
}
