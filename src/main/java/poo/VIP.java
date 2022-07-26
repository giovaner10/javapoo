package poo;

public class VIP extends Ingresso {
	
	
	private static final double ADICIONAL_VIP = 35;
	
	public VIP(double valorIngresso) {
		super(valorIngresso);
	}
	
	
	public double getAdicionalVip() {
		return ADICIONAL_VIP;
	}
	
	
	public double getValorIngresso(double valorIngresso) {
		super.setValorIngresso(valorIngresso + getAdicionalVip());
		return valorIngresso;
	}

	
}
