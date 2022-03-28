package poligonos;

import java.util.ArrayList;
import java.util.Collections;


public class Principal {

	// lista estática con los polígonos que guardaremos
	static ArrayList<Poligono> listaPoligonos = new ArrayList<>();

	// método para rellenar la lista
	static void rellenarLista() {
		listaPoligonos.add(new Poligono(5, 20));
		listaPoligonos.add(new Poligono(8, 30));
		listaPoligonos.add(new Poligono(3, 50));
		listaPoligonos.add(new Poligono(3, 20));
		listaPoligonos.add(new Poligono(8, 45));
		listaPoligonos.add(new Poligono(5, 45));
		listaPoligonos.add(new Poligono(8, 20));
		listaPoligonos.add(new Poligono(4, 90));
	}

	// método para imprimir la lista
	static void mostrarLista() {
		for (Poligono poli : listaPoligonos) {
			System.out.println(poli.toString());
		}
	}

	public static void main(String[] args) {

		rellenarLista();


		// ordenamos la lista antes de mostrarla
		Collections.sort(listaPoligonos, new OrdenarPoligonos3());
		mostrarLista();

	}

}
