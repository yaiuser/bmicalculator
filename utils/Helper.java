package BMICalculator.utils;

public class Helper {
    // showMainMenu is a public static method, doesn't return a value
    public static void showMainMenu(){
        System.out.println("*--- ::Check your BMI:: ---*");
        System.out.println("*--- ::Select an option:: ---*");
        System.out.println("*--- ::a. Calculate your BMI:: ---*");
        System.out.println("*--- ::b. Exit program :: ---*");
        System.out.println("******************************");
    }

    // showGradeMenu is a public static method, doesn't return a value
    public static void askHeight(){
        System.out.println("*--- ::Enter your height   :: ---*");
        System.out.println("******************************");
    }

    public static void askWeight(){
        System.out.println("*--- ::Enter your weight   :: ---*");
        System.out.println("******************************");
    }

    // showGradeFeedback is a public static method, that takes in ONE PARAMETER
    public static void showBMI(String BMI){
        System.out.println("*--- ::BMI result    :: ---*");
        System.out.println(BMI);
    }

    public static void wrongInput() {
        System.out.println("Wrong Input");

    }
}
