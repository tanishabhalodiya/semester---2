import java.util.*;

public class P7s{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter a number of star: ");
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
