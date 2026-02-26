package BasicsOfJava;
// abstraction using interface.esme non abstract method nhi bana sakte.public keyword likhna jaruri he.class nahi likhte he
interface Car{
    void run();
}
class Thar implements Car{
    public void run(){
    System.out.println("Radhe!");
   }
}

public class interfaces {
    public static void main(String[] args) {
       Car i1=new Thar();
       i1.run();
        
    }
}
