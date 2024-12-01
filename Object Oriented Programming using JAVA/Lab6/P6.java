
class Vehicle { 
	int maxSpeed = 120; 
} 

 
class Car extends Vehicle { 
	int maxSpeed = 180; 

	void display(){ 
        System.out.println("Maximum speed of car: "+maxSpeed);
		System.out.println("Maximum Speed: "+ super.maxSpeed); 
	} 
} 

 
public class P6 { 
	public static void main(String[] args) 
	{ 
		Car c1 = new Car(); 
		c1.display(); 
	} 
}
