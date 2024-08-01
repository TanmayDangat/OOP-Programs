class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }
}

public class DogMain{
    public static void main(String args[]){
        Dog d1 = new Dog("Tommy", "Labrador");
        Dog d2 = new Dog("Tuffy", "Pomerian");

        System.out.println("Before Update : ");
        System.out.println("Name : " + d1.getName());
        System.out.println("Breed : " + d1.getBreed());
        System.out.println();

        System.out.println("Name : " + d2.getName());
        System.out.println("Breed : " + d2.getBreed());
        System.out.println();

        System.out.println("After update : ");
        d1.setName("Ben");
        d1.setBreed("German Shefard");

        d2.setName("Keven");
        d2.setBreed("Husky");

        System.out.println("Name : " + d1.getName());
        System.out.println("Breed : " + d1.getBreed());
        System.out.println();

        System.out.println("Name : " + d2.getName());
        System.out.println("Breed : " + d2.getBreed());
    }
}