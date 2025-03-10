import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Account conta = new Account();

        System.out.println("Olá, seja bem-vindo!\nPara começar a usar o terminal, cadastre sua conta bancária inserindo os dados solicitados.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome de usuário: ");
        String username = scanner.nextLine();

        System.out.print("Agência: ");
        String agence = scanner.nextLine();

        System.out.print("Número da conta: ");
        int accountNumber = scanner.nextInt();

        conta.setData(username, agence, accountNumber);
        welcome(conta);
        mainMenu(conta);
        scanner.close();
    }
    public static void showInfo(Account conta){
        System.out.println("---------------------------------------------\n\n");
        System.out.printf("Nome de usuário: %s \n ", conta.getName());
        System.out.printf("Agência da conta: %s \n", conta.getAgence());
        System.out.printf("Número da conta: %d \n", conta.getAccountNumber());
        System.out.printf("Saldo da conta: %.2f \n\n", conta.getAmount());
    }
    public static void mainMenu(Account conta){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\n---------------------------------------------\n MENU PRINCIPAL .\n\n\n Digite 1 para ver os dados da conta\n\n Digite 2 para realizar um depósito\n\n Digite 3 para realizar um saque\n\nDigite a opção desejada: ", conta.name);
        int choice = scanner.nextInt();

        if(choice == 1){
            showInfo(conta);
            askToContinue(conta);
        }else if(choice == 2){
            System.out.println("---------------------------------------------\nDigite o valor que deseja depositar na sua conta: ");
            float value = scanner.nextFloat();
            conta.deposit(value);
           askToContinue(conta);
        }else if(choice == 3){
            System.out.printf("---------------------------------------------\nDigite um valor de até %.2f que deseja resgatar da sua conta\n Valor desejado: ", conta.getAmount());
            float value = scanner.nextFloat();
            if(value > conta.getAmount()){
                System.err.println("O valor de saque tem que ser menor que o saldo na conta!");
                askToContinue(conta);
            }else{
                conta.withdraw(value);
                askToContinue(conta);
            }
        }

        scanner.close();
    }
    public static void askToContinue(Account conta){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Caso deseje continuar a usar do terminal digite 1, caso queira encerrar a aplicação digite 2\n Digite a opção: ");
        int choice = scanner.nextInt();
        if(choice ==1){
            mainMenu(conta);
        }else{
            System.out.println("Aplicação encerrada!");
        }
        scanner.close();
    }
    public static void welcome(Account conta){
        System.out.printf("--------------------------------------------------\nOlá %s! Obrigado por criar uma conta em nosso banco, sua agência é %s, o número da conta %d e seu saldo %.2f\n\n Para realizar um depósito ou saque basta acessar o menu abaixo.", conta.getName(), conta.getAgence(), conta.getAccountNumber(), conta.getAmount());
    }
}

