package BasicsOfJava;

import java.util.*;
//colection framework 
public class Framework {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);//add()
        list.add(6);
        list.add(7);
       System.out.println(list);
       System.out.println(list.get(0));//get()
       list.set(0,10);//set()
       System.out.println(list);
       System.out.println(list.remove(0));//remove()
       System.out.println(list);
       System.out.println(list.size());//size()
       System.out.println(list.contains(6));//contains()



    }
}
