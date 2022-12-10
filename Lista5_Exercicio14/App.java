import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

    
        ArrayList<Integer> quadrado = RandomSquareGen.gerar_Quadrado();

        int x1 = RandomSquareGen.NumAleatorio(quadrado),
            x2 = RandomSquareGen.NumAleatorio(quadrado),
            x3 = RandomSquareGen.NumAleatorio(quadrado),
            x4 = RandomSquareGen.NumAleatorio(quadrado),
            x5 = RandomSquareGen.NumAleatorio(quadrado),
            x6 = RandomSquareGen.NumAleatorio(quadrado),
            x7 = RandomSquareGen.NumAleatorio(quadrado),
            x8 = RandomSquareGen.NumAleatorio(quadrado),
            x9 = RandomSquareGen.NumAleatorio(quadrado);

        int contador = 1;

        while(
            ((x1 + x2 + x3) != 15) || ((x4 + x5 + x6) != 15) || ((x7 + x8 + x9) != 15) ||
            ((x1 + x4 + x7) != 15) || ((x2 + x5 + x8) != 15) || ((x3 + x6 + x9) != 15) ||
            ((x1 + x5 + x9) != 15) || ((x3 + x5 + x7) != 15)
        ) {
            quadrado = RandomSquareGen.gerar_Quadrado();
            contador++;
            x1 = RandomSquareGen.NumAleatorio(quadrado);
            x2 = RandomSquareGen.NumAleatorio(quadrado);
            x3 = RandomSquareGen.NumAleatorio(quadrado);
            x4 = RandomSquareGen.NumAleatorio(quadrado);
            x5 = RandomSquareGen.NumAleatorio(quadrado);
            x6 = RandomSquareGen.NumAleatorio(quadrado);
            x7 = RandomSquareGen.NumAleatorio(quadrado);
            x8 = RandomSquareGen.NumAleatorio(quadrado);
            x9 = RandomSquareGen.NumAleatorio(quadrado);
        }

        

        System.out.println(x1 + " - " + x2 + " - " + x3);
        System.out.println(x4 + " - " + x5 + " - " + x6);
        System.out.println(x7 + " - " + x8 + " - " + x9);

        System.out.println(" ");
        System.out.println("Ao lado, temos o número de tentativas: " + contador);

    }

}
