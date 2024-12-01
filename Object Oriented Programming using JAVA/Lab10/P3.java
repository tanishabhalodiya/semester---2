import java.util.*;
import java.io.*;
public class P3 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Give the file name as command line argument.");
        String file=new String(args[0]);

        try(){
			FileInputStream fis = new FileInputStream(file);
           
            while(temp>0){
                
                    if(temp =='5'){
                        count++;
                    }
                
            }
			
			fos.close();
            System.out.println("Number of occurence of temp 5 are: "+count);
		}catch(Exception e){
			e.printStackTrace();
		}
    }
}
