
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
				Cliente cliente = new Cliente();		
				
				Gerente luiz = new Gerente();
				luiz.setNome("Luiz Fernando");
				luiz.setCpf("491.316.798-70");
				luiz.setSalario(1799.80);
				
				System.out.println(luiz.getNome());
				System.out.println(luiz.getCpf());
				System.out.println(luiz.getSalario());
				
				

	}

}
