package BasicsOfJava;

class Employee{
    void work(){
        System.out.println("working..");
    }
}

class manager extends Employee{
    void meeting(){
        System.out.println("meeting..");
    }
}

public class inheritence2 {
    public static void main(String[] args) {
        manager m1=new manager();
        m1.meeting();
        m1.work();
        
    }
}
