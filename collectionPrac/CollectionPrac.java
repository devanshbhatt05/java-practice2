package collectionPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionPrac {
    public static void main(String[] args) {
    //    =============List========
       List<Integer> li = new ArrayList<>();
       // List<-type-> list = new  ArrayList<>();
            li.clear();// remove list
            li.remove(li);//removes on element
            li.add(1);
            li.add(1);
            li.add(2);
            li.add(3);
            System.out.println(li);
       
       
        for(int n: li) {
                System.out.println(n*2);
              }

        //========Hash Set ============      

        Set<Integer> hs = new HashSet<>();
        hs.add(1);      
        hs.add(1);
        hs.add(2);
        hs.add(5);
        hs.add(4);

        System.out.println(hs);



        //==========Tree Set==========
        Set<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(7);
        ts.add(4);
        ts.add(11);

        System.out.println(ts);
        
        //=========map============= 

        Map<String, Integer> map = new HashMap<>();

        map.put("Dejavu", 1000);
        map.put("Hakuna matata", 10000);


        System.out.println(map);

    }
}
