package BasicsOfJava;

class car {
    String color="green";
}

class maruti extends car{
    String color="red";
    void print(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class inheritence4 {
    public static void main(String[] args){
    maruti m1=new maruti();
    m1.print();
}}
