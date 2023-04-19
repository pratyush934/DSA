import java.util.*;


public class OOPS {
    public static void main(String args[]){
        
        //PEN
        /* 
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        */

        //BANKACCOUNT
        /* 
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Pratyush";
        //myAcc.password = "XYZ";
        myAcc.setPassword("XYZ");
        */

        //STUDENT 
        /*  
        Student s1 = new Student();
        s1.name = "Pratyush";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 90;
        // Student s2 = new Student(145);
        // Student s3 = new Student("Pratyush");
        // Student s4 = new Student("Hey",125);

        Student s5 = new Student(s1);
        s5.password = "xyz";
        s1.marks[2] = 100;

        for(int i=0;i<3;i++){
            System.out.print(s1.marks[i]+" ");
        }
        */
    /* 
       Fish shark = new Fish();
       shark.swim();        //HERITENCE
       shark.wings = 5;
       System.out.println(shark.wings);
       shark.eat();
     */
    
    /* 
     Calculator calc = new Calculator();
     System.out.println(calc.sum(5, 6));
     System.out.println(calc.sum(5.00, 3.00));
     System.out.println(calc.sum(5, 3, 4));
     */

    /* 
    Deer d = new Deer();
    d.eat();
    */

    /* 
    Queen q = new Queen();
    q.moves();
    Rooks r = new Rooks();
    r.moves();
    */

    /* 
    Students s1 = new Students();
    s1.schoolName = "ABC";

    Students s2 = new Students();
    System.out.println(s2.schoolName);
    */

        
    }
} 
//STATIC
class Students{
    String name;
    int roll;

    static String schoolName; //CONSTANT FOR EVERY STUDENT

    void setName(String name){
        this.name = name;
    }
    void setRoll(int roll){
        this.roll = roll;
    }
}

//INTERFACES 
 
interface Hervivores{
void eats();

}
interface Carnivores{
void eats();

}

class Bear implements Hervivores,Carnivores{

}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down ,right,left, diagonal(in all 4 dirxn)");
    }
}
class Rooks implements ChessPlayer{
    public void moves(){
        System.out.println("Kya karoge Jaan kar");
    }
}
//ANIMAL
class Animals{
    void eat(){
        System.out.println("Eat");
    }
}
class Deer extends Animals{
    void eat(){
        System.out.println("Eat Grass");
    }
}
//CALCULATOR
class Calculator {
    int sum(int a,int b){
        return a+b;
    }
    double sum(double a,double b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
//HERITENCE
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int wings;

    void swim(){
        System.out.println("Swim");
    }


}

class Student {
    String name;
    int age;
    String password;
    int marks[];
    int roll;


    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

    }
    
    Student(String name){
        marks = new int[3];

        this.name = name;
    }
    Student(int roll){
        marks = new int[3];

        this.roll = roll;
    }

    Student(){
        marks = new int[3];

        System.out.println("Constructor is difficult to understand..");
    }
    Student(String name,int roll){
        marks = new int[3];

        this.name = name;
        this.roll = roll;
    }
}

    

 

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}


class Pen{
   private String color;
   private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
        // "this" IS USED WHEN THERE ARE MORE THAN ONE VARIABLES 
         // WITH SAME NAME 

    void setColor(String color){
        this.color = color; //OBSERVE CARE-FULLY
    }
            
    void setTip(int tip){
        this.tip = tip; //OBSERVE CARE-FULLY
    }
}



