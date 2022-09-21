public class Klocki extends Zabawka{
    private int liczbaElementow;

    public Klocki(String nazwa, int cena, int liczbaElementow) {
        super(nazwa, cena);
        this.liczbaElementow = liczbaElementow;
    }
    public Klocki() {
        super();
        this.liczbaElementow = 0;
    }

    public int getLiczbaElementow() {
        return liczbaElementow;
    }

    public void setLiczbaElementow(int liczbaElementow) {
        this.liczbaElementow = liczbaElementow;
    }

    @Override
    public String toString() {
        return "Klocki{" +
                "liczbaElementow=" + liczbaElementow +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
