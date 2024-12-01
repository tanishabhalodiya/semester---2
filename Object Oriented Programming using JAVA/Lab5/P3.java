import java.util.*;
public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
     
        while(true){
            
            System.out.println("Enter sentence and type 'quit' for exit");
            String str=sc.nextLine().toLowerCase();
           
            if(str.equals("quit")){
            System.out.println("exit");
           break;
        }


        int counta=0,counte=0,counti=0,counto=0,countu=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'){
                counta++;
            }
            else if(ch=='e'){
                counte++;
            }
            else if(ch=='i'){
                counti++;
            }
            else if(ch=='o'){
                counto++;
            }
            else if(ch=='u'){
                countu++;
            }
        }
    
        System.out.println("count of vowel a:"+counta);
        System.out.println("count of vowel e:"+counte);
        System.out.println("count of vowel i:"+counti);
        System.out.println("count of vowel o:"+counto);
        System.out.println("count of vowel u:"+countu);
    }
}
}
