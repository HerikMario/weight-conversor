import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double valorEntrada = 0;
        double valorSaida = 0;
        boolean continuar = true;

        System.out.println("===========================");
        System.out.println("Conversor de medida de peso");
        System.out.println("===========================");

        while (continuar) {

        System.out.println("1. Converter de Kg para Libras");
        System.out.println("2. Converter de Libras para Kg");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor (Kg) que deseja converter: ");
                valorEntrada = scan.nextDouble();
                valorSaida = valorEntrada / 0.453592;
                System.out.printf("%.2f Kg equivale a %.2f lbs\n", valorEntrada, valorSaida); 
                break;
            case 2:
                System.out.println("Digite o valor (lbs) que deseja converter: ");
                valorEntrada = scan.nextDouble();
                valorSaida = valorEntrada * 0.453592;
                System.out.printf("%.2f lbs equivale a %.2f Kg", valorEntrada, valorSaida); 
                break;
            case 3:
                continuar = false;
                System.out.println("Encerrando programa...");
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
        }
        scan.close();
    }
}
