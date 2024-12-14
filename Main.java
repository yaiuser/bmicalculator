package BMICalculator;
import BMICalculator.calculator.Calculator;
import BMICalculator.utils.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char option; //store user options
        double height; //stores the user height
        double weight; //stores the user's weight
        Scanner scanner = new Scanner(System.in); //Scanner for user input

        do{                         // do-while user input is not 'b' (exit program)

           Helper.showMainMenu();
            option = scanner.next().charAt(0);
            if(option != 'a' && option != 'b'){
                Helper.wrongInput();
                continue;
            }

            if(option == 'b')                       // if b option is enabled break to discontinue
                break;

            Helper.askHeight();
            height =  scanner.nextDouble();

            Helper.askWeight();

            weight = scanner.nextDouble();

            Calculator calculate = new Calculator(height, weight);
            Helper.showBMI(calculate.getBMI());
            System.out.println("******************************");

        }while (option != 'b');


    }
}