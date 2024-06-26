import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float valor_poupança = 0;
        float valor_investimento = 0;
        float valor_depositar = 0;
        float valor_retirar = 0;
        int op = 0;

        Cliente cliente1 = new Cliente();
        Conta conta_cliente1 = new Conta();

        int result = JOptionPane.showConfirmDialog(null, "\nClique em OK para criar uma conta.     \n\n\n",
                "Bem vindo ao Bank",
                JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            cliente1.CadastrarCliente(JOptionPane.showInputDialog("Informe o seu nome: "),
                    Integer.parseInt(JOptionPane.showInputDialog("Informe o seu CPF: ")),
                    Integer.parseInt(JOptionPane.showInputDialog("Informe o seu CEP: ")),
                    Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: ")),
                    JOptionPane.showInputDialog("Informe o seu endereço: "));
        } else if (result == JOptionPane.CANCEL_OPTION) {
            System.exit(0);
        } else {
            System.out.println("Nenhuma opção selecionada");
        }

        while (op != 99) {

            String[] options = { "Informe uma opção: \n\n",
                    "1 - Dados do Cliente",
                    "2 - Deposito",
                    "3 - Saque",
                    "4 - Investimento",
                    "5 - Poupança",
                    "6 - Dados da Conta",
                    "99 - Encerrar\n\n" };

            op = Integer.parseInt(JOptionPane.showInputDialog(options));
            int n;

            switch (op) {
                case 1:
                    cliente1.DadosCliente();
                    break;
                case 2:
                    valor_depositar = Float
                            .parseFloat(JOptionPane.showInputDialog("Informe o valor do Deposito: "));
                    conta_cliente1.Depositar(valor_depositar);
                    break;
                case 3:
                    valor_retirar = Float
                            .parseFloat(JOptionPane.showInputDialog("Saldo na Conta: " + conta_cliente1.saldo
                                    + "\n\nInforme o valor do Saque: "));
                    conta_cliente1.Sacar(valor_retirar);
                    break;
                case 4:
                    n = Integer.parseInt(JOptionPane.showInputDialog("1 - Investir\n2 - Resgatar Investimento"));
                    if (n == 1) {
                        valor_investimento = Float
                                .parseFloat(JOptionPane.showInputDialog("Saldo na Conta: " + conta_cliente1.saldo
                                        + "\n\nInforme o valor que deseja Investir: "));
                        conta_cliente1.Investir(valor_investimento);
                    } else if (n == 2) {
                        valor_investimento = Float
                                .parseFloat(JOptionPane.showInputDialog("Investimento: " + conta_cliente1.investimento
                                        + "\n\nInforme o valor que deseja Resgatar: "));
                        conta_cliente1.ResgatarInvestimento(valor_investimento);
                    } else
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
                case 5:
                    n = Integer.parseInt(JOptionPane.showInputDialog("1 - Poupar\n2 - Resgatar Poupança"));
                    if (n == 1) {
                        valor_poupança = Float
                                .parseFloat(JOptionPane.showInputDialog("Saldo na Conta: " + conta_cliente1.saldo
                                        + "\n\nInforme o valor que deseja Poupar: "));
                        conta_cliente1.Poupar(valor_poupança);
                    } else if (n == 2) {
                        valor_poupança = Float
                                .parseFloat(JOptionPane.showInputDialog("Poupança: " + conta_cliente1.poupança
                                        + "\n\nInforme o valor que deseja Resgatar: "));
                        conta_cliente1.ResgatarPoupança(valor_poupança);
                    } else
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
                case 6:
                    conta_cliente1.VerConta();
                    break;
                case 99:
                    JOptionPane.showMessageDialog(null, "Programa Encerrado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }
}
