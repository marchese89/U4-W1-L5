package media;

public class Immagine extends ElementoMultimediale implements Luminoso{

    int luminosita;

    Immagine(String titolo) {
        super(titolo);
        this.luminosita = 5;
    }

    @Override
    public void aumentaLuminosita() {
        this.luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        this.luminosita--;
    }

    private String stampaLuminosita(){
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < luminosita; i++){
            sb.append("*");
        }
        return sb.toString();
    }

    public void show(){
        System.out.println(getTitolo()+" "+stampaLuminosita());
    }
}
