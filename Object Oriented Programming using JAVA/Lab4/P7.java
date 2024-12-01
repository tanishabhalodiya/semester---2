import java.util.*;
public class P7 {
      public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string:");
            String str=sc.nextLine();
            int i,j;
            for(i=0;i<str.length();i++){
            for(i=0;i<str.length();i++){
                for(j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        } 
        }      
    }   
}
