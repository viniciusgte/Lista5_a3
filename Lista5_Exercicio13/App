import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linha = 0;
		int coluna = 0;
		
		
		System.out.println("Digite o tamanho das linhas (O número deve ser entre 1 e 20):");
		linha = sc.nextInt();
		System.out.println("Digite o tamanho das colunas (O número deve ser entre 1 e 20):");
		coluna = sc.nextInt();
		
		
		System.out.println(Moldura(ValorMinMaxOmi(linha),ValorMinMaxOmi(coluna)));
	
        sc.close();

	}
	
	public static int ValorMinMaxOmi(int valor) {
		if(Integer.toString(valor).isEmpty() == true || valor < 1) {
			return 1;
		}else if(valor > 20) {
			return 20;
		}else {
			return valor;
		}
		
	}
	
	public static String Linha(int tamLinha) {
		String linha = "+";
		
		for(int i = 0; i < tamLinha; i++) {
			linha += "-";
		}
		linha += "+";
		return linha;
	}
	
	public static String Coluna(int tamLinha, int tamCol) {
		String coluna = "";
		
		for(int i = 0; i < tamCol; i++) {
			coluna += "|";
			for(int e = 0; e < tamLinha; e++) {
				coluna += " ";
			}
			coluna += "|\n";
		}
		
		
		return coluna;
	}
	
	public static String Moldura(int tamLinha, int tamColuna) {
		String moldura = "";
		
		moldura = Linha(tamLinha) +"\n"+
		Coluna(tamLinha, tamColuna) +
		Linha(tamLinha);
		
		return moldura;
	}
}
