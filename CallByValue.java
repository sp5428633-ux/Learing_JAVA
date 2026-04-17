class test{
    int marks;

}


public class CallByValue {
    // call by value 
    public static void changeValue(int num) {
        num =100;
        System.out.println(num);
    }
   // call by refernce
    public static void changemarks(test s) {
        s.marks=90;
    }

    public static void main(String[] args) {
        int num=10;
        changeValue(num);
        System.out.println(num);

        test t =new test();
        t.marks=75;
        changemarks(t);
        System.out.println(t.marks);
    }
}
