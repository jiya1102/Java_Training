package BasicsOfJava;

import java.util.*;

public class Framework4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=4;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);
                return;
            }
            map.put(arr[i],i);
            
        }

    }
}
