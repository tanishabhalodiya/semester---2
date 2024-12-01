import java.util.*;
interface Transport{
    public void deliver();
}

abstract class Animal{
    
}
class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel Transport.");
    }
}
class Deer extends Animal{

}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Donkey Transport.");
    }
}
public class P3 {
    public static void main(String[] args) {
        Animal[] A=new Animal[4];

    // for (int i = 0; i < A.length; i++) {
    //     System.out.println("enter animal");
    // }
    Camel C = new Camel();
    A[0]=new Tiger();
    A[1]=C;
    A[2]=new Donkey();
    A[3]=new Deer();
    

    }
}