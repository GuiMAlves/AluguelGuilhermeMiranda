import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComportamentoBotao implements ActionListener {
    private JButton botao;

    //vamos criar um objeto comportamento botao
    public ComportamentoBotao(JButton botao) {
        this.botao = botao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Aluguel realizado com sucesso");
    }
}
