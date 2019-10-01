
package Lesson6;


public class Employee {
    //step 1: instance variables
    
    private String name;
    private int type; //1 = FT emp, 2=PT emp
    private double rate;
    private int hours;
    
    //2 constructor
    public Employee(){
        name="";
        type =0;
        rate=0;
        hours=0;
    }
    
    //3 instance methods
    //these 4 return a "rule" message
    
    public String getTypeRules(){
        return "1 or 2";
    }
    public String getNameRule(){
        return "non blank";
        
    }
    public String getRateRules(){
        return "between 6.75 and 30.50 inclusive";
    }
    public String getHorRules(){
        return "between 1 - 60 inclusive";
    }
    
    //boolean setters
    //if incoming data breaks the rules the property wont get set - false returned
    //if incoming data is ok, property is set and true and true is returned
    //this accomplishes a couple of things
    //1. protects proprty from being set to "bad data"
    //2. sends a signal back to client class to let it know if property was set or not
    
    public boolean setName(String nm){
        boolean nmblnk = nm.equals("");
        if(nmblnk) return false;
        name = nm;
        return true;
    }
    
    public boolean setType(int t){
        boolean typeok = t==1 || t==2;
        if(typeok){
        type = t;
        return true;
        }
        else return false;
    }
    public boolean setRate(double rt){
        boolean rateok = rt >=6.75 && rt <=30.50;
        if(rateok){
            rate =rt;
            return true;
        }
        else return false;
    }
    public boolean setHours(int h){
        boolean hoursok = h>=1 & h<=60;
        if(hoursok){
            hours = h;
        }
        return hoursok;
    }
    public String getName(){
        return name;
    }
    public double getPay(){
        boolean overtime = (type==1 && hours >40);
        double pay;
        if(overtime){
            pay =(hours -40) * rate *2+rate *40;
        }
        else pay = hours* rate;
        return pay;
    }
}


