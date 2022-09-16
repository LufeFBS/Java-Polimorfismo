
public class TestaSistema {

			public static void main(String[] args) {
				Gerente g = new Gerente();
				 g.setSenha(2222);
				
				Adm admm = new Adm();
				 admm.setSenha(1234);
				 
				 Cliente cliente = new Cliente();
				 cliente.setSenha(1541);

				SistemaInterno si = new SistemaInterno();
				 si.VerificarSenha(g);
				 si.VerificarSenha(admm);
				 si.VerificarSenha(cliente);
			}
}
