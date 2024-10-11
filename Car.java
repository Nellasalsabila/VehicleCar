package VVVCO;

public class Car extends Vehicle{
    int numDoors;
    boolean isElectic;

    public Car() {
        super();
        numDoors = 0;
        isElectic = (true);
    }
    public int getNumDoors(){
        return this.numDoors;
    }
    public void setP(int numDoors){
        this.numDoors = numDoors;
    }
    public boolean getI(){
        return this.isElectic;
    }
    public void setIsElectic(boolean isElectic){
        this.isElectic= isElectic;
    }
    
    public Car(int numDoors, boolean isElectic) {
        super(numbWheels, price);
        System.out.println("numDoors : " + numDoors);
        System.out.println("isElectic: " + isElectic);
    }
}
