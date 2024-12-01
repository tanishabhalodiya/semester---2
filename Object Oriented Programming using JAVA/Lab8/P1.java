import java.util.*;
public class P1 {
    public static void main(String[] args) {
        int x,y;
        int ans=1;
    try{
         x=Integer.parseInt(args[0]);
         y=Integer.parseInt(args[1]);
        if(y>=0){
            for(int i=1;i<=y;i++){
                ans=ans*x;
            }
            System.out.println("Multiplication of given number is:"+ans);
        }
    }
    catch(Exception e){
        System.out.println("Invalid value of x and y.");
    }
}
    }
    