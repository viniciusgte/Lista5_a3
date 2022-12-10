import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        while(true){
            System.out.println("---- ----- ----- ----- -----");
            
            System.out.print("Digite a hora [Formato 24h]:  ");
            
            int hora = teclado.nextInt();
            
            System.out.print("Digite os minutos: ");
            int minutos = teclado.nextInt();
            
            int HorasConvertidas = converteHora(hora);
            saida(hora, minutos, HorasConvertidas);

            System.out.println("Deseja continuar [S/N]: ");
            String resposta = teclado.next();  
            if(resposta.equalsIgnoreCase("n")){
                break;
            }
        }
        teclado.close();
    }

    public static int converteHora(int hora){
        if(hora > 12){
            hora -= 12;
            return hora;
        } else{
            return hora;
        }
    }

    public static void saida(int hora, int minutos, int HorasConvertidas){
        String P = "P.M";
        String A = "A.M";
        if(hora > 12){
            System.out.println("Horas convertidas: " + HorasConvertidas + ":" + minutos + " " + P);
        } else if (hora < 12 || hora == 24) {
            System.out.println(hora + ":" + minutos + " " + A);
        }
    }
        
}
