package questao2;



public class Aposta {

	Evento Qf;
	Resultado resultt1;
	double vaposta;
	
	
	public Resultado getResultt1() {
		return resultt1;
	}


	public void setResultt1(Resultado resultt1) {
		this.resultt1 = resultt1;
	}


	public double getVaposta() {
		return vaposta;
	}


	public void setVaposta(double vaposta) {
		this.vaposta = vaposta;
	}


	public Aposta(Evento qf, Resultado resultt1, double vaposta) {
		super();
		Qf = qf;
		this.resultt1 = resultt1;
		this.vaposta = vaposta;
	}
	public double calculaLucro(Evento quartas) {
	
		 double lucro = 0 ;
		if(resultt1 == quartas.getResultado()) {//verificando se a aposta é igual a semifinal
			if(resultt1 == Resultado.TIME1) {
				lucro = vaposta * quartas.getPontot1();	
			}
			else if(resultt1 == Resultado.TIME2) {
				lucro = vaposta * quartas.getPontot2();	
						}
			else if(resultt1 == Resultado.EMPATE) {
				lucro = vaposta * quartas.getEmpate();
			}
		}
			
		
	return lucro;
	}
}
	

	
	

