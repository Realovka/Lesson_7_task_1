package com.company;

public class Passenger extends Ground {
    private String bodyType;
    private int numberOfPassengers;

    public Passenger(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("тип кузова: "+bodyType+", кол-во пассажиров: "+numberOfPassengers);
    }

    private double consumption(double t){
        return getFuelConsumption()*t*getMaxSpeed()/100;
    }

    public void distance(double t){
        System.out.println("За время "+t+" часа, автомобиль "+getModel()+" двигаясь с максимальной скоростью "+getMaxSpeed()+
                " км/ч проедет "+t*getMaxSpeed()+" км и израсходует "+consumption(t)+" литров");

    }
}
