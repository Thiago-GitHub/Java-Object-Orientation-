import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        conta conta1 = new conta();
        contaespecial conta2 = new contaespecial();
        int opcao;
        double valor;
        do{
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.println("Digite uma opção: ");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    valor = input.nextDouble();
                    conta1.depositar(valor);
                    conta2.depositar(valor);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    valor = input.nextDouble();
                    conta1.sacar(valor);
                    conta2.sacar(valor);
                    break;
                case 3:
                    System.out.println("Saldo conta 1: "+conta1.getSaldo());
                    System.out.println("Saldo conta 2: "+conta2.getSaldo());
                    break;
            }
        } while(opcao != 4);
    }
}
