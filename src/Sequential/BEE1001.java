package Sequential;
import java.util.Scanner;

public class BEE1001 {
    public static void main(String[] args){
        /*
         * Leia 2 valores inteiros e armazene-os nas variáveis A e B.
         * Efetue a soma de A e B atribuindo o seu resultado na variável X.
         * Imprima X conforme exemplo apresentado abaixo.
         * Não apresente mensagem alguma além daquilo que está sendo especificado
         * e não esqueça de imprimir o fim de linha após o resultado, caso contrário,
         * você receberá "Presentation Error".
         */

        Scanner input = new Scanner(System.in);

        int A, B;

        A = input.nextInt();
        B = input.nextInt();

        int X = A + B;

        System.out.printf("X = %d", X);

        input.close();
    }
}
