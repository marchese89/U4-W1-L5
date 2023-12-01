package media;

public abstract class ElementoMultimediale {
    private String titolo;

    ElementoMultimediale(String titolo){
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }
}
