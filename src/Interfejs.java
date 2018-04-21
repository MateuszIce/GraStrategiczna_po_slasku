import java.util.Scanner;

public class Interfejs {
			
	private static Scanner input;
	private static Scanner namaewa;

	public static void powitojcie() {
		
		namaewa = new Scanner(System.in);
		System.out.println("Powiedz no mi synek, jok jo sie mam do Ciebie zwracoæ?");
		String imie = namaewa.nextLine();
		System.out.println("A witom Ciebie "+imie+". Jako ¿ech je dobri kompjuter to doja ja Ci na rozkryncenie 2000 CBN\n We¿mij te cebuilony i bow sie przydnio!");
		String name = imie;

	}
	
	public static void gra() {
		System.out.println("\nNo kuliga! Co robiemy? Mosz pore opcyji do wyboru:");
		System.out.println("1) Rozkryncomy fitulityngeszeft!");
		System.out.println("2) Wejrzij do bajtlika!");
		System.out.println("3) Wejrzij do heftu!");
		System.out.println("4) Zafilokuj! Nabako³ech sie dzisiok!");
		System.out.println("5) £odfilokuj! Kaj jo to do³?");
		System.out.println("6) Ajnfartny³a doba -> fuknonæ ³o 24h i dostoæ piniondze");
		System.out.println("7) Pieruna, nie robia! Leza do dóma! Szlus! Fajrant!");
		input = new Scanner(System.in);
		int i = input.nextInt();
		
		switch(i) {
		case 1: Budujemy.budujemy();
		case 2: Bajtlik.bajtlik();
				Interfejs.gra();
		case 3: 
				int dochod_chata = (Chalupa.lista_chatek.size())*300;
				int dochod_kamieniolom = (Kamieniolom.lista_kamieniolomkow.size())*200;
				int dochod_tartak = (Tartak.lista_tartak.size())*500;
				int dochod_kopania= (Kopalnia.lista_kopalnia.size())*100;
				int dochod_mennica= (Mennica.lista_mennica.size())*3000;
				int dochod= dochod_chata + dochod_kamieniolom + dochod_tartak + dochod_kopania + dochod_mennica;
				Integer.toString(dochod);
				System.out.println("Iloœæ chatek drwala: "+Chalupa.lista_chatek.size()+" one generujo "+(Chalupa.lista_chatek.size())*300+" CBN przichodu na dobe!");
				System.out.println("Iloœæ kamieniolomow: "+Kamieniolom.lista_kamieniolomkow.size()+" one generujo "+(Kamieniolom.lista_kamieniolomkow.size())*200+" CBN przichodu na dobe!");
				System.out.println("Iloœæ tartaków:      "+Tartak.lista_tartak.size()+" one generujo "+(Tartak.lista_tartak.size())*500+" CBN przichodu na dobe!");
				System.out.println("Iloœæ kopalni z³ota: "+Kopalnia.lista_kopalnia.size()+" one generujo "+(Kopalnia.lista_kopalnia.size())*100+" CBN przichodu na dobe!");
				System.out.println("Iloœæ mennic:        "+Mennica.lista_mennica.size()+" one generujo "+(Mennica.lista_mennica.size())*3000+" CBN przichodu na dobe!");
				System.out.println("Twoje ca³kowite dobowe przichody kszta³tujo sie na poziumie "+dochod+" CBN na jedne dobe!");
				Interfejs.gra();
			break;
		case 4:	System.out.println("Ni ma ale bydzie ino pozniej");
				Interfejs.gra();
		case 5: System.out.println("Ni ma ale bydzie ino pozniej");
				Interfejs.gra();
		case 6: Pracuj.pracuj();
				Pracuj.przemijanie(); System.out.print(", cebulionów przybywo! "); Bajtlik.bajtlik(); System.out.println("");
				Interfejs.gra();
		case 7: System.out.println("Pieruna, to leca! Zostawiom ten bajzyl\n\n GEJM O£WER, PRZEGRO£EŒ!");
			System.exit(0);
			break;
		default: System.out.println("Jezusicku kaj mos ga³y? jeden do siedem ino mozes wybroæ! Toæ jo Ci godo³!");
				 Interfejs.gra();
		}
		

	}

}
