import java.util.Arrays;

public class Lista {

	private Nodo com;

	public Lista() {

		this.com = null;

	}

	public Nodo getCom() {

		return this.com;
	}

	public void addPrincipio(int num) {

		Nodo nuevo = new Nodo();
		nuevo.setInfo(num);
		nuevo.setSig(this.com);
		this.com = nuevo;

	}

	public void addFinal(int num) {

		Nodo nuevo = new Nodo();
		nuevo.setInfo(num);
		Nodo p;
		p = this.com;

		while (p.getSig() != null) {

			p = p.getSig();
		}

		nuevo.setSig(null);
		p.setSig(nuevo);
	}

	public void borrarParOImpar(Lista l) {

		Nodo p;
		p = this.com;

		int totalNodos = 0;

		while (p != null) {

			totalNodos++;

			p = p.getSig();
		}

		Nodo k;
		k = this.com;

		while (k != null) {

			if (par(totalNodos) == true) {

				if (par(k.getInfo()) == true) {

					borrar(k.getInfo());

				}

			} else if (par(totalNodos) == false) {

				if (par(k.getInfo()) == false) {

					borrar(k.getInfo());

				}

			}

			k = k.getSig();
		}
	}

	public void borrar(int dato) {

		Nodo p, aux;
		boolean encontrado = false;

		if (this.com == null) {

			System.out.println("Lista vacía");

		} else {

			aux = this.com;
			p = com.getSig();

			if (com.getInfo() == dato) {
				com = com.getSig();
			} else {

				while (p != null && encontrado == false) {
					if (p.getInfo() == dato) {
						encontrado = true;
					} else {
						aux = aux.getSig();
						p = p.getSig();
					}
				}

				if (encontrado == true) {

					aux.setSig(p.getSig());

				}
			}

		}
	}

	public boolean par(int num) {

		boolean par = true;

		if (num % 2 == 0) {

			par = true;

		} else {

			par = false;
		}
		return par;

	}

	public String toString() {

		String l = "Lista";
		Nodo p = this.com;

		while (p != null) {

			l = l + p;
			p = p.getSig();
		}

		return l;

	}

}
