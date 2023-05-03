class S {
    S(){
        System.out.println("Constructor of Anonymous class");
    }

    void show()
    {
        System.out.println("Anonymous object called");
    }
}
public class AnonDemo {
    
    public static void main(String[] args) {
        
        new S().show(); 
    }
}
