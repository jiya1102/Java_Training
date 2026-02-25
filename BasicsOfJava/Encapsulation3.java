package BasicsOfJava;

class std{
    private String name;
    private int marks;

    public void setter(String s,int m){
        this.name=s;
        this.marks=m;
    }

    public int gatmarks(){
        return marks;
    }
    public String gatname(){
        return name;
    }

    public void printDetails(){
        System.out.println("marks is:"+ gatname());
        System.out.println("marks is:"+ gatmarks());

    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        std s1=new std();
        s1.setter("jiya",92);
        s1.printDetails();

    
        
    }
}
