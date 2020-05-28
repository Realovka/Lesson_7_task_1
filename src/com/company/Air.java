package com.company;

public class Air extends Transport {
    private  int wingspan;
    private int minRunwayLength;

    public Air(int power, int maxSpeed, int weight, String model, int wingspan, int minRunwayLength) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    @Override
    public void description() {
        super.description();
        System.out.print("размах крыльев: "+wingspan+", мин длина взлётно-посадочной полосы: "+minRunwayLength);
    }
}
