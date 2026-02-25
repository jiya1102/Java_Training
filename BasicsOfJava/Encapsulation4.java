package BasicsOfJava;

class empoly{
    private String id;
    private String name;
    private int salary;

    public void satter(String a,String c,int b){
        this.id=a;
        this.name=c;
        this.salary=b;
    }
    public int getsalary(){
        return salary;
    }
     public String getname(){
        return name;
    }
    public String getid(){
        return id;
    }
    
}
public class Encapsulation4 {
    public static void main(String[] args) {
        empoly e1=new empoly();
        e1.satter("@jiya", "janvi", 2000);
       
       System.out.println( "salary is:"+e1.getsalary());
       System.out.println( "salary is:"+e1.getname());
       System.out.println( "salary is:"+e1.getid());
        
    }
}
