package media;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile{

    private int volume;
    private int durata;
    RegistrazioneAudio(String titolo,int durata) {
        super(titolo);
        this.volume = 5;
        this.durata = durata;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++){
            System.out.println(this.getTitolo()+" "+mostraVolume());
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

    private String mostraVolume(){
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < volume; i++){
            sb.append("!");
        }
        return sb.toString();
    }
}
