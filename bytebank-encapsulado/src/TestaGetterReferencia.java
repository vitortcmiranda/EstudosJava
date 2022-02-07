
public class TestaGetterReferencia {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();

		cliente.setNome("Vitor");
		cliente.setCpf("000.000.000-00");
		cliente.setProfissao("Desenvolvedor");
//testando construtor		
		cliente.setConta(new Conta(1, 15));
		
//testando getters e setters
//		cliente.getConta().setAgencia(15);
//		cliente.getConta().setNumero(555111);
//		cliente.getConta().deposita(250);

		System.out.println("O cliente: " + cliente.getNome() + " Possui saldo de R$" + cliente.getConta().getSaldo());
		System.out.println("Agencia: " + cliente.getConta().getAgencia() + " Numero: " + cliente.getConta().getNumero()
				+ " Cliente: " + cliente.getNome());
		System.out.println(Conta.getTotal());
	}
}
