
import javax.sound.midi.Soundbank;

class Outer{
    int x=10;

     class Inner{
        
        void display(){
           
            System.out.println(x);
        }
    }
   
}

public class InnerClassEx {
    public static void main(String[] args) {
        Outer obj=new Outer();

        Outer.Inner innerobj=obj.new Inner();
        
        innerobj.display();

       
         
    }
}
