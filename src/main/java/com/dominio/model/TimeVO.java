package com.dominio.model;

public class TimeVO {
	private String nome;
	private int anoFundacao;
	private double biggestTransferFee;
	private boolean championsUCL;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoFundacao() {
		return anoFundacao;
	}
	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	public double getBiggestTransferFee() {
		return biggestTransferFee;
	}
	public void setBiggestTransferFee(double biggestTransferFee) {
		this.biggestTransferFee = biggestTransferFee;
	}
	public boolean isChampionsUCL() {
		return championsUCL;
	}
	public void setChampionsUCL(boolean championsUCL) {
		this.championsUCL = championsUCL;
	}
	public TimeVO(String nome, int anoFundacao, double biggestTransferFee, boolean championsUCL) {
		this.nome = nome;
		this.anoFundacao = anoFundacao;
		this.biggestTransferFee = biggestTransferFee;
		this.championsUCL = championsUCL;
	}
	
	@Override
	public String toString() {
		return "TimeVO [nome=" + nome + ", anoFundacao=" + anoFundacao + ", biggestTransferFee=" + biggestTransferFee
				+ ", championsUCL=" + championsUCL + "]";
	}
	
	
	
	

}
