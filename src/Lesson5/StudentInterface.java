
package Lesson5;

import java.util.Scanner;


public class StudentInterface {

//b use getscore(), getavg(), and getname() to print the name of the student with the highest score and name of student with highest avg
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student();
        Scanner s = new Scanner(System.in);
        
        String name;
        int score,score1;
        //input first Student
        while(true){
            System.out.print("Enter name for first student: "); //(min 1 letter)
            //s.nextLine();
            name = s.nextLine();
            stu.setName(name);
            for (int i = 1; i <= 3; i++) {
            System.out.format("Enter test score %d for %s> ",i,stu.getName());
            score = s.nextInt();
            stu.setScore(i,score);
            }
            String errormsg = stu.validateData();
            if(errormsg == null) break;
            else{
                System.out.println(errormsg);
            }
            s.nextLine();
        }
        s.nextLine();
        //input the second students data
        while(true){
            System.out.print("Enter name for second student: ");
            name = s.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ",i,stu1.getName());
                score = s.nextInt();
                stu1.setScore(i,score);
            }
            String errormsg = stu1.validateData();
            if(errormsg == null) break;
            else{
                System.out.println(errormsg);
            }
            s.nextLine();
        }
        
        System.out.println("\n-------------------------------\n");
        //output the students info
        if(stu1.getAvg() > stu.getAvg()){
            System.out.println(stu1.getAvg());
        }
        else{
            System.out.println(stu.getAvg());
        }
        if(stu1.getHighScore() > stu.getHighScore()){
            System.out.println(stu1.getHighScore());
        }
        else{
            System.out.println(stu.getHighScore());
        }
 
    }
    
}
