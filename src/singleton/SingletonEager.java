package singleton;

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	
	/** 
	 * @return SingletonEager
	 */
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
