
class Emp{
    int id;
    int salary;
    static String comp;

    void show()
    {
        System.out.println(id + ":" + salary +":"+ comp);

    }
}



class StaticPrac{
    public static void main(String[] args) {

        Emp em1 = new Emp();
        em1.id= 1;
        em1.salary = 10000;
        // em1.comp = "KPMG";
        
        


        Emp em2 = new Emp();
        em2.id =2;
        em2.salary = 20000;
        // em2.comp = "EY";
        Emp.comp = "EY";
       // static variables don't require objects !!
       // you can also create static methods
              
        em1.show();
        em2.show();

       
    }
}