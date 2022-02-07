public class FulxoComError {

	public static void main(String[] args) {
		try {
			System.out.println("Ini do main");
			metodo1();
			System.out.println("Fim do main");
		} catch (Exception ex) { //catch poliformico
			String msg = ex.getMessage();
//			System.out.println("Exception " + msg);
			System.out.println(msg);
//			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");

//		ArithmeticException exception = new ArithmeticException();
		throw new MinhaExcecao("Deu errado");
//		System.out.println("Fim do metodo2");
	}
}