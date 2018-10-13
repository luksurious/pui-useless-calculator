package application;

public class CalculatorModel {
 private double accumulator = 0;
 public CalculatorModel(){
	 
 }
 
public CalculatorModel(double initValue){
	 this.accumulator = initValue;
 }

public double calculate (String operation,
		double data){//calculate
	switch (operation){//SW
		case "+":
		  accumulator += data;
		  break;
		case "-":
			accumulator -= data;
			break;
		case "*":
			accumulator *= data;
			break;
		case "/":
			accumulator /= data;
			break;
		case "":
			//Set accumulator value: there is not pending operation, so accumulator value must be set to data
			accumulator = data;
	}//SW
	return accumulator;
 }//calculate

//Getters
public double getAccumulator(){
	return this.accumulator;
}

}
