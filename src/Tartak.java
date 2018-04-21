import java.util.ArrayList;

public class Tartak {
	
	static Tartak tartaczek = new Tartak();
	static ArrayList<Tartak> lista_tartak = new ArrayList<Tartak>();

	public static void buduj_tartak() {
		if(Chalupa.lista_chatek.size()>0) {
			if(Kamieniolom.lista_kamieniolomkow.size()>0) {
				if(Bajtlik.cebuliony>=3000) {
					Bajtlik.koszt_tartak();
					System.out.println("Zbudowano tartak!");
					
					lista_tartak.add(tartaczek);
					
				}
				else {
					System.out.println("Z cym do ludzi? Bida w portfelu, za ma³o cebulionów!\nNie staæ Ciê na tartak, On kosztuje 3000 CBN!");
					Interfejs.gra();
				}
				
			}
			else {
				System.out.println("Napierw musisz mieæ kamienio³om!");
				Interfejs.gra();
			}
			
		}
		else {
			System.out.println("Napierw musisz mieæ chatkê drwala!");
			Interfejs.gra();
		}
}
}
