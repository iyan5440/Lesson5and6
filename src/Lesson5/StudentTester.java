
package Lesson5;


public class StudentTester {


    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Bob Smith");
        System.out.format("%s is the name of the Student",s.getName());
        
        //getting tests
        
        s.setScore(1,76);
        s.setScore(2,85);
        s.setScore(3, 99);
        System.out.format("Here are %s's 3 scores",s.getName());
        for (int i = 1; i <= 3; i++) {
            System.out.println(s.getScore(i));
        }
        System.out.format("The top score for %s is %d\n",s.getName(),s.getHighScore());
        System.out.format("The average for %s is %d\n",s.getName(),s.getAvg());
        
        System.out.println(s);
        Student s2 = new Student("Gina Harrision",76,67,82);
        System.out.println(s2);
        
        //make student using other students properties
        Student s3 = new Student(s);
        System.out.println("This is student 3");
        System.out.println(s3);
        
        //4th student ??? -> NO, just another reference to s
        Student s4 = s;
        s4.setName("Jill");
        System.out.format("Original student is %s",s4.getName());

    }
    
}
