
public class TesteSaca {
	public static void main(String[] args) {
		Conta c = new ContaCorrente(1, 23);
		try {
			c.deposita(200);
			c.saca(200);
			System.out.println(c.getSaldo());
		} catch (Exception e) { // catch poliformico
			System.out.println("Ex:"+e.getMessage());
		}
	}
}
