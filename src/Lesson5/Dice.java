
package Lesson5;

import java.awt.Graphics;
import java.awt.Color;


public class Dice {
    private int value;
    private Graphics g;
    private Color c;
    private Color dc;
    private int dotsize;
    private int size;
    private int pos1,pos2,pos3;
    
    
    public Dice(){
        value = (int)(Math.random()*6+1);
        g = null;
        c = null;
    }
    
    public Dice(Graphics pg, int width){
        value = (int)(Math.random()*6+1);
        g = pg;
        c = Color.white;
        dc = Color.black;
        this.size = width;
        dotsize = (int)(.167*size);
        pos1 = (int)(.03*size);
        pos2 = (int)(.23*size);
        pos3 = (int)(.43*size);

    }




    public void roll(){
        value = (int)(Math.random()*6+1);
    }
    void setColor(Color newc,Color newdc){
        c = newc;
        dc =newdc;

    }
    
    public int getvalue(){
        return value;
    }
    
    public void draw(){
        if(g==null) return;
        g.setColor(c);
        g.fillRoundRect(0,0,/*(int)(.67)*size*/100,100/*(int)(.67*size)*/,20,20); //25,25,100,100,20,20
        
        //draw 7 dots
        g.setColor(dc);
        if(value==1){ //123567 for 6 12467 for 5 1267 for 4 147 for 3 17 for 2 4 for one
            draw4();
            
        }
        if(value==2){ 
            draw1();
            draw7();
        }
        if(value==3){ 
            draw1();
            draw4();
            draw7();
        }
        if(value==4){ 
            draw1();
            draw2();
            draw6();
            draw7();
        }
        if(value==5){ 
            draw1();
            draw2();
            draw4();
            draw6();
            draw7();
        }
        if(value==6){ 
            draw1();
            draw2();
            draw3();
            draw5();
            draw6();
            draw7();
        }
        
        
        
        
    }
    private void draw1(){
        g.fillOval(5,5,dotsize,dotsize);
        
    }
    private void draw2(){
        g.fillOval(65,5,dotsize,dotsize);
        
    }
    private void draw3(){
        g.fillOval(5,35,dotsize,dotsize);
    }
    private void draw4(){
        g.fillOval(35,35,dotsize,dotsize);  // 30  60  90
    }
    private void draw5(){
        g.fillOval(65,35,dotsize,dotsize);
    }
    private void draw6(){
        g.fillOval(5,65,dotsize,dotsize);
    }
    private void draw7(){
        g.fillOval(65,65,dotsize,dotsize);
    }



    
    
    


}

