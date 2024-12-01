import java.util.*;
public class Lab42{
    public static void main(String[] args){
        System.out.println("Enter a line:");
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        int v=0;
        int c=0;
        for(int i=0;i<line.length();i++){
        
        char x=line.charAt(i);

        if(x >='a' && x <='z' || x >='A' && x <='Z'){

            if(x=='a' ||x=='e' ||x=='u' ||x=='i' ||x=='o' ){
                v++;
            }
            else{
                c++;
            }
       }
        }
        System.out.println("Vowels in line: "+v);
        System.out.println("Consonants in line: "+c);
    }
}
