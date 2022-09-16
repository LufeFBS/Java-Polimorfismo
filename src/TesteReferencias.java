
public class TesteReferencias {

			public static void main(String[] args) {
				
					Gerente g1 = new Gerente();
					g1.setNome("Ronaldo");
					g1.setSalario(5000.0);
									
					EditorVideo kkk = new EditorVideo();
					kkk.setSalario(3000.00);
					
					Designer k = new Designer();
					k.setSalario(3000.00);
					
					ControleBonificacao controle = new ControleBonificacao();
					controle.registra(g1);
					controle.registra(kkk);
					controle.registra(k);
					
					System.out.println(controle.getSoma());
			}
}
