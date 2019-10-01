
package Lesson6;

import java.util.Scanner;


public class Booleanreview {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //ask for 2 test scores ,decide their job
        //manager = both 90%+
        //supervisor - one at least 90 but the other no less than 0%
        //anything else is a clerk
        System.out.print("Enter score 1 results: ");
        int s1 = s.nextInt();
        System.out.print("Enter score 2 results: ");
        int s2 = s.nextInt();
        
        boolean bh, atl1,nolow;
        bh = s1 >= 90 && s2 >= 90;
        atl1 = s1 >= 90 || s2 > 90;
        nolow =s1 >= 70 && s2 >= 70;
        
        if(bh) System.out.println("YOU ARE A MANAGER!");
        else if(atl1 && nolow) System.out.println("YOU ARE A SUPERVISOR");
        else System.out.println("YOU ARE A CLERK!");
    }
    
}
