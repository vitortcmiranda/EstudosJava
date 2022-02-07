public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("Abrindo conexao");
	}

	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException(); // indica que o obejto que voc� esta usando tem um estado inconsistente
	}

	public void fecha() {
	}

	@Override
	public void close(){
		System.out.println("Fechando conexao");

	}
}