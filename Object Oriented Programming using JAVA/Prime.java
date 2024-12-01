import java.util.*;
public class Prime{
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,c=0;

        for(i=0;i<=a;i++){
            if(a % i==0){
                c++;
            }
    
        }
        if(c==2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}