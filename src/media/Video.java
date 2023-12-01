package media;

public class Video extends ElementoMultimediale implements Riproducibile, Luminoso{

    private int luminosita;
    private int volume;
    private int durata;
    public Video(String titolo,int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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

    @Override
    public void play() {
        for (int i = 0; i < durata; i++){
            System.out.println(this.getTitolo()+" "+mostraVolume()+" "+mostraLuminosita());
        }
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    }

    @Override
    public void abbassaVolume() {
        this.volume--;
    }

    private String mostraLuminosita(){
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < luminosita; i++){
            sb.append("*");
        }
        return sb.toString();
    }

    private String mostraVolume(){
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < volume; i++){
            sb.append("!");
        }
        return sb.toString();
    }
}
