
public class TesteConexao {
	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (Exception e) {
			System.out.println("Deu erro na conexao");
		}

		/*
		 * Conexao con = null; try {
		 * 
		 * con = new Conexao(); con.leDados();
		 * 
		 * } catch (IllegalStateException e) {
		 * System.out.println("Deu erro na conexao"); } finally {
		 * System.out.println("Finally"); if(con != null){ con.close(); } }
		 */
	}
}
