class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

public class PersonMain{
    public static void main(String args[]){
        Person p1 = new Person("Rahul", 22);
        Person p2 = new Person("Runit", 21);

        System.out.println("Person 1 Details : ");
        System.out.println("Name : " + p1.getName());
        System.out.println("Age : " + p1.getAge());
        System.out.println();

        System.out.println("Person 2 Details : ");
        System.out.println("Name : " + p2.getName());
        System.out.println("Age : " + p2.getAge());
    }
}