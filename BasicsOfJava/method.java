package BasicsOfJava;

public class method {
    void sum(){
        System.out.println("Radhe!");
    }
    void primenumber() {
        int n=6;
        int count=0;
       for(int i=2;i<n;i++){
         if(n%i==0){
         count ++;
       }}
           if(count==0){
            System.out.println(n+" number is prime");
           }else{
            System.out.println(n+" number isnot prime");
           }
       

    }
    public static void main(String[] args) {
        method s1=new method();
        method p1=new method();
        p1.primenumber();
        // s1.sum();
    }
}
