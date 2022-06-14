package strategypattern;

public class zViajando {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		joao.setViajar(new ViagemdeCarro());
		joao.realizarViagem();
		
		System.out.println("--------------------------------");
		
		joao.setViajar(new ViagemdeAviao());
		joao.realizarViagem();
		
	}
	
}