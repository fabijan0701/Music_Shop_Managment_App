package app.gui;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame{
    private JTextField jtfEmailInput;
    private JPasswordField jtfPasswordInput;
    private JButton btnSubmit;
    private JButton btnCancel;
    private JComboBox cmbModeSelection;
    private JPanel loginPanel;
    private JLabel lblOutput;

    public LoginForm() {
        setupFrame();
    }

    public void setupFrame() {

        Dimension def = new Dimension(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        loginPanel.setMinimumSize(def);
        setMinimumSize(def);
        setUndecorated(true);
        setLocationRelativeTo(null);

        cmbModeSelection.addItem("Employee");
        cmbModeSelection.addItem("Store administrator");
        cmbModeSelection.addItem("Administrator");

        add(loginPanel);
        pack();
    }
}
