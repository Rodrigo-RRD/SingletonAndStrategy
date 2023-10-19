package singleton;

public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	
	/** 
	 * @return SingletonLazyHolder
	 */
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
