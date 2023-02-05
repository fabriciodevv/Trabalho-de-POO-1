package br.uern.di.poo.unidade1.construcao;

import java.text.DecimalFormat;

public class Porta {

	DecimalFormat df = new DecimalFormat("#.00");
	tipoportas tp;
	double alt, larg;
	boolean pivot;
	final double extrapivotante = 350.00; 
	final double padraolarg = 0.7;
	final double padraoalt = 1.8;
	
	public Porta() {
		super();
		this.alt = padraoalt;
		this.larg = padraolarg;
		this.tp = tipoportas.PORTASIMPLES;
		this.pivot = false;
		
		
	}


	public Porta(tipoportas tp, double alt, double larg, boolean pivot) {
		super();
		this.tp = tp;
		this.alt = alt;
		this.larg = larg;
		this.pivot = pivot;
	}


	public tipoportas getTp() {
		return tp;
	}


	public void setTp(tipoportas tp) {
		this.tp = tp;
	}


	public double getAlt() {
		return alt;
	}


	public void setAlt(double alt) {
		this.alt = alt;
	}


	public double getLarg() {
		return larg;
	}


	public void setLarg(double larg) {
		this.larg = larg;
	}


	public boolean isPivot() {
		return pivot;
	}


	public void setPivot(boolean pivot) {
		this.pivot = pivot;
	}


	public double getExtrapivotante() {
		return extrapivotante;
	}


	public double getPadraolarg() {
		return padraolarg;
	}


	public double getPadraoalt() {
		return padraoalt;
	}
	
	
	
	
	public double calculapreco(){
		double valor;
		double metroquadrado;
		
		metroquadrado = getAlt()*getLarg();
		valor = tp.getValor()*metroquadrado;
		if(pivot==true) {
			valor = valor + extrapivotante;	
			}
		return valor;
		}
	
	public String seepivotante() {
		String decidir;
		if(pivot==false) {
		  decidir = "Não";
		}else {
			decidir = "Sim";
		}
		return decidir;
	}
	public void exibeporta() {
		System.out.println("*************************** ");
		System.out.println("Caracteristicas da porta");
		System.out.println("-------------------------------");
		System.out.println("Tipo da porta:" + tp);
		System.out.println("Altura: " + alt + " Metros");
		System.out.println("Largura: " + larg +" Metros");
		System.out.println("Pivotante: " + seepivotante());
		System.out.println("Valor: " + calculapreco());
		System.out.println("--------------------------------");
	}
	
	public void valorfinal(Porta Porta) {
		double valorinstalacao = Calcula.calculaservico(Porta);
		System.out.println("valor da porta: " + calculapreco());
		System.out.println("Valor da instalação: " + df.format(valorinstalacao));
		System.out.println("Valor total: " + (calculapreco() + valorinstalacao));
	}
	
	
}
