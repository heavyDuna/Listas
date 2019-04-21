import java.util.Arrays;

public class Lista {

	private Nodo com;

	public Lista() {

		this.com = null;

	}

	public Nodo getCom() {

		return this.com;
	}

	public static int[] descomponerEnArray(int numero) {

		int n = 6;
		int resto = 0;
		int[] num = new int[n];

		for (int i = n - 1; i >= 0; i--) {

			resto = numero % 10;
			num[i] = resto;

			numero = numero / 10;

		}

		return num;

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

	public int montanaRusa(Lista montaña) {

		Nodo p;
		p = this.com;

		int total = 0;
		int primerNodo = 0;

		while (p != null && p.getSig() != null) {

			if (p == this.com) {

				primerNodo = p.getInfo();

				total = primerNodo;

			}

			if (p.getSig().getInfo() > p.getInfo()) {

				total = total + p.getSig().getInfo();

			} else {

				total = total - p.getSig().getInfo();
			}

			p = p.getSig();

		}

		return total;

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
