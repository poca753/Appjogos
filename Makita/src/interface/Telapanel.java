
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPanel {
    puclic class TelaPanel extends JPanel
    implements ActionListener{
        private JPanel telas;
        private  CardLayout controleTelas;
        private JFrame janelas;

        public TelaPanel(JPanel telas, JFrame janelas){
            this.telas = telas;
            this.controleTelas =(CardLayout) telas.getLayout();
            this.janelas = janelas;
            this.setBackground(color.decode(#202028));

            imagem botaofechar = new imegm(";")
        }
       
    }
}