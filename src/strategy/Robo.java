package strategy;

public class Robo {

	private Comportamento comportamento;

	
	/** 
	 * @param comportamento
	 */
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public void mover() {
		comportamento.mover();
	}
}
