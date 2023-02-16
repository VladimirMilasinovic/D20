package DomaciOOP3;

public class Investitor extends Radnik{
    int brojZgrada;

    public Investitor(int ID, String nazivRadnika, int godineIskustva, int plata, int brojZgrada) {
        super(ID, nazivRadnika, godineIskustva, plata);
        this.brojZgrada = brojZgrada;
    }
    public void stampa1(){
        if (brojZgrada>5){
            System.out.println("Investitor je podigao vise od 5 zgrada, pa mu je na trenutnu platu od " + this.plata + " eura, dodato jos 30% na platu, pa je sada plata " + (this.plata * 1.3) + " eura.");
        }else {
            System.out.println("Investitor je podigao manje od 5 zgrada, pa mu je plata " + this.plata + " eura.");
        }
    }
}
