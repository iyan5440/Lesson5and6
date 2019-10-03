
package Lesson5;

import  java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Face {
    
    private int xPos, yPos, diameter;
    private Color c,c1,c2;
    private Graphics g;
    
    public Face(Graphics g){
        xPos =170;
        yPos = 160;
        //let the "g" property = the "g" param
        this.g = g;
        //default size and color
        diameter = 100; //base size
        c = Color.red;
        c1 = Color.blue;
        c2 = Color.black;
    }
    
    public void draw(int mood){ //draw,move,resize,erase,setcolor
        drawHead();
        drawEyes(); // 448,502
        if(mood==1)
            drawMouthHappy();
        else
            drawMouthSad();
            
    }
    private void drawHead(){
        g.setColor(c);
        g.fillOval(xPos, yPos, diameter, diameter); //200,250
    }
    private void drawEyes(){
        g.setColor(c1);
        g.fillOval(xPos+(int)(.15* diameter), yPos+(int)(.25* diameter), diameter/4, diameter/4); //10, 20 //xPos+15
        g.fillOval(xPos+(int)(.55* diameter), yPos+(int)(.25* diameter), diameter/4, diameter/4); //10, 20 //xPos+15
        
    }
    private void drawMouthHappy(){
        g.setColor(c2);
        //first line
        g.drawLine(xPos+(int)(.15* diameter), yPos+(int)(.60* diameter), xPos+(int)(.20* diameter), yPos+(int)(.75* diameter));
        //g.drawLine(xPos+15, yPos+60, xPos+20, yPos+75);
        //second line
        g.drawLine(xPos+(int)(.20* diameter), yPos+(int)(.75* diameter), xPos+(int)(.75* diameter), yPos+(int)(.75* diameter));
        //g.drawLine(xPos+20, yPos+75, xPos+75, yPos+75); 
        //third line
        g.drawLine(xPos+(int)(.75* diameter), yPos+(int)(.75* diameter), xPos+(int)(.80* diameter), yPos+(int)(.60* diameter));
        //g.drawLine(xPos+75, yPos+75, xPos+80, yPos+60);
        
    }
    private void drawMouthSad(){
        g.setColor(c2);
        //first line
         g.drawLine(xPos+(int)(.15* diameter), yPos+(int)(.75* diameter), xPos+(int)(.20* diameter), yPos+(int)(.60* diameter));
        //second line
        g.drawLine(xPos+(int)(.20* diameter), yPos+(int)(.60* diameter), xPos+(int)(.75* diameter), yPos+(int)(.60* diameter));
        //third line
        g.drawLine(xPos+(int)(.75* diameter), yPos+(int)(.60* diameter), xPos+(int)(.80* diameter), yPos+(int)(.75* diameter));
    }
    
    public void move(int x,int y){
        xPos = x;
        yPos = y;
    }
    
    public void resize(int d){
        diameter = d;
        
        
    }
    public void setColor(Color cf,Color ce,Color cm){
        c = cf;
        c1 = ce;
        c2 = cm;
        
    }
    
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10,yPos-10,diameter +20, diameter +20);
    }
}
