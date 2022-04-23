import java.util.Objects;

public class Prostokat implements MoznaWyznaczycWielokrotnoscPrzekatnej, MoznaWyznaczycWysokosc{

    private double bok1, bok2;

    public Prostokat(double bok1, double bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public double przekatna() {
        return Math.sqrt((this.bok1*this.bok1) + (this.bok2*this.bok2));
    }

    @Override
    public double podstawa() {
        return this.bok1;
    }

    @Override
    public double katNachylenia() {
        return (Math.PI / 2);
    }

    @Override
    public double bok() {
        return this.bok2;
    }

    @Override
    public double wysokosc() {
        return this.bok2;
    }

    @Override
    public double wielokrotnoscPrzekatnej(double wsp) {
        return przekatna() * wsp;
    }

    @Override
    public int wielokrotnoscPrzekatnej(int wsp) {
        return (int) (przekatna() * wsp);
    }

    @Override
    public String toString() {
        return "prostokat";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prostokat other = (Prostokat) obj;
        if (Double.doubleToLongBits(bok1) != Double.doubleToLongBits(other.bok1))
            return false;
        if (Double.doubleToLongBits(bok2) != Double.doubleToLongBits(other.bok2))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;
        long temp;
        temp = Double.doubleToLongBits(bok1);
        hash = prime * hash + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bok2);
        hash = prime * hash + (int) (temp ^ (temp >>> 32));
        return hash;
    }
}
