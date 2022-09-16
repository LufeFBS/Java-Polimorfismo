
public class CalculadorImposto {
		
		private double totaIImposto;
	
		public void registra(Tributavel t) {
			double valor = t.getValorImposto();
			this.totaIImposto += valor;
		}
		
		public double getTotaIImposto() {
			return totaIImposto;
		}
}
