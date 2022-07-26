package poo;

public abstract class Ingresso {
	
	private double valorIngresso;
	
	
	public Ingresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	
	
	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}


	public void imprimeValor() {
		System.out.println(this.valorIngresso);
	}
	
	
	

}
