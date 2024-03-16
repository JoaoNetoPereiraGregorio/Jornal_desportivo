package br.edu.ifg;

public class Tecnico extends Pessoa {

	private String funcao;

	public Tecnico() {
		

	}

	public Tecnico(String nome, String cpf, String sexo, String funcao) {
		super(nome, cpf, sexo);
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Tecnico \nNome:" + getNome() + "\nCpf:" +getCpf() + "\nSexo:" +getSexo() + "\nFunção:" + funcao +  "\n";
	}

}
