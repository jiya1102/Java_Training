package BasicsOfJava;

class Student{
    int roll;
    String name;
    public Student( int roll,String name){
      this.roll=roll;
     this. name=name;
    }
    void sum(){
        System.out.println(roll+"  "+name);
    }
}
public class constructor {
     public static void main(String[] args) {
       Student s1=new Student(5, "hi");
        s1.sum();
        
    }
}
