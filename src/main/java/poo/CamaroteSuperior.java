package poo;

public class CamaroteSuperior extends VIP {


	private static final double ADICIONAL_VIP_CAMAROTE_SUPERIOR = 100;
	
	public CamaroteSuperior(double valorIngresso, String localizacao) {
		super(valorIngresso);
	}

	
	public double getAdicionalSuperior() {
		return ADICIONAL_VIP_CAMAROTE_SUPERIOR;
	}
	
	public double getValorIngresso(double valorIngresso) {
		super.setValorIngresso(valorIngresso + getAdicionalVip() + getAdicionalSuperior());
		return valorIngresso;
	}
	

}
