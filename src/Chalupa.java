import java.util.ArrayList;

public class Chalupa {
	
	static Chalupa chatka = new Chalupa();
	static ArrayList<Chalupa> lista_chatek = new ArrayList<Chalupa>();

	public static void buduj_chalupa() {
		if(Bajtlik.cebuliony>=1500) {
		Bajtlik.koszt_chalupa();
		System.out.println("Zbudowano chatke drwala!");
		
		lista_chatek.add(chatka);
		
	}
		else {
			System.out.println("Z cym do ludzi? Bida w portfelu, za ma³o cebulionów!\nNie staæ Ciê na chatkê drwala, Ona kosztuje 1500 CBN!");
			//System.out.println(lista_chatek.size());
			Interfejs.gra();
		}
		
}
}