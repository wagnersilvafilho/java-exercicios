# java-polimorfismo
Exercício Java Polimorfismo

## Exercício 2

> Classe Abstrata Animal
* Atributos: nome (string) e peso (double).
* Construtor único que inicializa os atributos: nome e peso.
* Métodos getters/setters.
* Método abstrato string getEspecie() - que será implementado pelas subclasses de Animal.
* Método void imprime() - que imprime nome, peso e espécie. Esse método deve obrigatoriamente invocar o método getEspecie() para obeter a espécie do animal.

> Classe Peixe (subclasse de Animal)
* Atributos: tipoHabitat (string) - água doce, água salgada, etc.
* Construtor único que inicializa os atributos: nome, peso e tipoHabitat.
* Métodos getters/setters.
* Método abstrato string getEspecie() que deve retornar a string "Peixe".
* Método void imprime() - que imprime nome, peso, espécie e tipo de habitat.

> Classe Cachorro (subclasse de Animal)
* Atributos: tipoHabitat (string) - água doce, água salgada, etc.
* Construtor único que inicializa os atributos: nome, peso e tipoHabitat.
* Métodos getters/setters.
* Método abstrato string getEspecie() que deve retornar a string "Peixe".
* Método void imprime() - que imprime nome, peso, espécie e tipo de habitat.

> Classe Pessoa
* Atributos: nome (string), idade (int).
* Construtor único que inicializa os atributos: nome e idade.
* Métodos getters/setters.
* Método adicionaAnimal(Animal animal) que adiciona um animal na lista de animais de estimação (do objeto da classe Pessoa).
* Método removeAnimal(string nome) que remove um animal da lista de animais de estimação. Note que o parâmetro desse método é uma string que representa o nome do animal a ser removido da lista.
* Método Animal obtemAnimal(string nome) que obtem um animal da lista de animais de estimação. Note que o parâmetro desse método é uma string que representa o nome do animal.
* Método int qtdeAnimais() que retorna a quantidade de animais de estimação.
* Método int qtdePeixes() que retorna a quantidade de animais de estimação que são peixes (especie "Peixe").
* Método int qtdeCachorros() que retorna a quantidade de animais de estimação que são cachorros (especie "Cachorro").
* Método void imprime(int criterio) - que imprime nome, idade e informações sobre os animais de estimação (ordenados por nome). Isto é, os animais são ordenados levando em consideração o nome do animal.
	> criterio = 0. Imprime todos animais
	> criterio = 1. Imprime apenas os animais que são peixes (espécie "Peixe").
	> criterio = 2. Imprime apenas os animais que são cachorros (espécie "Cachorro").
