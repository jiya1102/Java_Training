package BasicsOfJava;

abstract class carr{
   abstract void color();
   void run(){
    System.out.println("run...");
   }
}
class color extends carr{
    void color(){
   System.out.println("red");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        carr c1=new color();
        carr c2=new color();
        c1.color();
        c2.run();
        
    }
    
}
