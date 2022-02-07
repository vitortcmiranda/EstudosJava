
public class TesteGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		gerente.setNome("Gerente 1");
		gerente.setCpf("222222222");
		gerente.setSalario(5000.0);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());

//		gerente.setSenha(2222);
//		System.out.println(gerente.autentica(2222));
		System.out.println(gerente.getBonificao());
	}
}
