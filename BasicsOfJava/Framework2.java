package BasicsOfJava;

import java.util.*;

public class Framework2 {
    public static void main(String[] args) {
        // HasMap ek datatype hota he jisme data key or value ke pairs me store hote he
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 9);//put()
         map.put(1, 8);
          map.put(2, 10);

          System.out.println(map);
          System.out.println(map.get(0));//get()
          map.remove(0);//remove()
          System.out.println(map.containsKey(2));//containskey()
           System.out.println(map.containsValue(2));//containsvalue()
          System.out.println(map);
    }
}
