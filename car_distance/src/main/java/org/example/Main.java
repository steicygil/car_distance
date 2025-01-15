package org.example;

public class Main {
    public static void main(String[] args) {
        //V1 = 90 km/h; V2 = 110 km/h; S = 65 km; T = 3 h  =>  Distance = 665 km
        //V1 = 65.5 km/h; V2 = 90.4 km/h; S = 20.9 km; T = 1.5 h  =>  Distance = 254.75 km
        //V1 = 70 km/h; V2 = 85.6 km/h; S = 32.6 km; T = 2 h  =>  Distance = 343.8 km
        double v1 = 65.5;
        double v2 = 90.4;
        double s = 20.9;
        double t = 1.5;
        double distance = LinearCalculation.findCarsDistance(v1,v2,s,t);
        System.out.println("V1="+v1+ "km/h, "+"V2="+v2+ "km/h, "+"S="+s+ "km, "+"T="+t+ "h, "+ "Distance =>"+String.format("%.2f", distance));
    }
}