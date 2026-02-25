package BasicsOfJava;

class person{
    void displayName(){
        System.out.println("jiya");
    }
}

class stu extends person{
   void displayclass(){
     System.out.println("college");
   }
}

class monitor extends stu{
    void checkDicipline(){
        System.out.println("very good");
    }
}
public class inheritence3 {
    public static void main(String[] args) {
        monitor m1=new monitor();
        m1.displayName();
        m1.displayclass();  
        m1.checkDicipline();      
    }
}
