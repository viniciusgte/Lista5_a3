import java.time.LocalTime;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        long inicio = LocalTime.now().toNanoOfDay();
        ArrayList<Integer> quadrado = GeradorQuadradoRandom.gerar_Quadrado();

        int x1 = GeradorQuadradoRandom.NumAleatorio(quadrado),
            x2 = GeradorQuadradoRandom.NumAleatorio(quadrado),
            x3 = GeradorQuadradoRandom.NumAleatorio(quadrado),
            x4 = GeradorQuadradoRandom.NumAleatorio(quadrado),
            x5 = GeradorQuadradoRandom.NumAleatorio(quadrado),
            x6 = GeradorQuadradoRandom.NumAleatorio(quadrado),
            x7 = GeradorQuadradoRandom.NumAleatorio(quadrado),
            x8 = GeradorQuadradoRandom.NumAleatorio(quadrado),
            x9 = GeradorQuadradoRandom.NumAleatorio(quadrado);

        int contador = 1;

        while(
            ((x1 + x2 + x3) != 15) || ((x4 + x5 + x6) != 15) || ((x7 + x8 + x9) != 15) ||
            ((x1 + x4 + x7) != 15) || ((x2 + x5 + x8) != 15) || ((x3 + x6 + x9) != 15) ||
            ((x1 + x5 + x9) != 15) || ((x3 + x5 + x7) != 15)
        ) {
            quadrado = GeradorQuadradoRandom.gerar_Quadrado();
            contador++;
            x1 = GeradorQuadradoRandom.NumAleatorio(quadrado);
            x2 = GeradorQuadradoRandom.NumAleatorio(quadrado);
            x3 = GeradorQuadradoRandom.NumAleatorio(quadrado);
            x4 = GeradorQuadradoRandom.NumAleatorio(quadrado);
            x5 = GeradorQuadradoRandom.NumAleatorio(quadrado);
            x6 = GeradorQuadradoRandom.NumAleatorio(quadrado);
            x7 = GeradorQuadradoRandom.NumAleatorio(quadrado);
            x8 = GeradorQuadradoRandom.NumAleatorio(quadrado);
            x9 = GeradorQuadradoRandom.NumAleatorio(quadrado);
        }

        long fim = LocalTime.now().toNanoOfDay();

        System.out.println(x1 + " - " + x2 + " - " + x3);
        System.out.println(x4 + " - " + x5 + " - " + x6);
        System.out.println(x7 + " - " + x8 + " - " + x9);

        System.out.println(" ");
        System.out.println("Quantidade de Tentativas: " + contador);
        System.out.println("");
        System.out.println("Nanosegundos: " + (fim - inicio));
        System.out.println(" ");
        System.out.println("Segundos: " + ((fim - inicio) / 1000000000F));
    }

}
