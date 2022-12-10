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

static void imprimeNumeros(int n) {
    int i, j;

for (i=1; i <= n; i++) {
    for(j=1; j<i; j++) {
        System.out.print(i+" "); }
            System.out.println(i+" "); }
    }
}

