package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	
	/** 
	 * @return CepApi
	 */
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Goiania";
	}
	
	public String recuperarEstado(String cep) {
		return "GO";
	}
}
