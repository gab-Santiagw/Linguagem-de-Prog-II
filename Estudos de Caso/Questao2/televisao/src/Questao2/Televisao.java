package Questao2;
public class Televisao {
    private int polegadas;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal = 1;
    private boolean LigaDesliga = false;

    public Televisao(int polegadas, String marca, int voltagem, int canalInicial, int volume, int canal) {
        this.polegadas = polegadas;
        this.volume = volume; 
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = canalInicial;
    }
        public void setPolegadas(int polegadas) { this.polegadas = polegadas; }
    public int getPolegadas() { return polegadas; }

    public void setVolume(int volume) { this.volume = volume; }
    public int getVolume() { return volume; }

    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return marca; }

    public void setVoltagem(int voltagem) { this.voltagem = voltagem; }
    public int getVoltagem() { return voltagem; }
    
    public void setCanal(int canal) { this.canal = canal; }
    public int getCanal() { return canal; }

    public void ligar() {
        if (!LigaDesliga) {
            LigaDesliga = true;
            System.out.print("A televisão foi ligada.");
        } else {
            System.out.print("A televisão já está ligada.");
        }
    }

    public void desligar() {
        if (LigaDesliga) {
            LigaDesliga = false;
            System.out.print("A televisão foi desligada.");
        } else {
            System.out.print("A televisão já está desligada.");
        }
    }

    public void aumentarVolume() {
        if (LigaDesliga) {
            if (volume != 10) {
                ++volume;
                System.out.print("Volume: " + volume);
            } else if (volume == 10) {
                System.out.print("Volume já está no máximo.");
            }
        } else {
            System.out.print("Ligue a televisão primeiro.");
        }
    }

    public void diminuirVolume() {
        if (LigaDesliga) {
            if (volume != 1) {
                --volume;
                System.out.print("Volume: " + volume);
            } else if (volume==1) {
                System.out.print("Volume já está no mínimo.");
            }
        } else {
            System.out.print("Ligue a televisão primeiro.");
        }
    }

    public void subirCanal() {
        if (LigaDesliga) {
            canal++;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("Ligue a televisão primeiro.");
        }
    }

    public void descerCanal() {
        if (LigaDesliga) {
            canal--;
            if (canal < 1) canal = 1;
            System.out.print("Canal: " + canal);
        } else {
            System.out.print("Ligue a televisão primeiro.");
        }
    }
}