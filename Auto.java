public class Auto {
    private String gyarto;
    private String tipus;
    private Motor motor;
    private int gyartasiEv;
    private int ar;

    public Auto(String gyarto, String tipus, Motor motor, int gyartasiEv, int ar) {
        this.gyarto = gyarto;
        this.tipus = tipus;
        this.motor = motor;
        this.gyartasiEv = gyartasiEv;
        this.ar = ar;
    }

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getGyartasiEv() {
        return gyartasiEv;
    }

    public void setGyartasiEv(int gyartasiEv) {
        this.gyartasiEv = gyartasiEv;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }
}
