package SDA_26_01;

public class R_osobisty {
    long nrKonta;
    int nip;
    int pesel;

    public R_osobisty(long nrKonta, int nip, int pesel) {
        this.nrKonta = nrKonta;
        this.nip = nip;
        this.pesel = pesel;
    }

    public long getNrKonta() {
        return nrKonta;
    }

    public void setNrKonta(long nrKonta) {
        this.nrKonta = nrKonta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}
