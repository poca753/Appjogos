package teste;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalPanel  extends TelaPanel{
    public PrincipalPanel(JPanel telas, JFrame janela){
        super(telas, janela)
        JLabel mensagem = new JLabel("alguma mensagem");

        JButton botao = new JButton("botão")
        botao.addActionListener(this);
    
        this.add(botao);
        this.add(mensagem);
    }
}
