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
						System.out.println("Z cym do ludzi? Bida w portfelu, za ma�o cebulion�w!\nNie sta� Ci� na kopalnie, Ona kosztuje 5000 CBN!");
						Interfejs.gra();
					}
					
				}
				else {
					System.out.println("Napierw musisz mie� kamienio�om!");
					Interfejs.gra();
				}
				
			}
			else {
				System.out.println("Napierw musisz mie� chatk� drwala!");
				Interfejs.gra();
			}			
		}
}
