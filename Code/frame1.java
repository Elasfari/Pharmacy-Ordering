import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame1 extends JFrame {
    String choice = null;
    Pharmacy mainPharmacy;
    frame1(){
        Pharmacy mainPharmacy = new Pharmacy();
        setTitle("Welcome to Pharmacy Ordering System");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setVisible(true);
        okButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            choice = textField1.getText();
                if (Integer.parseInt(choice) <= 0) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number!");
                }
                else {
                    mainPharmacy.setCapacity(Integer.parseInt(choice));
                    frame2 f2 = new frame2(mainPharmacy);
                    dispose();
                }
            }
        });

    }
    private JLabel title;
    private JTextField textField1;
    private JButton okButton;
    private JPanel panel1;
}
