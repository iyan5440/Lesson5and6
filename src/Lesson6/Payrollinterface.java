
package Lesson6;

import java.util.Scanner;


public class Payrollinterface {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            Employee emp;
            String name;
            int type;
            double rate;
            int hours;
            
            
            while(true){
                emp = new Employee();
                //ask for name
                System.out.println("Enter data for new Employee\n=============\n");
                System.out.print(" >> Name or <enter> to quit");
                name = s.nextLine();
                //try to set name if fail get out of program
                if(emp.setName(name)==false) break;
                // if no break fill in rest of data for employee
                //type
                while(true){
                    System.out.print(" >>  Type: (" + emp.getTypeRules() + ")");
                    type = s.nextInt();
                    if(emp.setType(type)) break;
                }
                //rate
                while(true){
                    System.out.print(" >>  Rate: (" + emp.getRateRules() + ")");
                    rate = s.nextDouble();
                    if(emp.setRate(rate)) break;
                }
                while(true){
                    System.out.print(" >>  Hours: (" + emp.getHorRules() + ")");
                    hours = s.nextInt();
                    if(emp.setHours(hours)) break;
                }
                
                //when I get to here the employee has all VALID data set to its properties
                //print the pay
                System.out.format("Weekly pay for %s is $%.2f\n",emp.getName(),emp.getPay());
                System.out.println("");
                s.nextLine();
            }
            System.out.println("Program ended");
    }
    
    
}
