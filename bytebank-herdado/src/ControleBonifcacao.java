
public class ControleBonifcacao {
	private double soma;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
