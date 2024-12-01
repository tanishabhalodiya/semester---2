import java.util.*;
class Time{
    int hour;
    int minute;

    public Time(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
        }
    
        void addition(Time t){
            this.minute+=t.minute;
            this.hour+=t.hour;
            if(minute>60){
                this.hour++;
                this.minute-=60;
            }
        }
    }

public class P2 {
    public static void main(String[] args) {
        Time t1=new Time(2,50);
        Time t2=new Time(3,20);
        t1.addition(t2);

        System.out.println(t1.hour+":"+t1.minute);
    }
}
