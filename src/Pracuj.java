
public class Pracuj {
	
	static public void pracuj() {
		int i = 0;
		if(Chalupa.lista_chatek.size()>0) {
			int iter1 = Chalupa.lista_chatek.size();
			for(i=1;i<=iter1;i++) {
				Bajtlik.przychod_chalupa();
			}
		}
		if(Kamieniolom.lista_kamieniolomkow.size()>0) {
			int iter2 = Kamieniolom.lista_kamieniolomkow.size();
			for(i=1;i<=iter2;i++) {
				Bajtlik.przychod_kamieniolom();
			}
		}
		if(Tartak.lista_tartak.size()>0) {
			int iter3 = Tartak.lista_tartak.size();
			for(i=1;i<=iter3;i++) {
				Bajtlik.przychod_tartak();
			}
		}
		if(Kopalnia.lista_kopalnia.size()>0) {
			int iter4 = Kopalnia.lista_kopalnia.size();
			for(i=1;i<=iter4;i++) {
				Bajtlik.przychod_kopalnia();
			}
		}
		if(Mennica.lista_mennica.size()>0) {
			int iter5 = Mennica.lista_mennica.size();
			for(i=1;i<=iter5;i++) {
				Bajtlik.przychod_mennica();
			}
		}

	}
	static int licznik=0;
	static public void przemijanie() {
		licznik=licznik+1;
		System.out.print("Ajnfartny³a "+licznik+" doba");
	}

}
