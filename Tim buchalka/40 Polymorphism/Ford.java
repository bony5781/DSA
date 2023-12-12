public class Ford extends Car{
    // write code here
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }
    
    @Override
    public String startEngine(){
        return ("car's engine is starting of class " + this.getClass().getSimpleName());
    }
    
    @Override
    public String accelerate(){
        return ("car is accelarating of class " + this.getClass().getSimpleName());
    }
    
    @Override
    public String brake(){
        return ("car is braking of class " + this.getClass().getSimpleName());
    }
}