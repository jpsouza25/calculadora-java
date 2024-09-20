import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        switch (escolha) {
            case 1:
                System.out.println("Resultado: " + calculadora.adicionar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + calculadora.subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + calculadora.multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + calculadora.dividir(num1, num2));
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}


