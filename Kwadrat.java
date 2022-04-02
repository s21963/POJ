package com.company;

public class Kwadrat extends Prostokat {
    double bok1;

    public Kwadrat(double bok1, double bok11) {
        super(bok1, bok11);
    }

    public Kwadrat(double bok1) {
        super(bok1, bok1);
    }

    public double getBok1() {
        return bok1;
    }

    public void setBok1(double bok1) {
        this.bok1 = bok1;
    }
}
