import java.util.*;
public class Circle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		double r=sc.nextDouble();
		double a=Math.PI * Math.pow(r,2);

		System.out.println("Area of circle: "+a);
		
	}
}