package decorator;

public class Inicial {
	public static void main(String[] args) {

		var tanque = new TanqueSimple();
		
		tanque.atacar();
		tanque.defender();
		System.out.println(tanque.getPotenciaAtaque());
		
		var tanqueBig = new TanqueSuper((Tanque) tanque);
		tanqueBig.atacar();
		tanqueBig.defender();
		System.out.println(tanqueBig.getPotenciaAtaque());
  }
}
