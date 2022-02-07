
public class Administrador extends Funcionario implements Autenticavel {

	private int senha;
	private AutenticacaoUtil autentica;

	public Administrador() {
		this.autentica = new AutenticacaoUtil();
	}

	@Override
	public double getBonificao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.autentica.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autentica(senha);
	}

}
