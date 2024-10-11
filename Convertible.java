package VVVCO;
public class Convertible extends Car {
    String roofType;
    public Convertible(){
        super();
        roofType ="";
    }
        public String roofType(){
        return this.roofType();
    }
    public void setNumbWheels(String roofType){
        this.roofType= roofType;
    }

    public Convertible(String roofType){
        
        System.out.println("roofType : " + roofType);
    }

}