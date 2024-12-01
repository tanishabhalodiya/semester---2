import java.util.*;
public class Lab4{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter two double numbers: ");
     double a=Double.parseDouble(args[0]);
     double b=Double.parseDouble(args[1]);

     double sum=a+b;

     System.out.println("Sum: "+sum);
    }
}
