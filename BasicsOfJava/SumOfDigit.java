package BasicsOfJava;

public class SumOfDigit {
    public static void main(String[] args) {
        int a=121;
        int T=a;
        int sum=0;
        int res=0;
        while(a>0){
            int temp=a%10;
            res=res*10+temp;
            // if(temp%2==0){
            //     System.out.println(temp+" is even");
            // }else{
            //     System.out.println(temp+" is odd");
            //  }
            //  sum=sum+temp;
             a=a/10;
        }
        // System.out.println(sum);
        if(res==T){
            System.out.println("num is palindrome");
        }else{
            System.out.println("num is not palindrome");
        }
    }
}
