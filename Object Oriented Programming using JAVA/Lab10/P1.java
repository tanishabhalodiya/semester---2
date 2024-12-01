import java.io.*;
public class P1{
	public static void main(String[] args) {


		try{
			FileOutputStream fos =new FileOutputStream("MySelf.txt");
			String temp="My name is Tanisha.";
			for(int i=0;i<10;i++){
				byte[] byteArray=temp.getBytes();
				fos.write(byteArray);
				// System.out.println(" \n");
			}
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}


	     File myFile=new File("MySelf.txt");
		
		try{
			FileReader fr =new FileReader("MySelf.txt");
            System.out.println("My file is exist= "+myFile.exists());
            BufferedReader br=new BufferedReader(fr);

            int charCount=0;
            int wordCount=0;
            int lineCount=0;
			int temp=fr.read();
            String line;
			
			while((line=br.readLine())!= null){
                lineCount++;
                charCount +=line.length();
                String[] words=line.split("\\s+");
                wordCount += words.length;
                temp=fr.read();
				
			}
			fr.close();
            System.out.println("Number of Character: "+charCount);
            System.out.println("Number of Words: "+wordCount);
            System.out.println("Number of Line: "+lineCount);
		}
        catch(Exception e){
			e.printStackTrace();
		}
		
	}
}