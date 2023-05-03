package interfacePrac;

interface Mobile extends Processor,typeOfProcessor
{
    void model();
}
interface Processor
{
    void chip();
}
interface typeOfProcessor
{
    void snap();
}

class SmartPhone implements Processor,Mobile
{

    @Override
    public void model() {
        System.out.println("Oneplus 11  ");
    }

    @Override
    public void chip() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chip'");
    }

    @Override
    public void snap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'snap'");
    }

}



public class InterfacePrac1 {
    public static void main(String[] args) 
    {
        Mobile m = new SmartPhone();
        m.model();
    
    
    }
}
