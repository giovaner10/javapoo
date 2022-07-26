package poo;

public class CamaroteInferior extends VIP {

	private String localizacao;

	public CamaroteInferior(double valorIngresso, String localizacao) {
		super(valorIngresso);
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}
	  
	public void imprimirLocalizacao() {
		System.out.println("local: " + getLocalizacao());
	}
	
	

}
