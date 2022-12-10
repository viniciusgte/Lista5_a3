import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		System.out.println("Digite o dia:");
		dia = sc.nextInt();
		System.out.println("Digite o mês:");
		mes = sc.nextInt();
		System.out.println("Digite o ano:");
		ano = sc.nextInt();
		
		System.out.println("\nSua data formatada: "+DataFormatada(dia, mes, ano));
		
        sc.close();

	}
	public static String DataFormatada(int dia, int mes, int ano) {
		String[] meses = {"Janeiro","Fevereiro","Março","Abril",
				"Maio", "Junho","Julho","Agosto","Setembro",
				"Outubro","Novembro","Dezembro"};
		String mesExtenso = meses[mes-1];
		String dataFormatada;
		
		if(dia <= 31 & dia > 0 & mes <= 12 & mes > 0 & (Integer.toString(ano)).length() == 4) {

			dataFormatada = dia + " de " + mesExtenso + " de " + ano;
			if(mes == 2 & dia > 28 & ano%4 != 0) {
				System.out.println("Só tem 28 dias em feveiro em anos não bissextos!");
				dataFormatada = null;
			}else if (mes == 2 & dia > 29 & ano%4 == 0) {
				System.out.println("Só tem 29 dias em feveiro nesse ano!");
				dataFormatada = null;
			}
			}
			else {
				dataFormatada = null;
			}
			
			return dataFormatada;
	}
}
