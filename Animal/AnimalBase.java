package Animal;

 public class AnimalBase {
    public void walk()
    {
        System.out.println("Walks");
    }
    protected void talk()
    {
        System.out.println("talk");
    }
    private void eat()
    {
        System.out.println("eats");
    }
    public static void main(String[] args) {
        AnimalBase anm = new AnimalBase();

        anm.eat();
        anm.walk();
        anm.talk();
    }
}
