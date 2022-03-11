import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if ((i < j) && (i + j > 11)) soma += M[i][j];
            }
        }

        if (O == 'M') soma /= 30;
        System.out.printf("%.1f\n", soma);
    }

}