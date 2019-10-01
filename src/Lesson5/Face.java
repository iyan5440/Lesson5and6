
package Lesson5;

import  java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Face {
    
    private int xPos, yPos, diameter;
    private Color c;
    private Graphics g;
    
    public Face(Graphics g, int x,int y){
        xPos =x;
        yPos = y;
        //let the "g" property = the "g" param
        this.g = g;
        //default size and color
        diameter = 100;
        c = Color.red;
    }
    
    public void draw(){ //draw,move,resize,erase,setcolor
        drawHead();
        drawEyes(); // 445,502
        //drawMouth();
    }
    private void drawHead(){
        g.fillOval(xPos, yPos, 50, 50);
    }
    private void drawEyes(){
        g.fillOval(xPos+5, yPos+5, xPos, xPos);
    }
    private void drawMouth(){
        
    }
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10,yPos-10,diameter +20, diameter +20);
    }
}
