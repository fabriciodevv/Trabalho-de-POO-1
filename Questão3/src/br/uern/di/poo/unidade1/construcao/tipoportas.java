package br.uern.di.poo.unidade1.construcao;

public enum tipoportas {

	PORTASIMPLES("Tipo de madeira: Compensada ", "Tipo de fechadura: Simples ", 50.00),
	PORTAPADRAO("Tipo de madeira: andiroba ", "Tipo de fechadura: Tipo encaixe ", 140.00),
	PORTALUXO("Tipo de madeira: ipê", "Tipo de fechadura: Tipo Tetra ", 350.00);
	
	private String tipomadeira, tipofechadura;
	private double valor;
	
	private tipoportas(String tipomadeira, String tipofechadura, double valor) {
		this.tipomadeira = tipomadeira;
		this.tipofechadura = tipofechadura;
		this.valor = valor;
		
		
	}

	public String getTipomadeira() {
		return tipomadeira;
	}

	public void setTipomadeira(String tipomadeira) {
		this.tipomadeira = tipomadeira;
	}

	public String getTipofechadura() {
		return tipofechadura;
	}

	public void setTipofechadura(String tipofechadura) {
		this.tipofechadura = tipofechadura;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
