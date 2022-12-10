import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int digitos = Digitos(sc.nextInt());
		
		System.out.println("\nO número digitado possui " + digitos  + " dígitos.");
	sc.close();
    
    }
	
	public static int Digitos(int numero) {
		String quantidade = Integer.toString(numero);
		int quantDigitos = quantidade.length();
		
		return quantDigitos;
	}
}
