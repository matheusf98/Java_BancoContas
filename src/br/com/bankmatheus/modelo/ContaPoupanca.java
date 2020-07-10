package br.com.bankmatheus.modelo;

public class ContaPoupanca extends ContaBanco implements Tributos{
	
	public ContaPoupanca(int age, int num) {
		
		super.setAgencia(age);
		super.setNumero(num);
	}

	@Override
	public double Imposto() {
		return super.getSaldo() + 0.2;
	}
}
