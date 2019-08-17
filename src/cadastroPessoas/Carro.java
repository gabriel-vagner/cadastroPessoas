package cadastroPessoas;

public class Carro {
	private String Placa;
	private String Cor;
	private String Marca;
	private String Modelo;
	
	public Carro(String placa, String cor, String marca, String modelo) {
		super();
		Placa = placa;
		Cor = cor;
		Marca = marca;
		Modelo = modelo;
	}
// ausnecia de setters, ja que logicamente um carro não troca de modelo, marca ou placa(geralmente) , e a cor ja possui uma funçaõ especifica para ser trocada 
	public String getPlaca() {
		return Placa;
	}

	public String getCor() {
		return Cor;
	}

	public String getMarca() {
		return Marca;
	}


	public String getModelo() {
		return Modelo;
	}

	public void trocarCorPintura(String cor) {
		Cor = cor;
	}
	
	
}
