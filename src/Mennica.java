import java.util.ArrayList;

public class Mennica {
	
	static Mennica mennica = new Mennica();
	static ArrayList<Mennica> lista_mennica = new ArrayList<Mennica>();
		static public void buduj_mennice() {
			if(Chalupa.lista_chatek.size()>0) {
				if(Kamieniolom.lista_kamieniolomkow.size()>0) {
					if(Bajtlik.cebuliony>=10000) {
						Bajtlik.koszt_mennica();
						System.out.println("Zbudowano mennice!");
						
						lista_mennica.add(mennica);
						
					}
					else {
						System.out.println("Z cym do ludzi? Bida w portfelu, za ma³o cebulionów!\nNie staæ Ciê na mennice, Ona kosztuje 10000 CBN!");
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

