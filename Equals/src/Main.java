
public class Main {

	public static void main(String[] args) {

		Lista l1 = new Lista();
		Lista l2 = new Lista();

		l1.addPrincipio(2);
		l1.addPrincipio(3);
		l1.addPrincipio(7);
		l1.addPrincipio(4);

		l2.addPrincipio(2);
		l2.addPrincipio(5);
		l2.addPrincipio(7);
		l2.addPrincipio(3);

		System.out.println(l1);
		System.out.println(l2);

		System.out.println(l1.sonIguales(l1, l2));

	}

}
