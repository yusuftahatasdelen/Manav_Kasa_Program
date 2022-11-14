
import java.util.Scanner;
public class Odev2 {
    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5 ;
        Scanner inp = new Scanner(System.in);
        double armut, elma, domates, muz, patlican;
        System.out.print("Armut kg bilgisini giriniz : ");
        armut = inp.nextDouble();
        System.out.print("Elma kg bilgisini giriniz : ");
        elma = inp.nextDouble();
        System.out.print("Domates kg bilgisini giriniz : ");
        domates = inp.nextDouble();
        System.out.print("Muz kg bilgisini giriniz : ");
        muz = inp.nextDouble();
        System.out.print("Patlıcan kg bilgisini giriniz : ");
        patlican = inp.nextDouble();

        double toplamTutar = (armut*armutFiyat) + (elma*elmaFiyat) + (domates*domatesFiyat) + (muz*muzFiyat) + (patlican*patlicanFiyat);

        System.out.print("Toplam Tutar : "+ toplamTutar + " TL");
    }
}
