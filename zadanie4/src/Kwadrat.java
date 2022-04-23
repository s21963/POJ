public class Kwadrat extends Prostokat implements MoznaWyznaczycPrzekatna{

    public Kwadrat(double bok1, double bok2) {
        super(bok1, bok2);
    }

    public Kwadrat(double bok1) {
        super(bok1, bok1);
    }


    @Override
    public String toString() {
        return "kwadrat";
    }


}
