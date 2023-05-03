package abstractDemo;

abstract class Car {
    public abstract void driveCar();

    public void SteeringWheel()
    {
        System.out.println("Car have a steering wheel");
    }
    
}

 class MarutiCar extends Car {

    @Override
    public void driveCar()
    {
        System.out.println("Maruti car drive");
    }

}
class MgCar  extends Car{
    @Override
    public void driveCar()
    {
        System.out.println("Mg car drive");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Car c1 = new MarutiCar();
        c1.driveCar();
    }
    
}
