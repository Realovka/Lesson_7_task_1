package com.company;

public class Civil extends Air {
    private int numberOfPassengers;
    private boolean businessClass;

    public Civil(int power, int maxSpeed, int weight, String model, int wingspan, int minRunwayLength, int numberOfPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public void description() {
        super.description();
        System.out.println(", кол-во пассажиров: "+numberOfPassengers+", наличие бизнес-класса: "+businessClass);
    }

    public void loading(int passengersOnBoard) {
        if (passengersOnBoard <= numberOfPassengers) {
            System.out.println("Самолет загружен");
            numberOfPassengers-=passengersOnBoard;
        } else {
            System.out.println("Столько человек самолет не вмещает, можно "+numberOfPassengers+" пассажиров");
    }
    }
}
