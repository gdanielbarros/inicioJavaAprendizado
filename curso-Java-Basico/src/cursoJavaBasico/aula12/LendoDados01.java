package cursoJavaBasico.aula12;
import java.util.Scanner;

public class LendoDados01 {

	public LendoDados01() {
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Seu nome é: " + nome);
		
	}
}