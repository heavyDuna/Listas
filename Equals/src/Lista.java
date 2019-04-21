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

	public boolean sonIguales(Lista l1, Lista l2) {

		Nodo p, q;
		p = l1.getCom();

		boolean encontrado = false;
		int coincidencias = 0;

		while (p != null) {

			q = l2.getCom();

			while (q != null) {

				if (p.getInfo() == q.getInfo()) {

					encontrado = true;
					coincidencias++;

				}

				q = q.getSig();

			}

			p = p.getSig();

		}
		System.out.println("coincidencias: " + coincidencias);
		return encontrado;

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
