package BasicsOfJava;
class shape{
    double A;
    double C;
    public shape( int r,int c){
        A=3.14*r*r;
        C=2*3.14*r;
    }
    void area(){
      System.out.println("area of circle is:"+A);
      System.out.println("circumference of circle is:"+C);
    }
}
public class circle {
    public static void main(String[] args) {
        shape c1=new shape(4, 4);
        c1.area();
    }
}
