package decorator;

public class TanqueSuper implements Tanque {
	private Tanque decorador;
	
	public TanqueSuper(Tanque tanque) {
		this.decorador = tanque;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void atacar() {
		this.decorador.atacar();
		System.out.println("Lanzando misil dirigido");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPotenciaAtaque() {
		return this.decorador.getPotenciaAtaque() + 10; 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defender() {
		// TODO Auto-generated method stub
		
	}

}
