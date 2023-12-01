package media;

public class Immagine extends ElementoMultimediale implements Luminoso{

    private int luminosita;

    public Immagine(String titolo,int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        this.luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        this.luminosita--;
    }

    private String mostraLuminosita(){
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < luminosita; i++){
            sb.append("*");
        }
        return sb.toString();
    }

    public void show(){
        System.out.println(getTitolo()+" "+mostraLuminosita());
    }
}
