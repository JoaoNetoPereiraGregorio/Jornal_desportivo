package br.edu.ifg;

public class Arbitro extends Pessoa {

	private String funcao;
	private String federacao;

	public Arbitro() {

	}

	public Arbitro(String nome, String cpf, String sexo, String funcao, String federecao) {
		super(nome, cpf, sexo);
		this.funcao = funcao;
		this.federacao = federecao;

	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getFederacao() {
		return federacao;
	}

	public void setFederacao(String federacao) {
		this.federacao = federacao;
	}

	@Override
	public String toString() {
		return "Arbitro \nNome:" + getNome() + "\nCpf:" + getCpf() + "\nSexo:" + getSexo() + "\nFunção:" + funcao
				+ "\nFederação: " + federacao + "\n";
	}

}
