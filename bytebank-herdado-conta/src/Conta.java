public abstract class Conta {
	
	// Temos 4 atributos
	
			protected  double saldo;
			private int agencia;
			private int numero;
			private Cliente titular;
			private static int total = 0;
			
			public Conta(int agencia, int numero) {
				Conta.total++;
				System.out.println("O total de contas é: " + Conta.total);
				this.agencia = agencia;
				this.numero = numero;
				// this.saldo = 0;
				System.out.println("estou criando uma conta: " + this.numero);
			}
	
	// Metodos é parecido com uma função
	
		public abstract void deposita(double valor);	
		
		public boolean saca(double valor) {
				if (this.saldo >= valor) {
					this.saldo = this.saldo - valor;
					System.out.println("O saque foi um sucesso!!!");
					return true;
				} else {
					System.out.println("Saldo insuficiente");
					return false;
				}
		}
		
		public boolean transfere(double valor, Conta destino)  {
			if(this.saca(valor)) {
					destino.deposita(valor);
					System.out.println("Trasnferencia realizada.");
					return true;
			}  else {
		return false;	
		}
			
		}
		
		public double getSaldo() {
				return this.saldo;
		}
		
		public int getNumero() {
				return this.numero;
		}
		
		public void setNumero(int numero) {
			if(numero <= 0 ) {
				System.out.println("Não pode valor igual a 0");
				return;
			}
			this.numero = numero;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public void setAgencia(int agencia) {
			if(agencia <= 0 ) {
				System.out.println("Não pode valor igual a 0");
				return;
			}
			this.agencia = agencia;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public Cliente getTitular() {
				return titular;
		}
		
		public static int getTotal() {
			return Conta.total;
		}
		
			}
