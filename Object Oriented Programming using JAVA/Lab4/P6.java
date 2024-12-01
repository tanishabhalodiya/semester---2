
import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++){
            
            char ch=sc.next().charAt(i);
            if(ch<=65 || ch>=90){
                System.out.println("Error:an argument is must be in upper case.");
            }
            

        }
    }
}
