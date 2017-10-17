package Opgave10_4;

public class MyPoint {

    private double x;
    private double y;

    //No-arg Constructor
    public MyPoint(){
        double x = 0;
        double y = 0;
    }
    //Constructor that creates a specified point
    public MyPoint (double x, double y){
        this.x = x;
        this.y = y;
    }
    //Get x
    public double getX(){
        return x;
    }

    //Get y
    public double getY(){
        return y;
    }

    //get metode som retunerer distancen mellem x og y
    public double distance(){
        double z = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        return z;
    }

    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) +
                Math.pow(myPoint.getY() - y, 2));
    }

    public double distance (double x, double y){
        return distance(new MyPoint(x, y));
    }
}
