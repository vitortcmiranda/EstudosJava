
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	public void deposita(double valor) {
		if (valor > 0)
			super.saldo += valor;
	}
}
