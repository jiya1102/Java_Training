package BasicsOfJava;

class Temperature{
    private float fahrenhit;

    public void cel_To_fer(float calcius){
       fahrenhit=(calcius*9/5)+32;
    }
    public float gettemp(){
        return fahrenhit;
    }
}

public class Encapsulation5 {
    public static void main(String[] args) {
        
        Temperature t1=new Temperature();
        t1.cel_To_fer(37);
       System.out.println( t1.gettemp());
    }
}
