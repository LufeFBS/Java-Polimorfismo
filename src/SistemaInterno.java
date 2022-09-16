
public class SistemaInterno {
	
	private int senha = 2222;

				public void VerificarSenha(Autenticavel fa) {
					boolean logou =  fa.autentica(this.senha);
					if(logou) {
						System.out.println("Pode entrar no sistema!");
					} else {
						System.out.println("Volta para a sua casa ladrão.");
					}
				}
}
