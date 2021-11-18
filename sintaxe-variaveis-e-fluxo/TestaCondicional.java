
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 10;
		int quantidadePessoas = 3;
		if (idade >=18) {
			System.out.println("você é de maior");
		} else {
			System.out.println("Idade menor que 18");				
			if (quantidadePessoas>=2) {	
				System.out.println("você não tem 18, mas como está acompanhado, pode entrar.");
			} else {
				System.out.println("infelizmente você não pode entrar.");
			}
		}
	}
}


