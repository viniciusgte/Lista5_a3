import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double valorPrestacao;
		int numDias;
		ArrayList<Double> valores = new ArrayList();
		int quant = 0;
		Double valorTotal = 0.0;
		
		do{
			System.out.println("Digite o valor da prestação:");
			valorPrestacao = sc.nextDouble();
			System.out.println("Digite a quantidade de dias que está em atraso:");
			numDias = sc.nextInt();
			if(valorPrestacao == 0) {
				break;
			}

			quant++;
			valores.add(valorPagamento(valorPrestacao, numDias));
		}while(true);
		
		for(int i = 0; i < quant; i++) {
			valorTotal += valores.get(i);
		}
		
		System.out.println("Hoje foram pagas " + quant + " prestações com os seguintes valores: " + valores);
		System.out.printf("Valor total das prestações pagas hoje: %.2f\n", valorTotal);
	sc.close();
    }
	
	public static Double valorPagamento(Double valorPrestacao, int numDias) {
		Double valor = 0.0;
		
		if(numDias < 1) {
			valor += valorPrestacao; 
		}else {
			valor = (valorPrestacao + valorPrestacao * 0.03 + 0.01 * numDias);
		}
		System.out.printf("Valor com juros: %.2f\n", valor);
		return valor;
		
	}
}
