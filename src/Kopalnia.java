import java.util.ArrayList;

public class Kopalnia {

	static Kopalnia kopalnia = new Kopalnia();
	static ArrayList<Kopalnia> lista_kopalnia = new ArrayList<Kopalnia>();
		static public void buduj_kopalnie() {
			if(Chalupa.lista_chatek.size()>0) {
				if(Kamieniolom.lista_kamieniolomkow.size()>0) {
					if(Bajtlik.cebuliony>=5000) {
						Bajtlik.koszt_kopalnia();
						System.out.println("Zbudowano kopalnie!");
						
						lista_kopalnia.add(kopalnia);
						
					}
					else {
						System.out.println("Z cym do ludzi? Bida w portfelu, za ma³o cebulionów!\nNie staæ Ciê na kopalnie, Ona kosztuje 5000 CBN!");
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
