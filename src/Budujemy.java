import java.util.Scanner;

public class Budujemy {
	
	private static Scanner input2;

	public static void budujemy() {
		
		System.out.print("\nBudujemy, ino co?   "); Bajtlik.bajtlik();
		System.out.println("1) Chata drwala    --  1500  CBN   ->    genyruja 300   CBN na dobe");
		System.out.println("2) Kamienio³om     --  500   CBN   ->    genyruja 200   CBN na dobe");
		System.out.println("3) Tartak          --  3000  CBN   ->    genyruja 500   CBN na dobe");
		System.out.println("4) Kopalnia z³ota  --  5000  CBN   ->    genyruja 100   CBN na dobe");
		System.out.println("5) Mennica         --  10000 CBN   ->    genyruja 10000 CBN na dobe");
		System.out.println("6) Pieruna! Kaj ¿em wloz? jo chca spowrotym!");
		input2 = new Scanner(System.in);
		int j = input2.nextInt();

		
		switch(j) {
		case 1: System.out.println("Wybro³eœ chate drwala");
			Chalupa.buduj_chalupa();
				break;
		case 2: System.out.println("Wybro³eœ kamienio³om");
			Kamieniolom.buduj_kamieniolom();
				break;
		case 3: System.out.println("Wybro³eœ tartak");
			Tartak.buduj_tartak();
				break;
		case 4: System.out.println("Wybro³eœ kopalnie");
			Kopalnia.buduj_kopalnie();
				break;
		case 5: System.out.println("Wybro³eœ mennice");
			Mennica.buduj_mennice();
				break;
		case 6: System.out.println("Dobra, wracom sie juz!");
				Interfejs.gra();
		default: System.out.println("Jezusicku kaj mos ga³y? jeden seœæ ino mozes wybroæ! Toæ jo Ci godo³!");
				Budujemy.budujemy();
		

	}

}
}