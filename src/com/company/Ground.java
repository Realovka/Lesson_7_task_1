package com.company;

public class Ground extends Transport {
    private  int numberOfWheels;
    private  int fuelConsumption;

    public Ground(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void description() {
        super.description();
        System.out.print("кол-во колес: "+numberOfWheels+", расход топлива: "+fuelConsumption+", ");
    }
}
