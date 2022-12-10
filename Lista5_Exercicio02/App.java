import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
System.out.println("Escreva abaixo um número inteiro: ");

Scanner teclado = new Scanner(System.in);
int n = teclado.nextInt();

System.out.println("Resultado: ");
imprimeNumeros(n);

teclado.close();

}

public static void imprimeNumeros(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
            
        }
        System.out.println(" ");
        }
    }

}
