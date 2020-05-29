package com.company;

public class Transport {
    private int horsePower;
    private int maxSpeed;
    private int weight;
    private String model;

    public Transport(int power, int maxSpeed, int weight, String model) {
        this.horsePower = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

   private double power (){
        return horsePower*0.74;
   }

   public void description (){
       System.out.print("Мощность в лошадиных силах: "+horsePower+", максимальная скорость: "+maxSpeed+", масса: "+weight+", модель: "+model+", мощность в кВ:"+power()+", ");
   }
}
