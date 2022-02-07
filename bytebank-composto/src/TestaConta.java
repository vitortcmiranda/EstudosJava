
public class TestaConta {

	public static void main(String[] args) {
		Conta contaDoVitor = new Conta();
		Cliente clienteVitor = new Cliente();

		clienteVitor.nome = "Vitor";
		clienteVitor.cpf = "000-000-000.00";
		clienteVitor.profissao = "Programador";

		clienteVitor.conta = new Conta();

		clienteVitor.conta.deposita(5000);
		clienteVitor.conta.saca(1000);
		System.out.println("Cliente: " + clienteVitor.nome);
//		System.out.println("Saldo: " + clienteVitor.conta.saldo);
		System.out.println(clienteVitor.conta.pegaSaldo());

//		contaDoVitor.agencia = 123;
//		contaDoVitor.numero = 12345;
//		contaDoVitor.titular = clienteVitor;

//		System.out.println(teste);
	}
}
