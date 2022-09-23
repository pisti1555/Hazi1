public class Main {
    public static void main(String[] args) {
        Motor hemi = new Motor("Dodge", "tfzh4rgfh43h8fc37", Motortipus.V, 8, 91, 104, Betoltes.KOMPRESSZOR, 2, 2, 702, 882);
        Auto Challenger = new Auto("Dodge", "Challenger", hemi, 2018, 70000000);

        System.out.println(Challenger);
    }
}
