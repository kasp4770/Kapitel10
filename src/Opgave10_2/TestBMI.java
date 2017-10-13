package Opgave10_2; //Test af ny constructor

public class TestBMI {
    public static void main(String[] args) {

        BMI bmi1 = new BMI("Kasper Flensburg Petersen", 26, 73.5, 1.86 );
        System.out.println("BMI'en for " + bmi1.getName() + " er " + bmi1.getBMI() + " " + bmi1.getStatus() + "\n");

        BMI bmi2 = new BMI("Mogens Mogensen", 110, 2.10);
        System.out.println("BMI'en for " + bmi2.getName() + " er " + bmi2.getBMI() + " " + bmi2.getStatus() + "\n");

        //Opgave 10.2: Test af ny constructor
        BMI bmi3 = new BMI("Flemming Poulsen", 55, 100, 1, 90);
        System.out.println("BMI'en for " + bmi3.getName() + " er " + bmi3.getBMI() + " " + bmi3.getStatus() + "\n");

    }
}