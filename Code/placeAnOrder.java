import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class placeAnOrder extends JFrame{
    private JTextField textField1;
    private JButton submitButton;
    private JPanel panel5;
    placeAnOrder(Pharmacy p1){
        setTitle("Main Menu");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel5);
        setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(textField1.getText());
                boolean x = p1.placeOrder(ID);
                if(x == true) {
                    JOptionPane.showMessageDialog(null, "Order placed returing to Main Menu!");
                    frame2 f2 = new frame2(p1);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Drug not found returing to Main Menu!");
                    frame2 f2 = new frame2(p1);
                    dispose();
                }
            }
        });
    }
}
