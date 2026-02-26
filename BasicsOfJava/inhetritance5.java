package BasicsOfJava;

interface Teacher{
    void dpat();
}
interface Profresher{
   void dpat();
}
class Stu implements Teacher,Profresher{
    public void dpat(){
    System.out.println("Computer Science Engineering");
   }

   public void Hod(){
    System.out.println("department");
   }
 }

public class inhetritance5 {
    public static void main(String[] args) {
       Stu s1=new Stu();
       Stu h1 =new Stu();
       h1.Hod();
        s1.dpat();
        
    }
}
