package exercicio1;

public abstract class Pessoa implements Comparable<Pessoa> {
	
	String nome;
	protected String telefone;
	protected String endereco;
	
	public abstract void imprime();
	
	public abstract String getTipo();
	
	public Pessoa(String nome, String telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
