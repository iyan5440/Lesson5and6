
package Lesson6;

public class Book {
    private String author; //create 5 books
    private String title; // tostring to tell details of book

    public Book( String t,String a){
        
        author = a;
        title = t;
    }
    public String toString(){
        String s = "Name:\t" + author;
        s+="\nTitle:\t" + title;
        return s;
    }
    public String getTitle(){
        return title;
    }
    
}
