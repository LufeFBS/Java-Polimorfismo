
public class TesteGerente {

			public static void main(String[] args) {
				
						Autenticavel  referencia = new Cliente();
						
				
						Gerente Jorge = new Gerente();
						Jorge.setNome("Jorge Silva");
						Jorge.setCpf("491.316.798-70");
						Jorge.setSalario(4000.0);
						
						System.out.println(Jorge.getNome());
						System.out.println(Jorge.getCpf());
						System.out.println(Jorge.getSalario());
						
						 Jorge.setSenha(180307);
						 boolean autentica = Jorge.autentica(180307);
						System.out.println(autentica);
						
						System.out.println(Jorge.getBonificacao());
						
						
						
			}
}
