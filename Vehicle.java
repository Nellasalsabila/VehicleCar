package VVVCO;

public class Vehicle {
    int numbWheels;
    double price;

    public Vehicle() {
        super();
        numbWheels = 0;
        price = 0;

    }

    
    public int getNumbWheels(){
        return this.numbWheels;
    }
    public void setNumbWheels(int numbWheels){
        this.numbWheels = numbWheels;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void print() {
        System.out.println("numbWheels : " + numbWheels);
        System.out.println("price: " + price);
    }
}