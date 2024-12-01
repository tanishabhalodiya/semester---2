import java.io.*;
public class P2{
	public static void main(String[] args) {
		
		int no_of_rep=0;
		try{
			FileOutputStream fos =new FileOutputStream("file1.txt");
			String temp="Word1";
			for(int i=0;i<5;i++){
				byte[] byteArray=temp.getBytes();
				fos.write(byteArray);	
			}
			String temp2=temp.replace("1","2");
			
			FileOutputStream fos2=new FileOutputStream("file2.txt");
			for(int i=0;i<5;i++){
				byte[] byteArray=temp2.getBytes();
				fos2.write(byteArray);
				no_of_rep++;	
			}
			fos.close();
			fos2.close();
			System.out.println("no od replacement is="+no_of_rep);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}