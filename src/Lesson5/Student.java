
package Lesson5;


public class Student {
    //define properties of the object
    //instance variables = properties
    //usually declared private
    private String name;
    private int t1, t2, t3;
    
    //constructor
    //public <Name of the Class>
    //This runs when object is made (instantied)
    //With the keyword new
    //mits job is to initialize some or all of the properties
    //properties / instance variables of the object
    public Student(){
//        name ="";
//        t1=0;
//        t2=0;
//        t3=0;
//        System.out.println("Student has been created");
//call another onstructor from this onstructor
          this("",0,0,0);
          //this is called chaining instructions
          //this = look elsewhere in this class for another constructor
    }

    //another constructor to set all properies as you make it
    public Student(String n,int test1,int test2,int test3){
        name=n;
        t1 = test1;
        t2 = test2;
        t3 = test3;
        
        
    }
    //3rd construct to clone properties from another student
    public Student(Student other){
//        name = other.name;
//        t1 = other.t1;
//        t2 = other.t2;
//        t3 = other.t3;
          this(other.name,other.t1,other.t2,other.t3);
        
    }
    
    //add instance methods to make up the abilities of the student
    //access to name to set it and get it
    public void setName(String n){
        name = n;
    }
    public String getName(){ 
        return name;
    }
    public void setScore(int which, int score){
        if(which==1) t1 = score;
        else if(which==2) t2 = score;
        else t3 = score;
    }
    public int getScore(int which){
        if(which==1) return t1;
        else if(which==2)return t2;
        else return t3;
    }
    public int getHighScore(){
        int hs = t1;
        if(t2 > hs) hs =t2;
        if(t3 > hs) hs =t3;
        return hs;
    }
    public int getAvg(){
        return (t1 + t2 + t3 )/3;
    }
        //toString runs automatically when you print an object
    //all objects get  a toString from parent object class
    //but you can make your own version
    public String toString(){
        String s = "Name:\t" + name;
        s+= "\nTest 1: \t"+t1;
        s+= "\nTest 2: \t"+t2;
        s+= "\nTest 3: \t"+t3;
        s+= "\n--------------";
        s+= "\nAverage: \t"+getAvg();
        return s;
    }
    public String validateData(){
        String em =null;
        if(name.equals("")) //then a name was not entered
            em ="Name is required.";
        if(t1<0 || t1>100 || t2<0 || t2>100 || t3<0 || t3>100){
            if(em==null) //there is no error
                em = "At least 1 mark is out of the accecptable range.";
            else //add on to the message with +=
                em+= "\nAt least 1 mark is out of the accecptable range.";
            if(em!=null) //then we have an error so add the following line after it
                em+= "\nPlease re-enter all the data\n"; 
        }
        return em; //return the error msg, either as null, or with a real message

    }
}

