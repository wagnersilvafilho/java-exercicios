package exercicio1;

public class Fornecedor extends Pessoa{
	
	private String cnpj;
	
	public Fornecedor(String nome, String telefone, String endereco, String cnpj) {
		super(nome, telefone, endereco);
		this.cnpj = cnpj;
	}

	@Override
	public void imprime() {
		System.out.println("Fornecedor: " + this.nome + "\nTelefone: " + this.telefone
				+ "\nEndereco: " + this.endereco + "\nCNPJ: " + this.cnpj + "\n");	
	}
	
	@Override
	public String getTipo() {
		return "Fornecedor";
	}
	
	@Override
	public int compareTo(Pessoa p) {
		return nome.compareTo(p.getNome());
	}

}
