public abstract class Zabawka {
    private static int liczbaObiektow = 0;
    protected String nazwa;
    protected int cena;

    public Zabawka(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        liczbaObiektow++;
    }
    public Zabawka() {
        this.nazwa = "";
        this.cena = 0;
        liczbaObiektow++;
    }

    public String getNazwa() {
        return this.nazwa;
    }
    public int getCena() {
        return this.cena;
    }
    public static int getLiczbaObiektow(){
        return Zabawka.liczbaObiektow;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Zabawka{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
