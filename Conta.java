import javax.swing.JOptionPane;

public class Conta {
    float saldo;
    float poupança;
    float investimento;
    float sacar;

    public void VerConta() {
        JOptionPane.showMessageDialog(null,
                "Saldo: " + saldo + "\nPoupança: " + poupança + "\nInvestimento: " + investimento);
    }

    public void Depositar(float valor) {
        saldo += valor;
        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso.");
    }

    public void Sacar(float valor) {
        if (saldo < valor) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } else {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.");
        }
    }

    public void Investir(float valor) {
        if (saldo < valor) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } else {
            saldo -= valor;
            investimento += valor;
            float rendimento = investimento * 0.01f;
            investimento += rendimento;
            JOptionPane.showMessageDialog(null, "Valor aplicado com sucesso (Rendimento de 1% ao mês).");
        }
    }

    public void Poupar(float valor) {
        if (saldo < valor) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } else {
            saldo -= valor;
            poupança += valor;
            JOptionPane.showMessageDialog(null, "Valor poupado com sucesso.");
        }
    }

    public void ResgatarPoupança(float valor) {
        if (poupança < valor) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        } else {
            poupança -= valor;
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Valor resgatado com sucesso.");
        }
    }

    public void ResgatarInvestimento(float valor) {
        if (investimento < valor) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "\nValor aplicado: " + investimento + "\nValor Resgatado: " + valor + "\n\nSaldo após resgate: "
                            + (investimento - valor));
            investimento -= valor;
            saldo += valor;
        }
    }
}
