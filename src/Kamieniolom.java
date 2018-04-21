import java.util.ArrayList;

public class Kamieniolom {
	
	static Kamieniolom kamienolomek = new Kamieniolom();
	static ArrayList<Kamieniolom> lista_kamieniolomkow = new ArrayList<Kamieniolom>();
	
	public static void buduj_kamieniolom() {
		if(Bajtlik.cebuliony>=500) {
		Bajtlik.koszt_kamieniolom();
		System.out.println("Zbudowano kamieniolom!");
			
		lista_kamieniolomkow.add(kamienolomek);
		}
		else {
			System.out.println("Z cym do ludzi? Bida w portfelu, za ma³o cebulionów! za ma³o cebulionów!\nNie staæ Ciê na kamieniolom, On kosztuje 500 CBN!");
			//System.out.println(lista_kamieniolomkow.size());
			Interfejs.gra();
		}
		
	}

}
