
public class Main {
	
	public static void main(String[] args) {

		Lista l = new Lista();

		l.addPrincipio(4);
		l.addPrincipio(2);
		l.addPrincipio(5);
		l.addPrincipio(2);
		l.addPrincipio(1);

		System.out.println(l);

		System.out.println(l.montanaRusa(l));

	}

}
