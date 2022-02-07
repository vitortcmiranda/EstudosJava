
public class TestaMeotodo {
	public static void main(String[] args) {
		Conta contaPedro = new Conta();
		contaPedro.saldo = 50;
		contaPedro.deposita(150);

		System.out.println("Saldo em contaPedro: " + contaPedro.saldo);
		contaPedro.saca(20);
		System.out.println(contaPedro.saldo);

		Conta contaJoao = new Conta();
		contaJoao.deposita(1000);
		System.out.println("Saldo em conta2: " + contaJoao.saldo);
		contaJoao.transfere(300, contaPedro);

		System.out.println("O saldo na contaPedro após a transferência é de: " + contaPedro.saldo);
	}
}
