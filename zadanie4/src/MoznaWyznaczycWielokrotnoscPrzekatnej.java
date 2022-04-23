public interface MoznaWyznaczycWielokrotnoscPrzekatnej extends MoznaWyznaczycPrzekatna{

    double wielokrotnoscPrzekatnej(double wsp);
    int wielokrotnoscPrzekatnej(int wsp);

    @Override
    double przekatna();

    @Override
    double podstawa();

    @Override
    double katNachylenia();

    @Override
    double bok();
}
