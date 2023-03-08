import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaMenu  extends JFrame{
    private JPanel pnlTelaMenu;
    private JButton btnCadUsuario;
    private JButton btnCadProdutos;


public telaMenu() {
    iniciarComponentes();
    createListener();
    btnCadProdutos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}

    public void iniciarComponentes(){
        setTitle("Menu");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaMenu);
        setVisible(true);
    }
    public void createListener(){
    btnCadUsuario.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            CadastroUsuario cadUsr = new CadastroUsuario();
            cadUsr.setVisible(true);
        }
    });
    btnCadProdutos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cadastroProduto casPro = new cadastroProduto();
            setVisible(true);
            dispose();



        }
    });
}

    public static void main(String[] args) {
        telaMenu tela = new telaMenu();
    }
}
