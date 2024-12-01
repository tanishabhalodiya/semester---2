import java.util.*;
interface EventListener{
    public void performEvent();
}
interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
    
    
}
interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyListener();
    
}
class EventDemo implements MouseListener, KeyListener{
    public void performEvent(){
        System.out.println("Event is performed");
    }
    public void mouseClicked(){
        System.out.println("mouse is clicked");
    }
    public void mousePressed(){
        System.out.println("mouse is pressed");
    } 
    public void mouseReleased(){
        System.out.println("mouse is released");
    } 
    public void mouseMoved(){
        System.out.println("mouse is moved");
    } 
    public void mouseDragged(){
        System.out.println("mouse is gragged");
    } 
    public void keyPressed(){
        System.out.println("key is passed");
    } 
    
    public void keyListener(){
        System.out.println("key is listened");
    } 
}

public class P4 {
    public static void main(String[] args){
     EventDemo e=new EventDemo();
     e.performEvent();
     e.mouseClicked();
     e.mousePressed();
     e.mouseReleased();
     e.mouseMoved();
     e.mouseDragged();
     e.keyPressed();
     e.keyListener();   
    }
}
