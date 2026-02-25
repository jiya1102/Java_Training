package BasicsOfJava;

class Atm{
    private int paisa;

    public Atm(int p){
        this.paisa=p;
    }

    public int gatter(int a){
        paisa=paisa-a;
        return paisa;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Atm t1=new Atm(100);
        int x=t1.gatter(20);
        System.out.println(x);
        
    }
}
