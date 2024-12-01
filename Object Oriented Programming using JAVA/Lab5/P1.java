public class P1 {
    double r;
    public void Circle(double r){
        this.r=r;
    }

    public double calculateArea(){
        return Math.PI * r* r;

    }
    public static void main(String[] args){
        double r=5.0;
        Circle circle=new Circle(r);
        double area=circle.calculateArea();
        System.out.println("enter a radius of circle:");
        System.out.println("Area:"+area);
    }
}