package com.company;

public class Cargo extends Ground {
    private int carryingCapacity;

    public Cargo(int power, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, int carryingCapacity) {
        super(power, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void description() {
        super.description();
        System.out.println(" грузоподъёмность: "+carryingCapacity);
    }

    public void loading(int cargoWeight){
        if (cargoWeight<=carryingCapacity){
            System.out.println("Грузовик загружен");
            carryingCapacity-=cargoWeight;
        } else {
            System.out.println("Столько загрузить нельзя, можно "+carryingCapacity+" тонн(ы)");
        }

    }
}
