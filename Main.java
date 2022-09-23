public class Main {
    public static void main(String[] args) {
        Motor hemi = new Motor("Dodge", "tfzh4rgfh43h8fc37", Motortipus.V, 8, 91, 104, Betoltes.KOMPRESSZOR, 2, 2, 702, 882);
        Auto Challenger = new Auto("Dodge", "Challenger", hemi, 2018, 70000000);

        Motor z22 = new Motor("GM", "z22senufvn", Motortipus.SOR, 4, 95, 86, Betoltes.SZIVO, 4, 2, 147, 203);
        Auto Coupe = new Auto("Opel", "Astra G", z22, 2003, 850000);

        System.out.println(Challenger);
        System.out.println(Coupe);
    }
}
