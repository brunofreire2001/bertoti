package strategypattern;

public class Cliente {

	private Viajar viajar;
	
	public void setViajar(Viajar viajar){
		this.viajar = viajar;
	}
	
	public void realizarViagem() {
		this.viajar.viajar();
	}
	
}
