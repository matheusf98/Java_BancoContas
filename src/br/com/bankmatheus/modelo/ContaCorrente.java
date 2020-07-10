package br.com.bankmatheus.modelo;

public class ContaCorrente extends ContaBanco implements Tributos{
	
	public ContaCorrente(int age, int num) {
		super.setAgencia(age);
		super.setNumero(num);
	}

	@Override
	public double Imposto() {
		return super.getSaldo() - 0.1;
	}
	
	public void Calculo() {
		Imposto();
	}
}
