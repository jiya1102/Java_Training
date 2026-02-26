package BasicsOfJava;

import java.util.HashMap;

public class Framework3 {
    public static void main(String[] args) {
         String str="hello"; 
        HashMap<Character, Integer> map = new HashMap<>();
        // map.put('h', 1);
        // map.put('e', 1);
        // map.put('l', 2);
        // map.put('o', 1);

        // System.out.println(map);
        // System.out.println(map.get('l'));

       for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
         map.put(ch, map.getOrDefault(ch, 0)+1);
        
       }
        System.out.println(map);
      
        for(char ch:str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                // break;
            }
        }


    }
}
