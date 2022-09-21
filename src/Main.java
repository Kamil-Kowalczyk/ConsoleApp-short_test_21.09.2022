public class Main {
    public static void main(String[] args) {
        Pluszak pluszak = new Pluszak("Tedy Bear", 120, 20);
        System.out.println(pluszak.toString());

        Klocki klocki = new Klocki("LEGO Technic", 399, 461);
        System.out.println(klocki.toString());

        System.out.println(Zabawka.getLiczbaObiektow());
    }
}