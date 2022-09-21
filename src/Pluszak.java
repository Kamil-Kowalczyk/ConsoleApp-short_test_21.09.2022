public class Pluszak extends Zabawka{
    private int rozmiar;

    public Pluszak(String nazwa, int cena, int rozmiar) {
        super(nazwa, cena);
        this.rozmiar = rozmiar;
    }
    public Pluszak() {
        super();
        this.rozmiar = 0;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    @Override
    public String toString() {
        return "Pluszak{" +
                "rozmiar=" + rozmiar +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
