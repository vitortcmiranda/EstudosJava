
public class Conta {
	private double saldo = 0;
	private int agencia = 42;
	private int numero = 9;
	private static int total;
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada, Agência: "+this.agencia+" Número: "+this.numero);
		Conta.total ++;
	}
	
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
