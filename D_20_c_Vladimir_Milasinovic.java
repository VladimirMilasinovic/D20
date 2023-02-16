package DomaciOOP3;

public class Main {
    public static void main(String[] args) {
//        Zadatak 1.
//Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata. Klase Fizikalac, SefSmene i Investitor nasledjuju klasu Radnik.
// Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
// Istampati njihove podatke sa tim da racunamo 20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.
        Radnik r1 = new Radnik(555,"Investitor", 10, 500);
        Radnik r2 = new Radnik(333, "SefSmene", 3, 400);
        Radnik r3 = new Radnik(111, "Fizikalac", 7,300);

        Investitor i1 = new Investitor(r1.ID, r1.nazivRadnika, r1.godineIskustva, r1.plata, 6);
        SefSmene s1 = new SefSmene(r2.ID, r2.nazivRadnika, r2.godineIskustva, r2.plata);
        Fizikalac f1 = new Fizikalac(r3.ID, r3.nazivRadnika, r3.godineIskustva, r3.plata);
        i1.stampa1();
        s1.stampa2();
        f1.stampa3();
    }
}
