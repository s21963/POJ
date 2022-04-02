package com.company;

public class Prostokat {

    double bok1;
    double bok2;

    public Prostokat(double bok1, double bok2) {
    }

    public double przekatna(){
        return Math.sqrt((this.bok2 * this.bok2) + (this.bok1 * this.bok1));
    }

    public double getBok2() {
        return bok2;
    }

    public void setBok2(double bok2) {
        this.bok2 = bok2;
    }

    public double getBok1() {
        return bok1;
    }

    public void setBok1(double bok1) {
        this.bok1 = bok1;
    }

    public double przekatna(double bok1) {
        return Math.sqrt(2*(bok1 * bok1));
    }


}
