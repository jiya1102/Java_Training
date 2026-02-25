package BasicsOfJava;

 abstract class shape{
 abstract  int area(int r);
 abstract  int area(int a,int b);
}
 class squre extends shape{
    int area(int r){
      return r*r;
    }

    int area(int a,int b){
      return 0;
    }
 }
 class rectangle extends shape{
     int area(int a,int b){
       return a*b;
     }
     int area (int r){
      return 0;
     }
 }

public class Abstraction2 {
    public static void main(String[] args) {
        shape s1=new squre();
         shape s2=new rectangle();
        System.out.println(s1.area(5));
       System.out.println( s2.area(5,6));
        
    }
}
