package BasicsOfJava;
// method overriding
class animl{
    void sound(){
    System.out.println("animl");
}}

class dog extends animl{
    void sound(){
     System.out.println("dog");
    }
}

class Cat extends animl{
    void sound(){
        System.out.println("cat");
    }
}

public class polymorphism2 {
    public static void main(String[] args) {
        animl a1=new dog();
        animl a2=new Cat();
        a1.sound();
        a2.sound();
    }
}
