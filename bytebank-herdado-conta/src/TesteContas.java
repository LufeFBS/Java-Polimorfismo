
public class TesteContas {

			public static void main(String[] args) {
				
					ContaCorrente cc = new ContaCorrente(123, 1234);
					cc.deposita(100.0);
					
					ContaPoupanca cp = new ContaPoupanca(111, 123);
					cp.deposita(100.0);
					
					cc.transfere(10.0, cp);
					
					
					System.out.println(cc.getSaldo());
					System.out.println(cp.getSaldo());
			}
}
