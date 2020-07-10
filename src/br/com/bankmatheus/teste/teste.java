package br.com.bankmatheus.teste;

import br.com.bankmatheus.modelo.ContaCorrente;
import br.com.bankmatheus.modelo.ContaPoupanca;

public class teste {

	public static void main(String[] args) {
		ContaPoupanca Matheus = new ContaPoupanca(325, 2551);
		ContaCorrente Lucas = new ContaCorrente(235, 55556);
		ContaCorrente Rafael = new ContaCorrente(10, 2222);
		
		Rafael.setSaldo(500.0);
		Matheus.setSaldo(300.0);
		Lucas.setSaldo(700.0);
		
		Matheus.Transfere(300, Rafael);
		Lucas.Transfere(160, Matheus);
		Rafael.Transfere(250, Lucas);
		
	
		System.out.println(Matheus.Imposto());
		System.out.println(Rafael.Imposto());
		System.out.println(Lucas.Imposto());
			
		
	}
}
