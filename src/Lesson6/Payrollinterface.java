
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
                System.out.println("Enter data for new Employee\n===========================\n");
                System.out.print(" >> Name or <enter> to quit: ");
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

/*
tries   name  type  rate    hours   total
0       bill  1     6.74    -1      no total still looped at rate
1       josh  1     6.75    -1      no total still looped at hours
2       bill  3     6.75    0       no total still looped at type
3       -2    1     6.75    1       6.75 (logic error)
4       bill  1     30.51   -1      no total still looped at rate
5       0     1     30.50   1       30.50 (logic error)
6       bill  2     6.75    60      405.00
7       bill  1000  -100    -1      no total still looped at type
8       bill  2000  +100    0       no total still looped at type
9       -2    1     -100    1       6.75 (logic error)
10      bill  1     +100   -1       no total still looped at rate
11      Jona  2     30.50   34      1037.00
*/

