import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastroProduto extends JFrame {
    private JPanel cadProduto;
    private JLabel lblNome;
    private JLabel lblCodigo;
    private JLabel lblPreco;
    private JLabel lblQtdeEstoque;
    private JButton btnCadastrar;
    private JTextField txtNome;
    private JTextField txtCodigo;
    private JTextField txtPreco;

    private JTextField txtQdeEstoque;


    public cadastroProduto() {
        iniciarComponentes();
        createListener();

}


    public void iniciarComponentes(){
        setTitle("Cadasto de Produtos");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(cadProduto);
        setVisible(true);
    }


    public void createListener(){
    btnCadastrar.addActionListener(new ActionListener() {
        @Override

        public void actionPerformed(ActionEvent e) {
            validarCadastro();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado");
        }


        public void validarCadastro(){
            String nome = txtNome.getText();
            String codigo = txtCodigo.getText();
            String qtdeEstoque = txtQdeEstoque.getText();
            String preco = txtPreco.getText();

            JOptionPane.showMessageDialog(btnCadastrar, "Produtos Cadastrados"
                    + "nome" + nome + "\n"
                    + "codigo" + codigo + "\n"
                    + "qtdeEstoque" + qtdeEstoque + "\n"
                    + "Preço" + preco + "\n");







        }
    });


}
}
