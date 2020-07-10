package br.com.bankmatheus.modelo;

public class Descontos extends ContaBanco {
	
	public void ImpostoCorrente(double valor) {
		valor = 0.20;
		super.setSaldo(valor); 
	}
}
