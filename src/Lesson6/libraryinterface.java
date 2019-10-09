
package Lesson6;


public class libraryinterface {


    public static void main(String[] args) {
        Book b1,b2,b3,b4,b5;
        b1 = new Book("From Russia With Love","Greg Hines");
        b2 = new Book("Living Smart","Rita Langill");
        b3 = new Book("Singing in the rain","Harry Conner");
        b4 = new Book("Good Housekeeping","Pat Burns");
        b5 = new Book("To be a Model","Lisa Lahey");
        System.out.println("Here are the books available");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        Patron p = new Patron("Miles Davis");
        System.out.format("Lending 4 Books to %s",p.getName());
        System.out.println("");
        if(p.borrow(b1)) System.out.println(b1.getTitle() + " successfully borrowed.");
        else System.out.println(b1.getTitle() + " Could not be borrowed.");
        
        if(p.borrow(b2)) System.out.println(b2.getTitle() + " successfully borrowed.");
        else System.out.println(b2.getTitle() + " Could not be borrowed.");
        
        if(p.borrow(b3)) System.out.println(b3.getTitle() + " successfully borrowed.");
        else System.out.println(b3.getTitle() + " Could not be borrowed.");
        
        if(p.borrow(b4)) System.out.println(b4.getTitle() + " successfully borrowed.");
        else System.out.println(b4.getTitle() + " Could not be borrowed.");
        
        System.out.println("-----\nAttempting to return the first book: \n----------------");
        if(p.returnBook(b1)) System.out.println(b1.getTitle() + " is successfully retured.");
        else System.out.println(b1.getTitle() + " was not borrowed.");
        if(p.hasBook(b1)) System.out.println(b1);
        if(p.hasBook(b4)) System.out.println(b4);
        System.out.println("----\nHere is a list of books currently lent to " + p.getName() + "\n----");
        if(p.hasBook(b1)) System.out.println(b1);
        if(p.hasBook(b2)) System.out.println(b2);
        if(p.hasBook(b3)) System.out.println(b3);
        if(p.hasBook(b4)) System.out.println(b4);
        if(p.hasBook(b5)) System.out.println(b5);

        
    }
    
}
