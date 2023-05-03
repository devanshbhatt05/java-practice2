class Employee1 {
    private String name;
    private int salary;

    Employee1() {

    }

    Employee1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    
}

public class EncPrac {
    public static void main(String[] args) {
        
        Employee1 e = new Employee1("devansh", 1000);
    
    System.out.println(e.getSalary());
      System.out.println(e.getName());

    }
}
