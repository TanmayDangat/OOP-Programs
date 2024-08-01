abstract class Student{       // Creation of Abstract class
    private String name;      // Encapsulation
    private int num;
    
    abstract void Write();    // Creation of Abstract method
    
    public Student(String name, int num){  // Creation of constructor
        this.name = name;
        this.num = num;
    }
    
    // Getter and setter method
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public int getNum(){
        return num;
    }
    
}

// Concept of inheritance
 class Student1 extends Student{
    public Student1(String name, int num){
        super(name, num);
    }
    
    public void display(){
        System.out.println("Student1 name : " + getName());
        System.out.println("Student1 number : " + getNum());
    }
    
    @Override           // Runtime Polymorphism
    void Write(){
        System.out.println("Writing an essay");
        System.out.println();
    }
}
 
 class Student2 extends Student{
    public Student2(String name, int num){
        super(name, num);
    }
     
    public void display(){
        System.out.println("Student2 name : " + getName());
        System.out.println("Student2 number : " + getNum());
    }
    
    @Override           // Runtime Polymorphism
    void Write(){
        System.out.println("Writing a poem");
    }
}
 
public class StudentMain{
    public static void main(String args[]){
        Student1 s1 = new Student1("Runit", 1);
        Student2 s2 = new Student2("Rahul", 2);
        s1.display();
        s1.Write();
        s2.display();
        s2.Write();
    }
}