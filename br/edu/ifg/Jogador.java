package br.edu.ifg;

public class Jogador extends Pessoa {

	private boolean titular;
	private int numero;
	
	public Jogador() {
		
	}

	public Jogador(String nome, String cpf, String sexo, boolean titular,int numero) {
		super(nome, cpf, sexo);
		this.titular = titular;
		this.numero=numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Jogador\nNome:" + getNome() + "\nCpf:" +getCpf() + "\nSexo:" +getSexo() +"\nNumero:"+numero+ "\nTitular:" + titular +  "\n";
	}
	
	

}
