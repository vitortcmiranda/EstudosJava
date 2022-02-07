
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private static int total;

	public Conta(int agencia, int numero) {

		if (agencia + numero <= 1)
			throw new IllegalArgumentException("Agencia ou número inválidos.");

		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada, Agência: " + this.agencia + " Número: " + this.numero);
		Conta.total++;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(" O saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {

		saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static int getTotal() {
		return total;
	}
}
