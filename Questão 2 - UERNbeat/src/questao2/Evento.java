package questao2;

public class Evento {
    
				//titulo , //paises
  private String quartaf, pais2, pais1;
  private double pontot1, empate, pontot2;
 private Resultado resultado; 
 
	public Resultado getResultado() {
	return resultado;
}

public void setResultado(Resultado resultado) {
	this.resultado = resultado;
}




	public double getPontot1() {
	return pontot1;
}

public void setPontot1(double pontot1) {
	this.pontot1 = pontot1;
}

public double getEmpate() {
	return empate;
}

public void setEmpate(double empate) {
	this.empate = empate;
}

public double getPontot2() {
	return pontot2;
}

public void setPontot2(double pontot2) {
	this.pontot2 = pontot2;
}

	public Evento(String quartaf, String pais1, String pais2, double pontot1, double empate, double pontot2) {
		super();
		this.quartaf = quartaf;
		this.pais1 = pais1;
		this.pais2 = pais2;
		this.pontot1 = pontot1;
		this.empate = empate;
		this.pontot2 = pontot2;
		
		
		
		
	}

	





   
       

        

    }

