package InnerClassDemo;



class A {
    String name;

    public void display() {
        System.out.println("in display");
    }

    static class B {
        public void show() {
                System.out.println("in show");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();

        A.B ob = new A.B();
        ob.show();
        // A.B obj1 = obj.new B();

    }
    
}
