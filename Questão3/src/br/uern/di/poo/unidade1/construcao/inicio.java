package br.uern.di.poo.unidade1.construcao;



public class inicio {
	
	
	public static void main(String[] args) {
		
		Porta vtotal = new Porta();
		Porta Porta1 = new Porta();
		Porta Porta2 = new Porta(tipoportas.PORTALUXO, 1.0, 0.5, true);
		Porta Porta3 = new Porta(tipoportas.PORTAPADRAO, 2.5, 1.5, true);
		Porta Porta4 = new Porta(tipoportas.PORTALUXO, 2.6, 1.7, false);
		
		Porta1.exibeporta();
		vtotal.valorfinal(Porta1);
		Porta2.exibeporta();
		vtotal.valorfinal(Porta2);
		Porta3.exibeporta();
		vtotal.valorfinal(Porta3);
		Porta4.exibeporta();
		vtotal.valorfinal(Porta4);

}
}