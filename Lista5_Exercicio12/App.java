import java.util.*;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = Embaralhar(sc.nextLine());
		System.out.println("\nSua palavra embaralhada: " + palavra);
	
        sc.close();
    
    }
	
	
	
	public static String Embaralhar(String palavra) {
		String[] letras = palavra.toUpperCase().split("");
		
		List<String> palavraSeparada = Arrays.asList(letras);
		Collections.shuffle(palavraSeparada);
		
		String palavraEmbaralhada = String.join("", palavraSeparada);
		
		
		return palavraEmbaralhada;
	}

}
