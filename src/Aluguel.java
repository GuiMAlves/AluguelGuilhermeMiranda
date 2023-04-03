import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class Aluguel extends JFrame {
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        aluguel.preparatelaJFormattedTextField();
    }
    private void preparatelaJFormattedTextField() {
        Container janela = getContentPane();
        janela.setLayout(null);

        JLabel labelDadosdocliente = new JLabel("Dados do Cliente");
        JLabel labelNomeCl = new JLabel("Nome" );
        JLabel labelCPF = new JLabel("CPF ");
        JLabel labelTel = new JLabel("Tel ");
        JLabel labelDadosdocarro = new JLabel("Dados do carro");
        JLabel labelModelo = new JLabel("Modelo");
        JLabel labelPlaca = new JLabel("Placa");
        JLabel labelAno = new JLabel("Ano");
        JLabel labelLocacao = new JLabel("Data da locação");
        JLabel labelEntrega = new JLabel("Data de Entrega");

        labelDadosdocliente.setBounds(50,0,100,20);
        labelNomeCl.setBounds(50,40,100,20);
        labelCPF.setBounds(50,80,100,20);
        labelTel.setBounds(50,120,100,20);
        labelDadosdocarro.setBounds(50,160,100,20);
        labelModelo.setBounds(50,200,100,20);
        labelPlaca.setBounds(50,240,100,20);
        labelAno.setBounds(50,280,100,20);
        labelLocacao.setBounds(50,320,100,20);
        labelEntrega.setBounds(50,360,100,20);

        janela.add(labelDadosdocliente);
        janela.add(labelNomeCl);
        janela.add(labelCPF);
        janela.add(labelTel);
        janela.add(labelDadosdocarro);
        janela.add(labelModelo);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelLocacao);
        janela.add(labelEntrega);

        MaskFormatter mascaraCPF = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraLocacao = null;
        MaskFormatter mascaraEntrega = null;

        try {
            mascaraCPF = new MaskFormatter("#########-##");
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraPlaca = new MaskFormatter("UUU-#U##");
            mascaraAno = new MaskFormatter("####");
            mascaraLocacao = new MaskFormatter("##/##/####");
            mascaraEntrega = new MaskFormatter("##/##/####");
            mascaraCPF.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('_');
            mascaraAno.setPlaceholderCharacter('_');
            mascaraLocacao.setPlaceholderCharacter('_');
            mascaraEntrega.setPlaceholderCharacter('_');
        }
        catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }


        JTextField txtNome = new JTextField();
        JFormattedTextField jformattedTextCPF = new JFormattedTextField(mascaraCPF);
        JFormattedTextField jformattedTextTel = new JFormattedTextField(mascaraTel);
        JTextField txtModelo = new JTextField();
        JFormattedTextField jformattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jformattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jformattedTextLocacao = new JFormattedTextField(mascaraLocacao);
        JFormattedTextField jformattedTextEntrega = new JFormattedTextField(mascaraEntrega);
        JButton salvar = new JButton("Salvar");
        txtNome.setBounds(150,40,100,20);
        jformattedTextCPF.setBounds(150,80,100,20);
        jformattedTextTel.setBounds(150,120,100,20);
        txtModelo.setBounds(150,200,100,20);
        jformattedTextPlaca.setBounds(150,240,100,20);
        jformattedTextAno.setBounds(150,280,100,20);
        jformattedTextLocacao.setBounds(150,320,100,20);
        jformattedTextEntrega.setBounds(150,360,100,20);
        salvar.setBounds(150,380,100,20);
        salvar.addActionListener(new ComportamentoBotao(salvar));

        janela.add(txtNome);
        janela.add(jformattedTextCPF);
        janela.add(jformattedTextTel);
        janela.add(txtModelo);
        janela.add(jformattedTextPlaca);
        janela.add(jformattedTextAno);
        janela.add(jformattedTextLocacao);
        janela.add(jformattedTextEntrega);
        janela.add(salvar);

        setSize(400,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
