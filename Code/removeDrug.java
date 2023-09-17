import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class removeDrug extends JFrame{
    private JTextField textField1;
    private JButton submitButton;
    private JPanel panel4;
    removeDrug(Pharmacy p1){
        setTitle("Remove Drug");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel4);
        setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(textField1.getText());
                boolean x = p1.removeDrug(ID);
                if(x==true) {
                    JOptionPane.showMessageDialog(null, "Drug removed returing to Main Menu!");
                    frame2 f2 = new frame2(p1);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "ID doesn't exist returing to Main Menu!");
                    frame2 f2 = new frame2(p1);
                    dispose();
                }
            }
        });
    }
}
