public class SimpleCalculator {
    // write code here
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber(){
        return firstNumber;
    }
    
    public void setFirstNumber(double number){
        this.firstNumber = number;
    }
    
    public double getSecondNumber(){
        return secondNumber;
    }
    
    public void setSecondNumber(double number){
        this.secondNumber = number;
    }
    
    public double getAdditionResult(){
        return this.firstNumber +  this.secondNumber;
    }
    
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    
    public double getDivisionResult(){
        if(this.secondNumber == 0) return 0;
        return this.firstNumber / this.secondNumber;
    }
    
}