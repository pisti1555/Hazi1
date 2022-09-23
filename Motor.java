public class Motor {
    private String gyarto;
    private String motorKod;
    private Motortipus elrendezes;
    private int hengerszam;
    private int hmagassag;
    private int hszelesseg;
    private Betoltes toltes;
    private int szelepszam;
    private int tengelyszam;
    private int hp;
    private int nm;

    public Motor(String gyarto, String motorKod, Motortipus elrendezes, int hengerszam, int hmagassag, int hszelesseg, Betoltes toltes, int szelepszam, int tengelyszam, int hp, int nm) {
        this.gyarto = gyarto;
        this.motorKod = motorKod;
        this.elrendezes = elrendezes;
        this.hmagassag = hmagassag;
        this.hszelesseg = hszelesseg;
        this.toltes = toltes;
        this.szelepszam = szelepszam;
        this.tengelyszam = tengelyszam;
    }

    @Override
    public String toString() {
        return "Gyarto: " + gyarto + '\n' +
                "Motorkod: " + motorKod + '\n' +
                "Hengerelrendezes: " + elrendezes + '\n' +
                "Hengerszam: " + hengerszam + '\n' +
                "Hengermagassag: " + hmagassag + '\n' +
                "Hengerszelesseg: " + hszelesseg + '\n' +
                "Betoltes: " + toltes + '\n' +
                "Szelepszam: " + szelepszam + '\n' +
                "Tengelyszam: " + tengelyszam + '\n' +
                "Teljesitmeny: " + hp + "HP " + nm + "NM ";
    }

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public String getMotorKod() {
        return motorKod;
    }

    public void setMotorKod(String motorKod) {
        this.motorKod = motorKod;
    }

    public Motortipus getElrendezes() {
        return elrendezes;
    }

    public void setElrendezes(Motortipus elrendezes) {
        this.elrendezes = elrendezes;
    }

    public int getHengerszam() {
        return hengerszam;
    }

    public void setHengerszam(int hengerszam) {
        this.hengerszam = hengerszam;
    }

    public int getHmagassag() {
        return hmagassag;
    }

    public void setHmagassag(int hmagassag) {
        this.hmagassag = hmagassag;
    }

    public int getHszelesseg() {
        return hszelesseg;
    }

    public void setHszelesseg(int hszelesseg) {
        this.hszelesseg = hszelesseg;
    }

    public Betoltes getToltes() {
        return toltes;
    }

    public void setToltes(Betoltes toltes) {
        this.toltes = toltes;
    }

    public int getSzelepszam() {
        return szelepszam;
    }

    public void setSzelepszam(int szelepszam) {
        this.szelepszam = szelepszam;
    }

    public int getTengelyszam() {
        return tengelyszam;
    }

    public void setTengelyszam(int tengelyszam) {
        this.tengelyszam = tengelyszam;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getNm() {
        return nm;
    }

    public void setNm(int nm) {
        this.nm = nm;
    }
}
