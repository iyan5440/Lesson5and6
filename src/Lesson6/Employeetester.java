/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author iyan5440
 */
public class Employeetester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1,e2;
        e1 = new Employee();
        e2 = new Employee();

        e1.setName("JOEY FULLERTIME");
        e1.setType(1);
        e1.setHours(45);
        e1.setRate(20);
        
        e2.setName("JOEY PARTERTIME");
        e2.setType(2);
        e2.setHours(45);
        e2.setRate(20);
        
        System.out.format("%s PAY: %.2f \n",e1.getName(),e1.getPay());
        System.out.format("%s PAY: %.2f ",e2.getName(),e2.getPay());
        
    }
    
}
