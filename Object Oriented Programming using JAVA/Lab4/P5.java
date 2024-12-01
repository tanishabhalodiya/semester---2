import java.util.*;


public class P5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
     
        
        int l=str.length();
        System.out.println("Length of string:"+l);
        
        int n=l/2,i;


        for(i=n;i<l;i++){
             System.out.print(str.charAt(i));
        }

    }
}
