interface Transport{
    void move();
}

class Car implements Transport{
    @Override
    public void move(){
        System.out.println("Машина поехала");
    }
}

class Bike implements Transport{
    @Override
    public void move(){
        System.out.println("Велосипед поехал");
    }
}

class TransportManager{
    public void startTransport(Transport transport){
        transport.move();
    }
}


public class HW2 {
    public static void section1(){
        Car car = new Car();
        Bike bike = new Bike();
        TransportManager transportManager = new TransportManager();
        transportManager.startTransport(car);
        transportManager.startTransport(bike);
    }
}
