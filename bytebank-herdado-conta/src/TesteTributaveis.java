
public class TesteTributaveis {

			public static void main(String[] args) {
						ContaCorrente cc = new ContaCorrente(222, 333);
						cc.deposita(100.0);
						
						SeguroDeVida seguro = new SeguroDeVida();
						
						CalculadorImposto imp = new CalculadorImposto();
						imp.registra(cc);
						imp.registra(seguro);
						
						System.out.println(imp.getTotaIImposto());
						
						
			}
}
