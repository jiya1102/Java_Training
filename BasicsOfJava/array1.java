package BasicsOfJava;

public class array1 {
    public static void main(String[] args) {
        //sum of two array
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        int sum[]={  };
        for(int i=1;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
            System.out.println(sum[i]);
        }
    }
}
