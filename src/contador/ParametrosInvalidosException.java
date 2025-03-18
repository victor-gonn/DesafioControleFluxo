package contador;

public class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException(String message) {
		super( message);
		System.out.println("O parametro um deve ser maior que o parametro dois");
	}
}
