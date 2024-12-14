package BMICalculator.calculator;

public class Calculator {

    double height;
    double weight;

    public Calculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public String getBMI() {

        double BMI = this.weight/(this.height*this.height);
        String msg = "Your BMI is: " + BMI;
        String msg2 = "You are ";
        String result;

        if(BMI <= 24.9) {
            result = "normal.";
        } else if (BMI> 24.9 && BMI < 30) {
            result = "overweight.";
        } else{
            result = "obese";
        }

        return(msg + "\n" + msg2 + result);
    }


}
