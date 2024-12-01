import java.util.*;
public class P7 {
 int instance_variable;
 static int static_variable=50;
 
 public P7(int instance_variable){
       this.instance_variable=instance_variable;
 }
 public void display()
    System.out.println("Instance variable:"+this.instance_variable);
    System.out.println("static variable:"+static_variable);
 }
 public static void main(String[] args) {
    P7 obj=new P7(10);
    obj.display();
 }
}
