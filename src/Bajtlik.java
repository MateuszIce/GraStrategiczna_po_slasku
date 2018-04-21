
public class Bajtlik {
	
	public static int cebuliony = 2000;
	
	public static void bajtlik() {
		System.out.println("Aktualnie mosz "+cebuliony+" CBN");
	}
	public static void koszt_chalupa() {
		cebuliony=cebuliony-1500;
	}
	public static void koszt_kamieniolom() {
		cebuliony=cebuliony-500;
	}
	public static void koszt_tartak() {
		cebuliony=cebuliony-3000;
	}
	public static void koszt_kopalnia() {
		cebuliony=cebuliony-5000;
	}
	public static void koszt_mennica() {
		cebuliony=cebuliony-10000;
	}
	public static void przychod_chalupa() {
		cebuliony=cebuliony+300;
	}
	public static void przychod_kamieniolom() {
		cebuliony=cebuliony+200;
	}
	public static void przychod_tartak() {
		cebuliony=cebuliony+500;
	}
	public static void przychod_kopalnia() {
		cebuliony=cebuliony+100;
	}
	public static void przychod_mennica() {
		cebuliony=cebuliony+3000;
	}
	

}
