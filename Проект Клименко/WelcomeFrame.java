import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeFrame {
    private JButton welcomeButton;

    public WelcomeFrame(){
        welcomeButton = new JButton("OK");


        welcomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainForm mf = new MainForm();
            }
        });
    }
}
