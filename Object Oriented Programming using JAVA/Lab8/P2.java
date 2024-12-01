import java.util.*;
public class P2 {
    public static void main(String[] args){
        
        try{
            
            for(int i=0;i<=args.length;i++){

                int sum=0;
                
                if((Integer.parseInt(args[i]))<0){
                    throw new ExceptionA("Number is negative");
                }
                else if((Integer.parseInt(args[i]))%10==0){
                    throw new ExceptionB("Number is divisible by 10");
                }
                else if((Integer.parseInt(args[i])>1000) && (Integer.parseInt(args[i]))<2000){
                    throw new ExceptionC("Number is greater than 1000 and less than 2000");
                }
                else if((Integer.parseInt(args[i]))>7000){
                    throw new ExceptionD("Number is greater than 7000");
                }
                else{
                    sum=sum+Integer.parseInt(args[i]);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class ExceptionA extends Exception{
    public ExceptionA(String msg){
        super(msg);
    }
}
class ExceptionB extends Exception{
    public ExceptionB(String msg){
        super(msg);
    }
}
class ExceptionC extends Exception{
    public ExceptionC(String msg){
        super(msg);
    }
}
class ExceptionD extends Exception{
    public ExceptionD(String msg){
        super(msg);
    }
}
