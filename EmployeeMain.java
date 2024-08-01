class Employee{
    private String name;
    private String role;
    private double salary;

    public Employee(String name, String role, Double salary){
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void raise(double percent){
        salary = salary + salary * percent / 100;
    }
}

public class EmployeeMain{
    public static void main(String args[]){
        Employee e1 = new Employee("Rahul", "Software engineer", 60000.0);
        Employee e2 = new Employee("Runit", "Software developer", 70000.0);

        System.out.println("Employee details before raise : ");
        System.out.println("Name : " + e1.getName());
        System.out.println("Role : " + e1.getRole());
        System.out.println("Salary : " + e1.getSalary());
        System.out.println();

        System.out.println("Name : " + e2.getName());
        System.out.println("Role : " + e2.getRole());
        System.out.println("Salary : " + e2.getSalary());
        System.out.println();

        e1.raise(10);
        e2.raise(12);

        System.out.println("Employee details after raise: ");
        System.out.println("Name : " + e1.getName());
        System.out.println("Role : " + e1.getRole());
        System.out.println("Salary : " + e1.getSalary());
        System.out.println();

        System.out.println("Name : " + e2.getName());
        System.out.println("Role : " + e2.getRole());
        System.out.println("Salary : " + e2.getSalary());
    }
}