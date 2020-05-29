package com.company;


public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger(100, 230, 3000, "Audi", 4, 8, "Hatchback", 2);
        Cargo cargo = new Cargo(2000, 210, 5000, "МАЗ", 4, 15, 5);
        Civil civil=new Civil(10000, 2000, 10000, "Airbus", 50, 4, 200, true);
        Military military=new Military(20000, 3000, 15000, "Bombers", 100, 6, true, 3);
        passenger.description();
        cargo.description();
        civil.description();
        military.description();
        passenger.distance(2.5);
        cargo.loading(3);
        cargo.loading(3);
        civil.loading(20);
        civil.loading(200);
        military.shot();
        military.shot();
        military.shot();
        military.shot();
        military.shot();
        military.bailout();
        military.bailout();


    }
}
