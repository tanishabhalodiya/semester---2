import java.util.*;
class Vegetable {
    final String color;
    
    public Vegetable(String color){
        this.color=color;
    }
    
    public String toString(){
    
    return("vegetable "+getClass().getName() +"  has "+color+" color");
    }
}
class Potato extends Vegetable{
    public Potato(String color){
        super(color);
    }
}
class Brinjal extends Vegetable{
    public Brinjal(String color){
        super(color);
    }
}
class Tomato extends Vegetable{
    public Tomato(String color){
        super(color);
    }
}
public class P1 {
    public static void main(String[] args) {
        Potato p=new Potato("rust");
        Brinjal b=new Brinjal("Purple");
        Tomato t=new Tomato("red");
            
        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }
   
}
