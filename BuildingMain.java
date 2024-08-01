import java.util.*;

class Building{
    String name;
    String address;
    int floors;
    double area;

    public Building(String name, String address, int floors, double area){
        this.name = name;
        this.address = address;
        this.floors = floors;
        this.area = area;
    }

    public void show(){
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Floors : " + floors);
        System.out.println("Area in sq.ft : " + area);
    }
}

class ResidentialBuilding extends Building{
    int no_of_apt;
    double rent;

    public ResidentialBuilding(String name, String address, int floors, double area, int no_of_apt, double rent){
        super(name, address, floors, area);
        this.no_of_apt = no_of_apt;
        this.rent = rent;
    }

    public double CalculateRent(){
        return no_of_apt * rent;
    }

    public void show(){
        super.show();
        System.out.println("Number of apartments : " + no_of_apt);
        System.out.println("Rent per apartments : " + rent);
        System.out.println("Total rent : " + CalculateRent());
    }
}

class CommercialBuilding extends Building{
    int no_of_offices;
    double rent;

    public CommercialBuilding(String name, String address, int floors, double area, double rent, int no_of_offices){
        super(name, address, floors, area);
        this.no_of_offices = no_of_offices;
        this.rent = rent;
    }

    public double CalculateRent(){
        return no_of_offices * rent;
    }

    public void show(){
        super.show();
        System.out.println("Number of offices : " + no_of_offices);
        System.out.println("Rent per office : " + rent);
        System.out.println("Total rent : " + CalculateRent());
    }
}

public class BuildingMain{
    public static void main(String args[]){
        ResidentialBuilding rb1 = new ResidentialBuilding("Anukul Residency", "Wakad", 12, 10000.0, 100, 20000);
        ResidentialBuilding rb2 = new ResidentialBuilding("Epic Society", "Wagholi", 14, 14000.0, 150, 20000);
        
        CommercialBuilding cb1 = new CommercialBuilding("Midas Tower", "Hinjewadi", 15, 12000, 10, 50000);
        CommercialBuilding cb2 = new CommercialBuilding("Eon Tower", "Kharadi", 25, 30000, 14, 90000);

        System.out.println("Residential Buildings : ");
        rb1.show();
        rb1.CalculateRent();
        System.out.println();

        rb2.show();
        rb2.CalculateRent();
        System.out.println();

        System.out.println("Commercial Buildings : ");
        cb1.show();
        cb1.CalculateRent();
        System.out.println();

        cb2.show();
        cb2.CalculateRent();

    }
}