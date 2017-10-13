package Opgave10_2; //Ny constructor til BMI klassen

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    //Constructors
    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height){
        this(name, 20, weight, height);
    }

    //Opgave 10.2: Ny Constructor med specificeret navn, alder, vægt, højde i meter og højde i cm
    public BMI(String name, int age, double weight, double mtr, double cm){
        this(name, age, weight, mtr + (cm / 100));
    }

    //Get metoder
    public double getBMI(){
        double bmi = weight / (height*height);
        return Math.round(bmi); //runder resultat 'bmi' op eller ned/til nærmeste hele tal.
    }

    public String getStatus(){
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Undervægtig";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overvægtig";
        else
            return "Fed";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

}