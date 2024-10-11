package VVVCO;
public class Bicyle extends Vehicle {
    String BikeType;
    public Bicyle(){
        super();
        BikeType ="";  
    }
    public String getBikeType(){
        return this.BikeType;
    }
    public void setNumbWheels(String BikeType){
        this.BikeType = BikeType;
    }
    
    public Bicyle(String BikeType){
        System.out.println("BikeType: " + BikeType);
        
    }
}
