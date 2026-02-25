package BasicsOfJava;

class main{
    //polymorphism
    //method overloadind
    void add(){
       System.out.println("Hyy!");
    }

    void add(int a){
     System.out.println(a);
    }

    void add(int a,int b){
     System.out.println(a+b);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        main m1=new main();
        m1.add(5,4);
    }
}
