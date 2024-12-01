import java.util.*;
class Vehicle{
    final int speedLimit=80;
}
class Car extends Vehicle{
    int speedLimit;
    public Car(){
        speedLimit=100;
    }
}
public class P7 {
    public static void main(String[] args){
        Car c1=new Car();
        Vehicle v1=new Vehicle();
        System.out.println(c1.speedLimit);
        System.out.println(v1.speedLimit);
        
    }
}
