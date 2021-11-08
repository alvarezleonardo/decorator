package decorator;

public class TanqueSimple implements Tanque {

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		System.out.println("Disparando con ametralladora");
	}

	@Override
	public int getPotenciaAtaque() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void defender() {
		System.out.println("Defensa tanque simple");
		
	}

}
