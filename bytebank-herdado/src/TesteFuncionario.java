
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();

		funcionario.setNome("Vitor");
		funcionario.setCpf("111111111111");
		funcionario.setSalario(2000);

		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificao());

	}

}
