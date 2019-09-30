
package Lesson5;

import java.util.Scanner;


public class Lucky7 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int tries =0;
        int maxmoney =0, startmoney;
        int bestroll=0; 
        System.out.println("How many dollars are you starting with?: ");
        startmoney = s.nextInt();
        while(true){
            if(startmoney==0) break;
            d1.roll();
            d2.roll();
            tries++;
            int total = d2.getvalue()+d1.getvalue();
            if(total==7){
                startmoney+=4;
                if(startmoney>maxmoney){
                    maxmoney=startmoney;
                    bestroll = tries;
                }
            }
            else{
                startmoney-=1;  
            }
            System.out.format("Try %d: ",tries);
            System.out.format("You rolled a %d and a %d for a total of %d. %d:\n",d1.getvalue(),d2.getvalue(),total,startmoney);
            if(startmoney==0) break;
        }
        System.out.format("You are broke after %d rolls\n",tries);
        System.out.format("You should have quit after %d rolls when you had $%d",bestroll,maxmoney);
        
        /*
        while(true){
            d1.roll();
            d2.roll();
            tries++;
            int total = d2.getvalue()+d1.getvalue();
            System.out.format("Try %d: ",tries);
            System.out.format("You rolled a %d and a %d for a total of %d.\n",d1.getvalue(),d2.getvalue(),total);
            if(total==2){
                break;
            }
        }*/
        
    }
    
}
