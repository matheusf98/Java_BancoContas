package br.com.bankmatheus.modelo;

/**
 * 
 * @author Matheus
 * @version 0.1
 */

public abstract class ContaBanco {
	
	private int Agencia;
	private int Numero;
	private double Saldo;
	
	public double Deposita(double valor) {
		return this.Saldo += valor;
	}
	
	public void Saca(double valor) {
		if(valor <= this.Saldo) {
			this.Saldo -= valor;}
	}
	
	public void Transfere(double valor,ContaBanco destino) {
		if(valor <= this.Saldo) {
			this.Saca(valor);
			destino.Deposita(valor);	
		}
	}
	
	public int getAgencia() {
		return Agencia;
	}
	
	public void setAgencia(int agencia) {
		Agencia = agencia;
	}
	
	public int getNumero() {
		return Numero;
	}
	
	public void setNumero(int numero) {
		Numero = numero;
	}
	
	public double getSaldo() {
		return Saldo;
	}
	
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	
}
