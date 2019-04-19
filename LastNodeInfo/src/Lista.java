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

	public void DatoUltimoNodo(Lista l) {

		Nodo p;
		p = this.com;

		int numNodos = 0;
		int infoUltNodo = 0;

		while (p != null) {

			if (p.getSig() == null) {

				numNodos++;

				infoUltNodo = p.getInfo();

				if (numNodos == infoUltNodo) {

					System.out.println("CERO");

				} else if (numNodos > infoUltNodo) {

					System.out.println("-UNO");

				} else if (numNodos < infoUltNodo) {
					System.out.println("UNO");
				}
			} else {

				numNodos++;

			}

			p = p.getSig();

		}

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