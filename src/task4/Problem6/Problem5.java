package task4.Problem6;

interface Vehicle
    {
        void start();
         void stop();
    }

class Bike implements Vehicle {
    public void start(){
        System.out.println("She starts bike");
    }
    public void stop(){
        System.out.println("she stops bike");
    }
}
class Car implements Vehicle{
    public void start(){
        System.out.println("She drives car");
    }
    public void stop(){
        System.out.println("she stops car");
    }
}

