
public class Main {

	public static void main(String[] args) {

		Lista l = new Lista();

		l.addPrincipio(-6);
		l.addPrincipio(2);
		l.addPrincipio(3);
		l.addPrincipio(2);
		l.addPrincipio(1);
		System.out.println(l);

		l.InsertarCeroDespuesDeSuma(l);

	}
}
