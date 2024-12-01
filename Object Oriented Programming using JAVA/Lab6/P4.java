import java.util.*;
class MyPoint{
    int x;
    int y;
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x,int y){
        this.x=x;
        this.y=x;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public double distance(MyPoint p1, MyPoint p2){
        return Math.sqrt((Math.pow((this.x - p1.getx()),2)+Math.pow((this.y-p1.gety()),2)));
    }
    
    public double distance(int x,int y){
        return Math.sqrt((Math.pow((this.x - x),2))+Math.pow((this.y - y),2));
    }
}
public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyPoint p1=new MyPoint(2,5);
        MyPoint p2=new MyPoint(9,2);
       
        // System.out.println("Enter point 1:");
        // System.out.println("Enter ponit 2:");
        System.out.println("Distance between point p1 and p2 is: "+p1.distance(p2));
        System.out.println("Distance between point p1 and (0,0) is: "+p1.distance(9,2));
    }
}
