package singleton;

public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	}

	
	/** 
	 * @param null
	 * @return SingletonLazy
	 */
	public static SingletonLazy getInstancia() {/* se a instancia for igual a null retorna a instancia */
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
