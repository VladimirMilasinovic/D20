package DomaciOOP3;

public class SefSmene extends Radnik{
    public SefSmene(int ID, String nazivRadnika, int godineIskustva, int plata) {
        super(ID, nazivRadnika, godineIskustva, plata);
    }
    public void stampa2(){
        if (godineIskustva>5){
            System.out.println("Kako " + this.nazivRadnika + " ima vise od " + this.godineIskustva + " godina iskustva, plata se uvecava za 20%, pa je umesto sadasnje " + this.plata + " sada " + (this.plata * 1.2) + " eura.");
        }else {
            System.out.println("Kako " + this.nazivRadnika + " ima manje od " + this.godineIskustva + " godine iskustva, pa je plata " + this.plata + " eura.");
        }
    }
}

