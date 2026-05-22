import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos dados deseja lançar? (Enter para 1): ");
        String entrada = scanner.nextLine().trim();

        int quantidade;
        if (entrada.isEmpty()) {
            quantidade = 1;
        } else {
            try {
                quantidade = Integer.parseInt(entrada);
                if (quantidade < 1) {
                    System.out.println("Valor inválido. Usando 1 dado.");
                    quantidade = 1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Usando 1 dado.");
                quantidade = 1;
            }
        }

        System.out.println("\n=== Resultado do lançamento ===\n");

        int[] valores = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            valores[i] = (int)(Math.random() * 6) + 1;
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Dado " + (i + 1) + ":");
            imprimirDado(valores[i]);
            System.out.println();
        }

        if (quantidade > 1) {
            int soma = 0;
            System.out.print("Valores sorteados: ");
            for (int i = 0; i < quantidade; i++) {
                soma += valores[i];
                System.out.print(valores[i] + (i < quantidade - 1 ? " + " : ""));
            }
            System.out.println(" = " + soma);
        }

        scanner.close();
    }

    public static void imprimirDado(int valor) {
        switch (valor) {
            case 1:
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   o   |");
                System.out.println("|       |");
                System.out.println("+-------+");
                break;
            case 2:
                System.out.println("+-------+");
                System.out.println("| o     |");
                System.out.println("|       |");
                System.out.println("|     o |");
                System.out.println("+-------+");
                break;
            case 3:
                System.out.println("+-------+");
                System.out.println("| o     |");
                System.out.println("|   o   |");
                System.out.println("|     o |");
                System.out.println("+-------+");
                break;
            case 4:
                System.out.println("+-------+");
                System.out.println("| o   o |");
                System.out.println("|       |");
                System.out.println("| o   o |");
                System.out.println("+-------+");
                break;
            case 5:
                System.out.println("+-------+");
                System.out.println("| o   o |");
                System.out.println("|   o   |");
                System.out.println("| o   o |");
                System.out.println("+-------+");
                break;
            case 6:
                System.out.println("+-------+");
                System.out.println("| o   o |");
                System.out.println("| o   o |");
                System.out.println("| o   o |");
                System.out.println("+-------+");
                break;
        }
    }
}