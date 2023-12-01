import media.*;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        System.out.println("Creazione elementi multimediali");
        for (int i = 0; i < 5; i++){

            Integer r;
            boolean continua = true;
            do {
                System.out.println("Elemento "+ (i+1));
                System.out.println("Che tipo di elemento vuoi creare?");
                System.out.println("0 -> Immagine");
                System.out.println("1 -> Registrazione Audio");
                System.out.println("2 -> Video");
                r = Integer.parseInt(sc.nextLine());

                switch (r) {
                    case 0 -> {
                        System.out.println("dammi titolo");
                        String titolo = sc.nextLine();
                        System.out.println("dammi luminosità");
                        int luminosita = Integer.parseInt(sc.nextLine());
                        Immagine img = new Immagine(titolo, luminosita);
                        elementi[i] = img;
                        continua = false;
                    }
                    case 1 -> {
                        System.out.println("dammi titolo");
                        String titolo = sc.nextLine();
                        System.out.println("dammi durata");
                        int durata = Integer.parseInt(sc.nextLine());
                        System.out.println("dammi volume");
                        int volume = Integer.parseInt(sc.nextLine());
                        RegistrazioneAudio reg = new RegistrazioneAudio(titolo, durata, volume);
                        elementi[i] = reg;
                        continua = false;
                    }
                    case 2 -> {
                        System.out.println("dammi titolo");
                        String titolo = sc.nextLine();
                        System.out.println("dammi durata");
                        int durata = Integer.parseInt(sc.nextLine());
                        System.out.println("dammi volume");
                        int volume = Integer.parseInt(sc.nextLine());
                        System.out.println("dammi luminosità");
                        int luminosita = Integer.parseInt(sc.nextLine());
                        Video v = new Video(titolo, durata, volume, luminosita);
                        elementi[i] = v;
                        continua = false;
                    }
                    default -> {

                    }
                }
            }while (continua);
        }
        int daEseguire;
        do{
            System.out.println("cosa vuoi eseguire? (1-5) oppure 0 per uscire");
            daEseguire = Integer.parseInt(sc.nextLine());
            if(daEseguire <= 0 || daEseguire > 5){
                continue;
            }
            ElementoMultimediale e = elementi[daEseguire-1];
            if(e instanceof Immagine){
                ((Immagine) e).show();
            }
            if (e instanceof RegistrazioneAudio || e instanceof Video){
                ((Riproducibile) e).play();
            }
        }while (daEseguire != 0);

        sc.close();
    }
}