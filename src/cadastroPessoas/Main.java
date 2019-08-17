package cadastroPessoas;

public class Main {

	public static void main(String[] args) {
		Carro carro1 = new Carro("H3MJ12", "Laranja", "Hyunday", "HB20");
		Carro carro2 = new Carro("H6MJ66", "Verde", "Fiat", "Uno");
		
		System.out.println("cor carro1: "+carro1.getCor());
		System.out.println("cor carro2: "+carro2.getCor());
		
		carro1.trocarCorPintura("branco");
		carro2.trocarCorPintura("preto");
		System.out.println("------------------------------");
		System.out.println("cor carro1: "+carro1.getCor());
		System.out.println("cor carro2: "+carro2.getCor());

	}

}
