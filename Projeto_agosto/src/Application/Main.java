package Application;

public class Main {
	public static void main(String args[]) {
		String nome = "Ludmilla";
		int idade = 31;
		
		if(idade >= 60) {
			System.out.println("Nome: " + nome + ", idade: " + idade);
			System.out.println("Pode entrar de graça no onibus");
		} else {
			System.out.println("Pague a passagem");
		}
	}
}
