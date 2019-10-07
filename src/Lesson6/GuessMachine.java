
package Lesson6;

import java.util.Random;


public class GuessMachine {
    
    private int numguesses;
    private int guess;
    private int num;
    //private int number = 
    
    public GuessMachine(){
        numguesses =0;
        guess=0;
        num = (int) (Math.random()*101+1);
        
    }
    public boolean setGuess(int n){
        guess =n;
        if(guess>0 && guess<=100){
            numguesses++;
            return true;
        }
        
        else{
            return false;
        }
    }
    
    public String giveHint(){
        if (guess>num){
            return "high";
        }
        else if (guess<num){
            return "low";
        }
        else{
            return "";
        }
    }
    
    public int getnumGuesses(){
        return numguesses;
    }
    
}
