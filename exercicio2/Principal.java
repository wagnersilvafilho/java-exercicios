package exercicio2;

public class Principal {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro ("Thor", 5.9, "Shitzu");
		Peixe peixe1 = new Peixe ("Haroldo", 0.325, "Agua Doce");
		Cachorro cachorro2 = new Cachorro ("Rex", 8.0, "Pitbull");
		Peixe peixe2 = new Peixe ("Bruce", 0.98, "Agua Salgada");
		Cachorro cachorro3 = new Cachorro ("Zeus", 10.5, "Rotveiller");
		Peixe peixe3 = new Peixe ("Dory", 1.5, "Agua Doce");
		Cachorro cachorro4 = new Cachorro ("Amora", 1.68, "Yorkshire");
		Pessoa pessoa1 = new Pessoa ("Emilia Rosa", 20);
		Pessoa pessoa2 = new Pessoa ("Fernando Miguel", 42);
		pessoa1.adicionaAnimal(cachorro2);
		pessoa1.adicionaAnimal(peixe3);
		pessoa1.adicionaAnimal(cachorro4);
		pessoa2.adicionaAnimal(cachorro1);
		pessoa2.adicionaAnimal(cachorro3);
		pessoa2.adicionaAnimal(peixe2);
		pessoa2.adicionaAnimal(peixe1);
		System.out.println("Abaixo, busca pelo animal 'Zeus':\n");
		pessoa2.obtemAnimal("Zeus").imprime();
		System.out.println("Abaixo, busca pelo animal 'Bruce':\n");
		pessoa2.obtemAnimal("Bruce").imprime();
		System.out.println("Imprimindo todos os animais em ordem alfabetica:\n");
		System.out.println("Animais da " + pessoa1.getNome() + ":\n");
		pessoa1.imprime(0);
		System.out.println("Peixes da " + pessoa1.getNome() + ":\n");
		pessoa1.imprime(1);
		System.out.println("Cachorros da " + pessoa1.getNome() + ":\n");
		pessoa1.imprime(2);
		System.out.println("Animais do " + pessoa2.getNome() + ":\n");
		pessoa2.imprime(0);
		System.out.println("Peixes do " + pessoa2.getNome() + ":\n");
		pessoa2.imprime(1);
		System.out.println("Cachorros do " + pessoa2.getNome() + ":\n");
		pessoa2.imprime(2);
		System.out.println("A quantidade de animais e: " + (pessoa1.qtdeAnimais()+pessoa2.qtdeAnimais()));
		System.out.println("\nA quantidade de peixes e: " + (pessoa1.qtdePeixes()+pessoa2.qtdePeixes()));
		System.out.println("\nA quantidade de cachorros e: " + (pessoa1.qtdeCachorros()+pessoa2.qtdeCachorros()));
		System.out.println("\nRemovendo 'Zeus' dos animais de " + pessoa2.getNome() + "...");
		pessoa2.removeAnimal("Zeus");
		System.out.println("\nRemovido!");
		System.out.println("\nAnimais do " + pessoa2.getNome() + " apos remocao:\n");
		pessoa2.imprime(0);
		System.out.println("Removendo 'Dory' dos animais de " + pessoa1.getNome() + "...");
		pessoa1.removeAnimal("Dory");
		System.out.println("\nRemovido!");
		System.out.println("\nAnimais do " + pessoa1.getNome() + " apos remocao:\n");
		pessoa1.imprime(0);
		System.out.println("A quantidade de animais apos a remocao e " + (pessoa1.qtdeAnimais()+pessoa2.qtdeAnimais()) +
				", sendo " + (pessoa1.qtdePeixes()+pessoa2.qtdePeixes()) + " peixes e " + 
				(pessoa1.qtdeCachorros()+pessoa2.qtdeCachorros()) + " cachorros.");
	}

}
