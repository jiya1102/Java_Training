package BasicsOfJava;
class Shape{
    double A;
    double C;
    public Shape( int r){
        A=Math.PI*r*r;
        C=2*Math.PI*r;
    }
    void area(){
      System.out.println("area of circle is:"+A);
      System.out.println("circumference of circle is:"+C);
    }
}
public class circle {
    public static void main(String[] args) {
        Shape c1=new Shape( 4);
        c1.area();
    }
}
