package com.company;

public class Military extends Air {
    private boolean bailoutSystem;
    private int numberOfRockets;

    public Military(int power, int maxSpeed, int weight, String model, int wingspan, int minRunwayLength, boolean bailoutSystem, int numberOfRockets) {
        super(power, maxSpeed, weight, model, wingspan, minRunwayLength);
        this.bailoutSystem = bailoutSystem;
        this.numberOfRockets = numberOfRockets;
    }

    @Override
    public void description() {
        super.description();
        System.out.println(", система катапультирования: "+bailoutSystem+", кол-во ракет: "+numberOfRockets);
    }
    public void shot(){
        if (numberOfRockets>0){
            System.out.println("Ракета пошла...");
            numberOfRockets-=1;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void bailout(){
        if (bailoutSystem==true){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
