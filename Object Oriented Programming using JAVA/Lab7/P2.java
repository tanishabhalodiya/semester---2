import java.util.*;
interface A{
    int a=1;
    void a(); 
}
interface A1 extends A{

}
interface A2 extends A{

}
interface A12 extends A1,A2{
    int constant=2;
}
class B implements A12{
    public void a(){
        System.out.println("method a called from interface A");
    }
    public void displayConstant(){
        System.out.println("Constant from interface A:"+constant_a);
    }
}
public class P2 {
    
}
