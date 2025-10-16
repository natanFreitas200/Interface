import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("K19 - Java 00");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel rotulo = new JLabel();
        rotulo.setText("Usuário: ");
        panel.add(rotulo);
        JTextField textField = new JTextField(20);
        panel.add(textField);

        JLabel rot = new JLabel();
        rot.setText("Senha: ");
        panel.add(rot);

        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordField);



        JCheckBox checkBox1 = new JCheckBox("Rafael Consentino");
        JCheckBox checkBox2 = new JCheckBox("Jonas Hirata");
        JCheckBox checkBox3 = new JCheckBox("Marcelo Martins");
        panel.add(checkBox1); panel.add(checkBox2); panel.add(checkBox3);

        String[] items = new String[3];
        items[0] = "Rafael Consentino";
        items[1] = "Jonas Hirata";
        items[2] = "Marcelo Martins";
        JComboBox comboBox = new JComboBox(items);
        panel.add(comboBox);


        JButton button1 = new JButton("ACAO1");
        JButton button2 = new JButton("ACAO2");

        MeuListener listener = new MeuListener();

        button1.addActionListener(listener); button2.addActionListener(listener);
        panel.add(button1); panel.add(button2);

        frame.setSize(300,200);
        frame.setVisible(true);

        frame.setContentPane(panel);
    }

}
