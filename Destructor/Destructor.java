
class Demo{

    public Demo() {
        System.out.println("Constructor is Called");
    }
   @Override
    protected void finalize() throws Throwable{
        System.out.println("Finalize Mehtod Called");
    }
}

public class Destructor {
    public static void main(String[] args) {
        Demo demo=new Demo();

        demo=null;
        System.gc();


    }
}
