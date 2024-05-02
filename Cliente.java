import javax.swing.JOptionPane;

public class Cliente {
    String nome;
    int CPF;
    int CEP;
    int idade;
    String endereço;

    public void CadastrarCliente(String nome, int CPF, int CEP, int idade, String endereço) {
        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Cliente menor de idade, não é possível a abertura de conta!");
            System.exit(0);
        } else {
            this.nome = nome;
            this.CPF = CPF;
            this.CEP = CEP;
            this.idade = idade;
            this.endereço = endereço;
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
        }
    }

    public void DadosCliente() {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + "\nCPF: " + CPF + "\nCEP: " + CEP + "\nIdade: " + idade + "\nEndereço: " + endereço);
    }
}