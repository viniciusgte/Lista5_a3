import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		
			ValidarDados();
			
	}
	
	public static int Jogada() {
		Random dado = new Random();
		int valorDados;
		valorDados = (dado.nextInt(6)+1) + (dado.nextInt(6)+1);
		
		return valorDados;
	}
	
	public static void ValidarDados(){
		int ponto = 0;
		int valorDados = 0;
		int numJogadas = 0;
		Scanner sc = new Scanner(System.in);
		String jogar = null;
				do{
					System.out.println("Aperte Enter para jogar os dados: ");
					jogar = sc.nextLine();
					
					if(jogar.isEmpty() == true) {
							numJogadas++;
					valorDados = Jogada();
			
					System.out.println("O valor dos seus dados foi: " + valorDados);
					
					if(numJogadas == 1 & (valorDados == 7 | valorDados == 11)) {
						System.out.println("Parabéns! Você é um Natural, então ganhou o jogo!");
						break;
			}
					else if(numJogadas == 1 & (valorDados == 2 | valorDados == 3 | valorDados == 12)) {
						System.out.println("Craps! Infelizmente você perdeu o jogo...");
						break;
			}
					else if (valorDados == 4| valorDados == 5| valorDados == 6| 
							valorDados == 8| valorDados == 9| valorDados == 10){
						if(ponto == 1) {
							System.out.println("Parabéns! Você ganhou o jogo!");
							break;
						}
						ponto = 1;
					}
			
					else if(ponto == 1 & valorDados == 7) {
						System.out.println("Craps! Infelizmente você perdeu o jogo...");
						break;
			}
				
				}else {
					System.out.println("Não digite um valor, apenas aperte ENTER.\n");
			}
				}while(true);
		
	sc.close();
    	
	}
}
