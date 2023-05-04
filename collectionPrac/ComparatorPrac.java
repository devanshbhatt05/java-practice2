package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Employee implements Comparable<Employee> {
    int age;
    String name;

    

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Employee [age=" + age + ", name=" + name + "]";
    }



    @Override
    public int compareTo(Employee o) {
        if(this.age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }


}

public class ComparatorPrac {
    public static void main(String[] args) {

        Comparator<Employee> comp = (o1,  o2) ->  o1.age > o2.age ? 1:-1;

        
      /*   List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(31);
        list.add(14);
        list.add(55);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);*/

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(21, "Sagar"));
        list.add(new Employee(22, "Devansh"));
        list.add(new Employee(40, "Harsh"));
        

        Collections.sort(list);
        //Collections.sort(list, comp);
      //  System.out.println(list);
      for(Employee e: list) {
        System.out.println(e);
      }
     
    }
    
}
