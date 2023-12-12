public class Car {
    // write code here
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }
    
    public String startEngine(){
        return ("car's engine is starting of class " + this.getClass().getSimpleName());
    }
    
    public String accelerate(){
        return ("car is accelarating of class " + this.getClass().getSimpleName());
    }
    
    public String brake(){
        return ("car is braking of class " + this.getClass().getSimpleName());
    }
    
    public int getCylinders(){
        return cylinders;
    }
    
    public String getName(){
        return name;
    }
}