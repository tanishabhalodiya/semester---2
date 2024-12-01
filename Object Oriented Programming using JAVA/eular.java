import java.util.*;
public class eular {
    double x;
    double y;
    double h;
    double x0;
    double y0;
    double xn;
    int n;
    public void function(int x,int y){
        
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter h:");
    double h=sc.nextDouble();
     System.out.println("Enter x0:");
     double x0=sc.nextDouble();
     System.out.println("Enter y0:");
     double y0=sc.nextDouble();
     System.out.println("Enter xn:");
     double xn=sc.nextDouble();
     System.out.println("Enter a number of steps:");
     int n=sc.nextInt();
     System.out.println("Enter the function of x and y:");
     double x=sc.nextDouble();
     double y=sc.nextDouble();

     for(int i=0;i<n;i++){
        x=x0+h;
        y=y0+h*function(x,y);
     }


                            
    }
}
