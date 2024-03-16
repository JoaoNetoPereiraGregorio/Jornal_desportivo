package br.edu.ifg;

public class Jogo {
	private Equipe equipeVisitante;
	private Equipe equipeVisitada;
	String data;
	String hora;
	String local;
	Arbitro arbitro[] = new Arbitro[2];

	public Jogo() {

	}

	public Jogo(Equipe equipeVisitante, Equipe equipeVisitada, String data, String hora, String local,
			Arbitro[] arbitro) {

		this.equipeVisitante = equipeVisitante;
		this.equipeVisitada = equipeVisitada;
		this.data = data;
		this.hora = hora;
		this.local = local;
		this.arbitro = arbitro;
	}

	public Equipe getEquipeVisitante() {
		return equipeVisitante;
	}

	public void setEquipeVisitante(Equipe equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}

	public Equipe getEquipeVisitada() {
		return equipeVisitada;
	}

	public void setEquipeVisitada(Equipe equipeVisitada) {
		this.equipeVisitada = equipeVisitada;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Arbitro[] getArbitro() {
		return arbitro;
	}

	public void setArbitro(Arbitro[] arbitro) {
		this.arbitro = arbitro;
	}

	@Override
	public String toString() {
		return "\n\nEquipe Visitante" + equipeVisitante.toString() + "\n\nEquipe Visitada:"
				+ equipeVisitada.toString() + "\n\nData:" + data + "\nHora:" + hora + "\nLocal:" + local + "\n\nArbitros"
				+ imprimeArbitros(arbitro) + "\n";
	}
	public String imprimeArbitros(Arbitro[] arbitros) {
		String mensagem = "";
		for (int i = 0; i < arbitros.length; i++) {
			mensagem += "\nArbitro " + (i + 1) + "\nNome:" + arbitros[i].getNome() +"\nFunção:"+arbitros[i].getFuncao() +"\nFederação:"+
		arbitros[i].getFederacao()+"\nCPF:"+ arbitros[i].getCpf() + "\nSexo:" + arbitros[i].getSexo() + "\n";
		}

		return mensagem;
	}


}
