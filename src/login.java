import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private  JPanel telaInicial;
    private JButton btnOK;
    private JTextField txtUsuario;
    private JPasswordField pswSenha;
    private JLabel lblSenha;
    private JLabel lvlUsuario;

    public login() {
        iniciarComponentes();
        criarListeners();

    }

    public void iniciarComponentes(){
        setTitle("Tela de login");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telaInicial);
        setVisible(true);
    }

    public void criarListeners()

    {

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();

            }


        });


    }

    private void validarLogin() {
        String usuario = txtUsuario.getText();
        String senha = new String(pswSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("admin")) {

            telaMenu menu = new telaMenu();
                menu.setVisible(true);
                dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuario Incorreto");
        }

        {

        }


    }

    }




