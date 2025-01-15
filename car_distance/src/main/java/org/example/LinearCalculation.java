package org.example;

public class LinearCalculation {

    public LinearCalculation() {

    }

    public static double findCarsDistance(double car1Speed, double car2Speed, double initialDistance, double time){
        double d1=  car1Speed*time;
        double d2=  car2Speed*time;
        return initialDistance + d1 +d2;
    }

}
