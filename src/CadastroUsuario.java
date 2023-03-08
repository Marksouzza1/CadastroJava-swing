import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuario extends JFrame {
    private JPanel cadUsuario;
    private JTextField txtNome;
    private JTextField txtSobrenome;
    private JTextField txtSetor;
    private JTextField txtFuncao;
    private JTextField txtLogin;
    private JLabel lblNome;
    private JLabel lblSobrenome;
    private JLabel lblSetor;
    private JLabel lblFuncao;
    private JLabel lblLogin;
    private JPasswordField pswSenha;
    private JLabel lblSenha;
    private JButton btnCadastrar;
public CadastroUsuario() {
    iniciarComponentes();
    createListener();
}
    public void iniciarComponentes(){
    setTitle("Cadasto de Usuarios");
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(cadUsuario);
    setVisible(true);
    }
    public void createListener(){

    btnCadastrar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            validarCadastro();
        }
     private void validarCadastro(){

            String nome = txtNome.getText();
            String sobrenome= txtSobrenome.getText();
            String setor = txtSetor.getText();
            String funcao = txtFuncao.getText();
            String login = txtLogin.getText();
            String Senha = new String(pswSenha.getPassword());

            if (login.equals("admin") && Senha.equals("admin") ){
                CadastroUsuario cadUsuario = new CadastroUsuario();
                cadUsuario.setVisible(true);
                dispose();




            }else {
                JOptionPane.showMessageDialog( btnCadastrar,"Dados Cadastrados"
                        + "Nome" +nome + "\n"
                        + "Sobrenome" + sobrenome+ "\n"
                        + "setor" + setor+ "\n"
                        + "funcao " + funcao + "\n"
                        + "Login" + login+ "\n");
            }



     }

    });

}


}
