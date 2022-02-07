
public class Conta {
	double saldo = 0;
	int agencia = 42;
	int numero;
	String titular = "Conta criada";

	public void deposita(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor))
			destino.deposita(valor);
		return false;
	}
}
